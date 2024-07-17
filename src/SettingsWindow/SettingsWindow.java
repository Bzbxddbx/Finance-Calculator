package SettingsWindow;
import Config.Config;

import javax.swing.*;
import java.awt.*;

public class SettingsWindow extends JFrame {
    public SettingsWindow() {
        setVisible(true);   // Видимость
        setResizable(false);    // Возможность изменения размера окна

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);    // Возможность закрытия программы

        setSize(590, 320);  // Сохранение размера окна
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        setLocation(dimension.width / 2 + 295, dimension.height / 2 - 160); // Сохранение рассположения окна

        setTitle("Settings"); // Сохранение названия для окна

        add(new SettingsWindowGUI());
    }
}
