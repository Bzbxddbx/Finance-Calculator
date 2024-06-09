import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FinanceCalculatorGUITest {
    static JFrame jFrame = getFrame();
    static JPanel jPanel = new JPanel();
    static JPanel jPanel2 = new JPanel();

    static Font font = new Font("Arial", Font.BOLD, 24);

    public static void main(String[] args) {
        jPanel.setBounds(0, 0, 590, 60);
        jPanel2.setBounds(0, 60, 590, 260);
        jFrame.add(jPanel);
        jFrame.add(jPanel2);

        jPanel.setLayout(null);

        JButton button = new JButton("Calc");
        button.setBounds(460, 20, 80, 30);
        JTextField textField = new JTextField(20);
        textField.setBounds(50, 20, 400, 30);

        jPanel.add(textField);
        jPanel.add(button);

        buttonAction(button, textField);

        jPanel.repaint();
    }

    static void buttonAction(JButton b, JTextField tf) {
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    jPanel2.removeAll();
                    int sum = Integer.parseInt(tf.getText());

                    String pocketMoney = String.format("На карманные расходы: %.2f рублей", sum * 0.15f);
                    String averageTarget = String.format("На мечту: %.2f рублей", sum * 0.55f);
                    String investments = String.format("На инвестиции: %.2f рублей", sum * 0.30f);

                    JLabel label1 = new JLabel(pocketMoney);
                    label1.setBounds(50, 70, 600, 30);
                    label1.setFont(font);

                    JLabel label2 = new JLabel(averageTarget);
                    label2.setBounds(50, 100, 600, 30);
                    label2.setFont(font);

                    JLabel label3 = new JLabel(investments);
                    label3.setBounds(50, 130, 600, 30);
                    label3.setFont(font);

                    jPanel2.add(label1);
                    jPanel2.add(label2);
                    jPanel2.add(label3);
                }
                catch (NumberFormatException n) {
                    JLabel label4 = new JLabel("Пожалуйста, введите число");
                    label4.setBounds(50, 70, 600, 30);
                    label4.setFont(font);

                    jPanel2.add(label4);
                }

                jPanel.repaint();
                jPanel2.repaint();
            }
        });
    }

    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {};

        jFrame.setVisible(true);
        jFrame.setResizable(false);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setSize(590, 320);
        jFrame.setLocation(dimension.width / 2 - 350, dimension.height / 2 - 200);
        jFrame.setTitle("My first window");
        return jFrame;
    }
}
