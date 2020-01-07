package GUI;

import Code.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
    private JLabel letterCurrentlabel;
    private JLabel loadLogoImage;
    private JLabel saveLogoImage;
    private JLabel currentGameModeLogoImage;
    private JButton cornersButton;
    private Icon cornersIcon = new ImageIcon("src/Images/CornersLogo.png");
    private Icon diagonalIcon = new ImageIcon("src/Images/DiagonalLogo.png");
    private Icon horizontalIcon = new ImageIcon("src/Images/HorizontalLogo.png");
    private Icon verticalIcon = new ImageIcon("src/Images/VerticalLogo.png");
    private Icon lIcon = new ImageIcon("src/Images/LLogo.png");
    private Icon tIcon = new ImageIcon("src/Images/TLogo.png");
    private Icon xIcon = new ImageIcon("src/Images/XLogo.png");
    private Icon allIcon = new ImageIcon("src/Images/AllLogo.png");

    private Game currentGame = new Game();
    private String currentMode;
    Thread backgroundProcesses;

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

                // Reset game GUI
                resetGameGUI();

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

                // Reset game GUI
                resetGameGUI();

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

                // Reset game GUI
                resetGameGUI();

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

                // Reset game GUI
                resetGameGUI();

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

                // Reset game GUI
                resetGameGUI();

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

                // Reset game GUI
                resetGameGUI();

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

                // Reset game GUI
                resetGameGUI();

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

                // Reset game GUI
                resetGameGUI();

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
                setUpBackgroundProcesses();

                backgroundProcesses.start();
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
                    displayDefeatScreen();

                    // Change amount of losses
                    // changeLosses();
                }
                else
                {
                    // Display win panel
                    displayVictoryScreen();

                    // Change amount of wins
                    // changeWins();
                }

                // Interrupt background processes
                backgroundProcesses.interrupt();

                currentGame.reset();
            }
        });

        // Click on b1 (0,0)
        b1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(b1, 0, 0);
            }
        });

        // Click on b2 (1,0)
        b2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(b2, 1, 0);
            }
        });

        // Click on b3 (2,0)
        b3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(b3, 2, 0);
            }
        });

        // Click on b4 (3,0)
        b4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(b4, 3, 0);
            }
        });

        // Click on b5 (4,0)
        b5.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(b5, 4, 0);
            }
        });

        // Click on i1 (0,1)
        i1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(i1, 0, 1);
            }
        });

        // Click on i2 (1,1)
        i2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(i2, 1, 1);
            }
        });

        // Click on i3 (2,1)
        i3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(i3, 2, 1);
            }
        });

        // Click on i4 (3,1)
        i4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(i4, 3, 1);
            }
        });

        // Click on i5 (4,1)
        i5.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(i5, 4, 1);
            }
        });

        // Click on n1 (0,2)
        n1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(n1, 0, 2);
            }
        });

        // Click on n2 (1,2)
        n2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(n2, 1, 2);
            }
        });

        // Click on n3 (2,2)
        n3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(n3, 2, 2);
            }
        });

        // Click on n4 (3,2)
        n4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(n4, 3, 2);
            }
        });

        // Click on n5 (4,2)
        n5.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(n5, 4, 2);
            }
        });

        // Click on g1 (0,3)
        g1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(g1, 0, 3);
            }
        });

        // Click on g2 (1,3)
        g2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(g2, 1, 3);
            }
        });

        // Click on g3 (2,3)
        g3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(g3, 2, 3);
            }
        });

        // Click on g4 (3,3)
        g4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(g4, 3, 3);
            }
        });

        // Click on g5 (4,3)
        g5.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(g5, 4, 3);
            }
        });

        // Click on o1 (0,4)
        o1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(o1, 0, 4);
            }
        });

        // Click on o2 (1,4)
        o2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(o2, 1, 4);
            }
        });

        // Click on o3 (2,4)
        o3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(o3, 2, 4);
            }
        });

        // Click on o4 (3,4)
        o4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(o4, 3, 4);
            }
        });

        // Click on o5 (4,4)
        o5.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(o5, 4, 4);
            }
        });
    }

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
        n3.setText("FREE");
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

    // Sets all buttons on board GUI back to nothing
    public void resetGameGUI()
    {
        // Set Bs
        b1.setText("");
        b1.setBackground(Color.decode("#00667F"));
        b2.setText("");
        b2.setBackground(Color.decode("#00667F"));
        b3.setText("");
        b3.setBackground(Color.decode("#00667F"));
        b4.setText("");
        b4.setBackground(Color.decode("#00667F"));
        b5.setText("");
        b5.setBackground(Color.decode("#00667F"));

        // Sets Is
        i1.setText("");
        i1.setBackground(Color.decode("#00667F"));
        i2.setText("");
        i2.setBackground(Color.decode("#00667F"));
        i3.setText("");
        i3.setBackground(Color.decode("#00667F"));
        i4.setText("");
        i4.setBackground(Color.decode("#00667F"));
        i5.setText("");
        i5.setBackground(Color.decode("#00667F"));

        // Set Ns
        n1.setText("");
        n1.setBackground(Color.decode("#00667F"));
        n2.setText("");
        n2.setBackground(Color.decode("#00667F"));
        n3.setText("");
        n3.setBackground(Color.decode("#00667F"));
        n4.setText("");
        n4.setBackground(Color.decode("#00667F"));
        n5.setText("");
        n5.setBackground(Color.decode("#00667F"));

        // Set Gs
        g1.setText("");
        g1.setBackground(Color.decode("#00667F"));
        g2.setText("");
        g2.setBackground(Color.decode("#00667F"));
        g3.setText("");
        g3.setBackground(Color.decode("#00667F"));
        g4.setText("");
        g4.setBackground(Color.decode("#00667F"));
        g5.setText("");
        g5.setBackground(Color.decode("#00667F"));

        // Set Os
        o1.setText("");
        o1.setBackground(Color.decode("#00667F"));
        o2.setText("");
        o2.setBackground(Color.decode("#00667F"));
        o3.setText("");
        o3.setBackground(Color.decode("#00667F"));
        o4.setText("");
        o4.setBackground(Color.decode("#00667F"));
        o5.setText("");
        o5.setBackground(Color.decode("#00667F"));

        letterCurrentlabel.setText("");
        callerCurrentLabel.setText("");
    }

    public void setGameStatsVisibility(boolean bool)
    {
        if(bool)
        {
            callerLogoImage.setVisible(true);
            callerCurrentLabel.setVisible(true);
            letterCurrentlabel.setVisible(true);
            startGameLogoImage.setVisible(true);
            bingoLogoImage.setVisible(true);
            setGameModeIcon();
            currentGameModeLogoImage.setVisible(true);
        }
        else
        {
            callerLogoImage.setVisible(false);
            callerCurrentLabel.setVisible(false);
            letterCurrentlabel.setVisible(false);
            startGameLogoImage.setVisible(false);
            bingoLogoImage.setVisible(false);
            currentGameModeLogoImage.setVisible(false);
        }
    }

    // Alters button on board depending on circumstances, during game
    public void alterTileGUI(JButton button, int x, int y)
    {
        // If it's selected (and user is therefore clicking to deselect)
        if(currentGame.getPlayerBoard().getMap()[x][y].getSelected())
        {
            currentGame.getPlayerBoard().getMap()[x][y].setSelected(false);
            button.setBackground(Color.decode("#00667F"));
        }
        // If it's not selected (and user is therefore clicking to select)
        else
        {
            currentGame.getPlayerBoard().getMap()[x][y].setSelected(true);
            button.setBackground(Color.decode("#F85238"));
        }
    }

    // Displays win panel
    public void displayVictoryScreen()
    {
        switchPanel.removeAll();
        switchPanel.add(winPanel);
        switchPanel.repaint();
        switchPanel.revalidate();

        changeWins();
    }

    // Displays loss panel
    public void displayDefeatScreen()
    {
        switchPanel.removeAll();
        switchPanel.add(lossPanel);
        switchPanel.repaint();
        switchPanel.revalidate();

        changeLosses();
        backgroundProcesses.interrupt();
    }

    // Give a number from the caller, get the letter that goes with it
    public String getDisplayLetter(int called)
    {
        // B
        if(called >= 1 && called <= 15)
        {
            return "B";
        }
        // I
        else if(called >= 16 && called <= 30)
        {
            return "I";
        }
        // N
        else if(called >= 31 && called <= 45)
        {
            return "N";
        }
        // G
        else if(called >= 46 && called <= 60)
        {
            return "G";
        }
        // O
        else if(called >= 61 && called <= 75)
        {
            return "O";
        }
        else
        {
            System.out.println("Error: Value out of range");
            return "-1";
        }
    }

    // Changes the amount of wins in GUI and in Player class
    public void changeWins()
    {
        int winsListed = Integer.parseInt(winsTotalLabel.getText());
        currentGame.getPlayer().setTotalWins(winsListed);

        int updatedWins = (currentGame.getPlayer().getTotalWins()) + 1;
        winsTotalLabel.setText(Integer.toString(updatedWins));
        currentGame.getPlayer().setTotalWins(updatedWins);
    }

    // Changes the amount of losses in GUI and in Player class
    public void changeLosses()
    {
        int lossesListed = Integer.parseInt(lossesTotalLabel.getText());
        currentGame.getPlayer().setTotalLosses(lossesListed);

        int updatedLosses = (currentGame.getPlayer().getTotalLosses()) + 1;
        lossesTotalLabel.setText(Integer.toString(updatedLosses));
        currentGame.getPlayer().setTotalLosses(updatedLosses);
    }

    // Sets up thread for background caller
    public void setUpBackgroundProcesses()
    {
        // Thread for caller
        backgroundProcesses = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                int called = currentGame.runCaller();

                String letter = getDisplayLetter(called);

                // Change letter label (once, so we don't have to wait for first call)
                letterCurrentlabel.setText(letter);

                // Change caller label (once, so we don't have to wait for first call)
                callerCurrentLabel.setText(Integer.toString(called));

                // Now continue for the next 74
                for(int i = 0; i < 74; i++)
                {
                    // Sleep for 6 seconds
                    try
                    {
                        Thread.sleep(6000);
                    }
                    catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                    called = currentGame.runCaller();

                    letter = getDisplayLetter(called);

                    // Change letter label
                    letterCurrentlabel.setText(letter);

                    // Change caller label
                    callerCurrentLabel.setText(Integer.toString(called));

                    // NPC plays game
                    currentGame.getNpcPlayer().scanBoard(Integer.parseInt(callerCurrentLabel.getText()), currentGame);

                    // If NPC won
                    if(currentGame.getNpcPlayer().checkForBingo(currentGame))
                    {
                        setGameStatsVisibility(false);
                        displayDefeatScreen();
                        break;
                    }
                }

                backgroundProcesses.interrupt();
            }
        });
    }

    public void setGameModeIcon()
    {
        if(currentMode.equals("corners"))
        {
            currentGameModeLogoImage.setIcon(cornersIcon);
        }
        else if(currentMode.equals("diagonal"))
        {
            currentGameModeLogoImage.setIcon(diagonalIcon);
        }
        else if(currentMode.equals("horizontal"))
        {
            currentGameModeLogoImage.setIcon(horizontalIcon);
        }
        else if(currentMode.equals("vertical"))
        {
            currentGameModeLogoImage.setIcon(verticalIcon);
        }
        else if(currentMode.equals("l"))
        {
            currentGameModeLogoImage.setIcon(lIcon);
        }
        else if(currentMode.equals("t"))
        {
            currentGameModeLogoImage.setIcon(tIcon);
        }
        else if(currentMode.equals("x"))
        {
            currentGameModeLogoImage.setIcon(xIcon);
        }
        else if(currentMode.equals("all"))
        {
            currentGameModeLogoImage.setIcon(allIcon);
        }
        else
        {
            System.out.println("Error: Invalid game mode");
            currentGameModeLogoImage.setVisible(false);
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
