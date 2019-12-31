package GUI;

import java.awt.*;
import javax.swing.*;

public class GUI
{

    public GUI()
    {
        // Game frame
        JFrame gameFrame = new JFrame();                            // Initialize
        gameFrame.setVisible(true);                                 // Make visible
        gameFrame.setSize(650, 700);                   // Set size
        gameFrame.setLocationRelativeTo(null);                      // Center on screen
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // Close application


        JPanel mainMenuPanel = new JPanel();
        mainMenuPanel.setLayout(new BorderLayout());
        gameFrame.add(mainMenuPanel);
    }
}
