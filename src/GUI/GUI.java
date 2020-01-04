package GUI;

import Code.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class GUI
{
    private JPanel parentPanel;
    private JPanel leftMenuPanel;
    private JPanel rightMenuPanel;
    private JPanel switchPanel;
    private JPanel mainMenuPanel;
    private JPanel gamePanel;
    private JPanel winPanel;
    private JPanel lossPanel;
    private JLabel ratBingoLogoImage;
    private JLabel ratBingoVictoryLogoImage;
    private JLabel ratBingoDefeatLogoImage;
    private JPanel boardPanel;
    private JButton b1;
    private JButton i1;
    private JButton n1;
    private JButton g1;
    private JButton o1;
    private JButton b2;
    private JButton i2;
    private JButton n2;
    private JButton g2;
    private JButton o2;
    private JButton b3;
    private JButton i3;
    private JButton n3;
    private JButton g3;
    private JButton o3;
    private JButton b4;
    private JButton i4;
    private JButton n4;
    private JButton g4;
    private JButton o4;
    private JButton b5;
    private JButton i5;
    private JButton n5;
    private JButton g5;
    private JButton o5;
    private JLabel bLogoImage;
    private JLabel iLogoImage;
    private JLabel nLogoImage;
    private JLabel gLogoImage;
    private JLabel oLogoImage;
    private JLabel smallRatBingoLogoImage;
    private JPanel gameModeSelectionPanel;
    private JLabel newGameTitleLogoImage;
    private JLabel cornersLogoImage;
    private JLabel diagonalLogoImage;
    private JLabel horizontalLogoImage;
    private JLabel verticalLogoImage;
    private JLabel lLogoImage;
    private JLabel tLogoImage;
    private JLabel xLogoImage;
    private JLabel allLogoImage;
    private JLabel helpLogoImage;
    private JLabel creditsLogoImage;
    private JLabel emptySpaceLabel;
    private JPanel infoPanel;
    private JLabel winsLogoImage;
    private JLabel winsTotalLabel;
    private JLabel lossesLogoImage;
    private JLabel lossesTotalLabel;
    private JLabel callerLogoImage;
    private JLabel callerCurrentLabel;
    private JLabel bingoLogoImage;
    private JPanel creditsPanel;
    private JPanel helpPanel;
    private JLabel startGameLogoImage;
    private JButton cornersButton;

    private Game currentGame = new Game();
    private String currentMode;

    public GUI()
    {
        // Click small "Rat Bingo" logo on left panel
        smallRatBingoLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Remove things you should just see in game
                setGameStatsVisibility(false);

                // Display main menu panel
                switchPanel.removeAll();
                switchPanel.add(mainMenuPanel);
                switchPanel.repaint();
                switchPanel.revalidate();
            }
        });

        // Click "Corners" on left panel
        cornersLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Set game mode
                currentMode = "corners";

                // Display things you need to see while in game
                setGameStatsVisibility(true);

                // Reset board GUI
                resetBoardGUI();

                // Display game panel
                switchPanel.removeAll();
                switchPanel.add(gamePanel);
                switchPanel.revalidate();
                switchPanel.repaint();
            }
        });

        // Click "Diagonal" on left panel
        diagonalLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Set game mode
                currentMode = "diagonal";

                // Display things you need to see while in game
                setGameStatsVisibility(true);

                // Reset board GUI
                resetBoardGUI();

                // Display game panel
                switchPanel.removeAll();
                switchPanel.add(gamePanel);
                switchPanel.revalidate();
                switchPanel.repaint();
            }
        });

        // Click "Horizontal" on left panel
        horizontalLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Set game mode
                currentMode = "horizontal";

                // Display things you need to see while in game
                setGameStatsVisibility(true);

                // Reset board GUI
                resetBoardGUI();

                // Display game panel
                switchPanel.removeAll();
                switchPanel.add(gamePanel);
                switchPanel.revalidate();
                switchPanel.repaint();
            }
        });

        // Click "Vertical" on left panel
        verticalLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Set game mode
                currentMode = "vertical";

                // Display things you need to see while in game
                setGameStatsVisibility(true);

                // Reset board GUI
                resetBoardGUI();

                // Display game panel
                switchPanel.removeAll();
                switchPanel.add(gamePanel);
                switchPanel.revalidate();
                switchPanel.repaint();
            }
        });

        // Click "L" on left panel
        lLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Set game mode
                currentMode = "l";

                // Display things you need to see while in game
                setGameStatsVisibility(true);

                // Reset board GUI
                resetBoardGUI();

                // Display game panel
                switchPanel.removeAll();
                switchPanel.add(gamePanel);
                switchPanel.revalidate();
                switchPanel.repaint();
            }
        });

        // Click "T" on left panel
        tLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Set game mode
                currentMode = "t";

                // Display things you need to see while in game
                setGameStatsVisibility(true);

                // Reset board GUI
                resetBoardGUI();

                // Display game panel
                switchPanel.removeAll();
                switchPanel.add(gamePanel);
                switchPanel.revalidate();
                switchPanel.repaint();
            }
        });

        // Click "X" on left panel
        xLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Set game mode
                currentMode = "x";

                // Display things you need to see while in game
                setGameStatsVisibility(true);

                // Reset board GUI
                resetBoardGUI();

                // Display game panel
                switchPanel.removeAll();
                switchPanel.add(gamePanel);
                switchPanel.revalidate();
                switchPanel.repaint();
            }
        });

        // Click "All" on left panel
        allLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Set game mode
                currentMode = "all";

                // Display things you need to see while in game
                setGameStatsVisibility(true);

                // Reset board GUI
                resetBoardGUI();

                // Display game panel
                switchPanel.removeAll();
                switchPanel.add(gamePanel);
                switchPanel.revalidate();
                switchPanel.repaint();
            }
        });

        // Click "Credits" on left panel
        creditsLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Things you should just see in game
                setGameStatsVisibility(false);

                // Display credits panel
                switchPanel.removeAll();
                switchPanel.add(creditsPanel);
                switchPanel.repaint();
                switchPanel.revalidate();
            }
        });

        // Click "Help" on left panel
        helpLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Remove things you should just see in game
                setGameStatsVisibility(false);

                // Display help panel
                switchPanel.removeAll();
                switchPanel.add(helpPanel);
                switchPanel.repaint();
                switchPanel.revalidate();
            }
        });

        // Click "StartGame" on right panel
        startGameLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Remove things you should just see in game
                startGameLogoImage.setVisible(false);

                // Create game of current game mode
                currentGame = new Game(currentMode);

                initBoardGUI();
            }
        });

        // Click "BINGO!" on right panel
        bingoLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                String winState = currentGame.checkWin(currentGame.getPlayerBoard());

                setGameStatsVisibility(false);

                if(winState.equals("N/A"))
                {
                    // Display loss panel
                    switchPanel.removeAll();
                    switchPanel.add(lossPanel);
                    switchPanel.repaint();
                    switchPanel.revalidate();
                }
                else
                {
                    // Display win panel
                    switchPanel.removeAll();
                    switchPanel.add(winPanel);
                    switchPanel.repaint();
                    switchPanel.revalidate();
                }
            }
        });

        // Click on b1 (0,0)
        b1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                currentGame.getPlayerBoard().getMap()[0][0].setSelected(true);
            }
        });

        // Click on b2 (1,0)
        b2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                currentGame.getPlayerBoard().getMap()[1][0].setSelected(true);
            }
        });
    }

