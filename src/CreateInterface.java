import Config.Config;

import javax.swing.*;

public class CreateInterface {
    public static JTextField inputField;

    public static JLabel pocketMoneyLabel;
    public static JLabel averageTargetLabel;
    public static JLabel investmentsLabel;
    public static JLabel titleLabel;

    public static JButton calculateButton;
    public static JButton settingsButton;
    public static JButton button;

    public CreateInterface() {
        createButtons();
        createTextField();
        createLabels();
    }

    private static void createButtons() {
        calculateButton = new JButton("Calc");
        calculateButton.setBounds(450, 20, 80, 30);
        calculateButton.setBackground(Config.turquoise);
        calculateButton.setForeground(Config.mainColor);
        calculateButton.setBorder(null);
        calculateButton.setFont(Config.font);

        settingsButton = new JButton("⚙");
        settingsButton.setBounds(40, 220, 40, 40);
        settingsButton.setFont(Config.buttonFont);
        settingsButton.setBackground(Config.turquoise);
        settingsButton.setForeground(Config.mainColor);
        settingsButton.setBorder(null);

        button = new JButton();
        button.setBounds(100, 220, 40, 40);
        button.setFont(Config.buttonFont);
        button.setBackground(Config.turquoise);
        button.setBorder(null);
    }

    private static void createLabels() {
        // Создание пока что пустых надписей
        pocketMoneyLabel = new JLabel(" ");
        averageTargetLabel = new JLabel(" ");
        investmentsLabel = new JLabel(" ");
        setLabelsFont();    // Сохранение шрифта для надписей

        // Установка размера и расположения надписей
        pocketMoneyLabel.setBounds(40, 70, 600, 30);
        averageTargetLabel.setBounds(40, 110, 600, 30);
        investmentsLabel.setBounds(40, 150, 600, 30);

        titleLabel = new JLabel("Finance calculator");
        titleLabel.setBounds(266, 220, 300, 40);
        titleLabel.setForeground(Config.turquoise);
        titleLabel.setFont(Config.titleFont);
    }

    private static void setLabelsFont() {
        pocketMoneyLabel.setFont(Config.font);
        averageTargetLabel.setFont(Config.font);
        investmentsLabel.setFont(Config.font);

        pocketMoneyLabel.setForeground(Config.turquoise);
        averageTargetLabel.setForeground(Config.turquoise);
        investmentsLabel.setForeground(Config.turquoise);
    }

    private static void createTextField() {
        inputField = new JTextField(20);
        inputField.setBounds(40, 20, 400, 30);
        inputField.setBackground(Config.textFieldColor);
        inputField.setForeground(Config.turquoise);
        inputField.setBorder(null);
        inputField.setFont(Config.font);
    }

    public void addInterfaceElements(GUI gui) {
        gui.add(inputField);
        gui.add(pocketMoneyLabel);
        gui.add(averageTargetLabel);
        gui.add(investmentsLabel);
        gui.add(titleLabel);
        gui.add(calculateButton);
        gui.add(settingsButton);
        gui.add(button);
    }
}
