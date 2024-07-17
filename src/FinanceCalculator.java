import javax.swing.*;
import java.awt.*;

public class FinanceCalculator extends JFrame {
    private final static GUI gui = new GUI();

    public FinanceCalculator() {
        setVisible(true);
        setResizable(false);
        setSize(590, 320);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        setLocation(dimension.width / 2 - 295, dimension.height / 2 - 160);

        setTitle("Finance calculator");

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        add(gui);
    }

    // Основной метод main
    public static void main(String[] args) {
        FinanceCalculator fc = new FinanceCalculator();

        gui.repaint();
    }
}