/*    // Puts every JButton into "buttons" to be referenced
    public void createButtonList()
    {
        for(Component x: boardPanel.getComponents())
        {
            if(x instanceof JButton)
            {
                buttons.add((JButton) x);
            }
        }
    }*/

    // Gives values to player board buttons on GUI
    public void initBoardGUI()
    {
        // Set Bs
        b1.setText(Integer.toString(currentGame.getPlayerBoard().getMap()[0][0].getNumber()));
        b2.setText(Integer.toString(currentGame.getPlayerBoard().getMap()[1][0].getNumber()));
        b3.setText(Integer.toString(currentGame.getPlayerBoard().getMap()[2][0].getNumber()));
        b4.setText(Integer.toString(currentGame.getPlayerBoard().getMap()[3][0].getNumber()));
        b5.setText(Integer.toString(currentGame.getPlayerBoard().getMap()[4][0].getNumber()));

        // Sets Is
        i1.setText(Integer.toString(currentGame.getPlayerBoard().getMap()[0][1].getNumber()));
        i2.setText(Integer.toString(currentGame.getPlayerBoard().getMap()[1][1].getNumber()));
        i3.setText(Integer.toString(currentGame.getPlayerBoard().getMap()[2][1].getNumber()));
        i4.setText(Integer.toString(currentGame.getPlayerBoard().getMap()[3][1].getNumber()));
        i5.setText(Integer.toString(currentGame.getPlayerBoard().getMap()[4][1].getNumber()));

        // Set Ns
        n1.setText(Integer.toString(currentGame.getPlayerBoard().getMap()[0][2].getNumber()));
        n2.setText(Integer.toString(currentGame.getPlayerBoard().getMap()[1][2].getNumber()));
        n3.setText(Integer.toString(currentGame.getPlayerBoard().getMap()[2][2].getNumber()));
        n4.setText(Integer.toString(currentGame.getPlayerBoard().getMap()[3][2].getNumber()));
        n5.setText(Integer.toString(currentGame.getPlayerBoard().getMap()[4][2].getNumber()));

        // Set Gs
        g1.setText(Integer.toString(currentGame.getPlayerBoard().getMap()[0][3].getNumber()));
        g2.setText(Integer.toString(currentGame.getPlayerBoard().getMap()[1][3].getNumber()));
        g3.setText(Integer.toString(currentGame.getPlayerBoard().getMap()[2][3].getNumber()));
        g4.setText(Integer.toString(currentGame.getPlayerBoard().getMap()[3][3].getNumber()));
        g5.setText(Integer.toString(currentGame.getPlayerBoard().getMap()[4][3].getNumber()));

        // Set Os
        o1.setText(Integer.toString(currentGame.getPlayerBoard().getMap()[0][4].getNumber()));
        o2.setText(Integer.toString(currentGame.getPlayerBoard().getMap()[1][4].getNumber()));
        o3.setText(Integer.toString(currentGame.getPlayerBoard().getMap()[2][4].getNumber()));
        o4.setText(Integer.toString(currentGame.getPlayerBoard().getMap()[3][4].getNumber()));
        o5.setText(Integer.toString(currentGame.getPlayerBoard().getMap()[4][4].getNumber()));
    }

    // Sets all buttons on board GUI back to 0
    public void resetBoardGUI()
    {
        // Set Bs
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");

        // Sets Is
        i1.setText("");
        i2.setText("");
        i3.setText("");
        i4.setText("");
        i5.setText("");

        // Set Ns
        n1.setText("");
        n2.setText("");
        n3.setText("");
        n4.setText("");
        n5.setText("");

        // Set Gs
        g1.setText("");
        g2.setText("");
        g3.setText("");
        g4.setText("");
        g5.setText("");

        // Set Os
        o1.setText("");
        o2.setText("");
        o3.setText("");
        o4.setText("");
        o5.setText("");
    }

    public void setGameStatsVisibility(boolean bool)
    {
        if(bool)
        {
            callerLogoImage.setVisible(true);
            callerCurrentLabel.setVisible(true);
            startGameLogoImage.setVisible(true);
            bingoLogoImage.setVisible(true);
        }
        else
        {
            callerLogoImage.setVisible(false);
            callerCurrentLabel.setVisible(false);
            startGameLogoImage.setVisible(false);
            bingoLogoImage.setVisible(false);
        }
    }

    public static void main(String[] args)
    {
        JFrame gameFrame = new JFrame("Rat Bingo");
        gameFrame.setContentPane(new GUI().parentPanel);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameFrame.pack();
        gameFrame.setVisible(true);
    }
}
