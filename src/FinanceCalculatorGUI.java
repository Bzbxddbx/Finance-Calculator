import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class FinanceCalculatorGUI {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    static Font font = new Font("Arial", Font.BOLD, 24);

    private static JFrame jFrame = getFrame();
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
        inputPanel = new JPanel();
        inputPanel.setBounds(0, 0, 590, 60);
        inputPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 15));

        resultPanel = new JPanel();
        resultPanel.setBounds(0, 60, 590, 260);
        resultPanel.setLayout(new GridLayout(3, 1, 0, 20));

        inputPanel.setLayout(null);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(460, 20, 80, 30);
        calculateButton.setFont(font);

        inputField = new JTextField(20);
        inputField.setBounds(50, 20, 400, 30);

        pocketMoneyLabel = new JLabel(" ");
        averageTargetLabel = new JLabel(" ");
        investmentsLabel = new JLabel(" ");
        setLabelsFont();

        inputPanel.add(inputField);
        inputPanel.add(calculateButton);

        resultPanel.add(pocketMoneyLabel);
        resultPanel.add(averageTargetLabel);
        resultPanel.add(investmentsLabel);

        jFrame.add(inputPanel);
        jFrame.add(resultPanel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });

        inputPanel.repaint();
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

    private static void setLabelsFont() {
        pocketMoneyLabel.setFont(font);
        averageTargetLabel.setFont(font);
        investmentsLabel.setFont(font);
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {};

        jFrame.setVisible(true);
        jFrame.setResizable(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setSize(590, 320);
        jFrame.setLocation(dimension.width / 2 - 350, dimension.height / 2 - 200);
        jFrame.setTitle("My first window");
        return jFrame;
    }
}

