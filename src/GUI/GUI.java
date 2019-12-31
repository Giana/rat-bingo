package GUI;

import java.awt.*;
import javax.swing.*;

public class GUI extends JFrame
{
    public GUI()
    {
        setVisible(true);                                 // Make visible
        setSize(650, 700);                   // Set size
        setLocationRelativeTo(null);                      // Center on screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // Close application
    }
}
