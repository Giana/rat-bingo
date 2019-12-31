package GUI;

import java.awt.*;
import javax.swing.*;

public class GUI
{

    public GUI()
    {
        JFrame gameFrame = new JFrame();
        JPanel mainMenuPanel = new JPanel();
        mainMenuPanel.setLayout(new BorderLayout());
        gameFrame.add(mainMenuPanel);
        gameFrame.setVisible(true);
        JButton b = new JButton("Press");
        mainMenuPanel.add(b);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
