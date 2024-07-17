package SettingsWindow;
import Config.Config;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SettingsWindowGUI extends JPanel {
    private static JTextField pocketMoneyField;
    private static JTextField averageTargetField;
    private static JTextField investmentsField;

    private static JButton saveButton;

    private final static Config config = new Config();

    public SettingsWindowGUI() {
        setBounds(0, 0, 590, 320);   // Установка размера и расположения панели
        setBackground(Config.mainColor);
        setLayout(null);

        createTextFields();
        createButtons();

        add(pocketMoneyField);
        add(averageTargetField);
        add(investmentsField);
        add(saveButton);

        saveButton.addActionListener(new ActionListener() {    // Анонимный класс для действий при нажатии кнопки
            @Override
            public void actionPerformed(ActionEvent e) {
                savePercents();
            }
        });
    }

    private static void savePercents() {
        config.percent1 = Double.parseDouble(pocketMoneyField.getText());
        config.percent2 = Double.parseDouble(averageTargetField.getText());
        config.percent3 = Double.parseDouble(investmentsField.getText());
    }

    private static void createTextFields() {
        pocketMoneyField = new JTextField(4);
        pocketMoneyField.setBounds(40, 20, 80, 30);
        pocketMoneyField.setBackground(Config.textFieldColor);
        pocketMoneyField.setForeground(Config.turquoise);
        pocketMoneyField.setFont(Config.font);
        pocketMoneyField.setBorder(null);

        averageTargetField = new JTextField();
        averageTargetField.setBounds(140, 20, 80, 30);
        averageTargetField.setBackground(Config.textFieldColor);
        averageTargetField.setForeground(Config.turquoise);
        averageTargetField.setFont(Config.font);
        averageTargetField.setBorder(null);

        investmentsField = new JTextField();
        investmentsField.setBounds(240, 20, 80, 30);
        investmentsField.setBackground(Config.textFieldColor);
        investmentsField.setForeground(Config.turquoise);
        investmentsField.setFont(Config.font);
        investmentsField.setBorder(null);
    }

    private static void createButtons() {
        saveButton = new JButton("Save");
        saveButton.setBounds(340, 20, 80, 30);
        saveButton.setBackground(Config.turquoise);
        saveButton.setForeground(Config.mainColor);
        saveButton.setBorder(null);
        saveButton.setFont(Config.font);
    }
}
