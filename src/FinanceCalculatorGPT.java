import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class FinanceCalculatorGPT {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private static final Font font = new Font("Arial", Font.BOLD, 24);

    private static JFrame frame;
    private static JPanel inputPanel;
    private static JPanel resultPanel;
    private static JTextField inputField;
    private static JLabel pocketMoneyLabel;
    private static JLabel averageTargetLabel;
    private static JLabel investmentsLabel;

    public static void main(String[] args) {
        createGUI();
    }

    private static void createGUI() {
        frame = new JFrame("Financial Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(590, 320);
        frame.setResizable(false);
        frame.setLayout(null); // Используем layout manager

        inputPanel = new JPanel();
        inputPanel.setBounds(0, 0, 590, 60);
        inputPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 15));

        resultPanel = new JPanel();
        resultPanel.setBounds(0, 60, 590, 260);
        resultPanel.setLayout(new GridLayout(3, 1, 0, 20)); // Используем GridLayout

        inputField = new JTextField(20);
        inputField.setFont(font);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setFont(font);

        pocketMoneyLabel = new JLabel(" ");
        averageTargetLabel = new JLabel(" ");
        investmentsLabel = new JLabel(" ");
        setLabelsFont();

        inputPanel.add(inputField);
        inputPanel.add(calculateButton);

        resultPanel.add(pocketMoneyLabel);
        resultPanel.add(averageTargetLabel);
        resultPanel.add(investmentsLabel);

        frame.add(inputPanel);
        frame.add(resultPanel);

        centerWindow(frame);
        frame.setVisible(true);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });
    }

    private static void calculate() {
        try {
            double sum = Double.parseDouble(inputField.getText());

            double pocketMoney = sum * 0.15;
            double averageTarget = sum * 0.55;
            double investments = sum * 0.30;

            pocketMoneyLabel.setText(String.format("На карманные расходы: %s рублей", df.format(pocketMoney)));
            averageTargetLabel.setText(String.format("На мечту: %s рублей", df.format(averageTarget)));
            investmentsLabel.setText(String.format("На инвестиции: %s рублей", df.format(investments)));

        } catch (NumberFormatException ex) {
            pocketMoneyLabel.setText("Пожалуйста, введите корректное число");
            averageTargetLabel.setText("");
            investmentsLabel.setText("");
        }
    }

    private static void centerWindow(JFrame frame) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (screenSize.width - frame.getWidth()) / 2;
        int y = (screenSize.height - frame.getHeight()) / 2;
        frame.setLocation(x, y);
    }

    private static void setLabelsFont() {
        pocketMoneyLabel.setFont(font);
        averageTargetLabel.setFont(font);
        investmentsLabel.setFont(font);
    }
}
