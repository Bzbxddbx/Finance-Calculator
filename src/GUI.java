import Config.Config;
import SettingsWindow.SettingsWindow;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class GUI extends JPanel {
    private static final DecimalFormat df = new DecimalFormat("0.00");

    private final static Config config = new Config();
    private final static CreateInterface i = new CreateInterface();

    public GUI() {
        setBounds(0, 0, 590, 320);   // Установка размера и расположения панели
        setBackground(Config.mainColor);
        setLayout(null);

        i.addInterfaceElements(this);
        buttonFunctional();
    }

    private static void buttonFunctional() {
        CreateInterface.calculateButton.addActionListener(new ActionListener() {    // Анонимный класс для действий при нажатии кнопки
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();    // Вызов метода для создания labels из класса resultPanel
            }
        });

        CreateInterface.settingsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SettingsWindow sw = new SettingsWindow();
            }
        });

        CreateInterface.button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private static void calculate() {
        try {
            double value = Double.parseDouble(CreateInterface.inputField.getText());   // Получение числа с поля ввода

            // Создание переменных, которые хранят в себе количество денег, умноженное на соответственные проценты
            double pocketMoney = value * config.percent1;
            double averageTarget = value * config.percent2;
            double investments = value * config.percent3;

            // Изменение текста в надписях
            CreateInterface.pocketMoneyLabel.setText(String.format("На карманные расходы: %s рублей", df.format(pocketMoney)));
            CreateInterface.averageTargetLabel.setText(String.format("На мечту: %s рублей", df.format(averageTarget)));
            CreateInterface.investmentsLabel.setText(String.format("На инвестиции: %s рублей", df.format(investments)));

        } catch (NumberFormatException ex) {    // Проверка на ввод не числа
            CreateInterface.pocketMoneyLabel.setText("Пожалуйста, введите число");
            CreateInterface.averageTargetLabel.setText("");
            CreateInterface.investmentsLabel.setText("");
        }
    }
}
