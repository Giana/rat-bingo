package GUI;

import Code.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

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
    private JLabel winsTotalLabel;
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
    private JPanel savedPanel;
    private JLabel largeSavedLogoImage;
    private JPanel shopPanel;
    private JPanel optionsPanel;
    private JPanel menuButtonsPanel;
    private JLabel optionsLogoImage;
    private JLabel shopLogoImage;
    private JPanel collectionPanel;
    private JLabel collectionLogoImage;
    private JLabel ratShopLogoImage;
    private JPanel shopItemsPanel;
    private JLabel hoodedRatImage;
    private JLabel agoutiRatImage;
    private JLabel berkshireRatImage;
    private JLabel roanRatImage;
    private JLabel albinoRatImage;
    private JButton hoodedRatButton;
    private JButton agoutiRatButton;
    private JButton berkshireRatButton;
    private JButton roanRatButton;
    private JButton albinoRatButton;
    private JButton siameseRatButton;
    private JButton hairlessRatButton;
    private JButton russianBlueRatButton;
    private JButton patchworkRatButton;
    private JButton manxRatButton;
    private JLabel siameseRatImage;
    private JLabel hairlessRatImage;
    private JLabel russianBlueRatImage;
    private JLabel patchworkRatImage;
    private JLabel manxRatImage;
    private JPanel collectionItemsPanel;
    private JLabel hoodedRatCollectionImage;
    private JLabel agoutiRatCollectionImage;
    private JLabel berkshireRatCollectionImage;
    private JLabel roanRatCollectionImage;
    private JLabel albinoRatCollectionImage;
    private JLabel siameseRatCollectionImage;
    private JLabel hairlessRatCollectionImage;
    private JLabel russianBlueRatCollectionImage;
    private JLabel patchworkRatCollectionImage;
    private JLabel manxRatCollectionImage;
    private JLabel hoodedRatCollectionTotal;
    private JLabel agoutiRatCollectionTotal;
    private JLabel berkshireRatCollectionTotal;
    private JLabel roanRatCollectionTotal;
    private JLabel albinoRatCollectionTotal;
    private JLabel siameseRatCollectionTotal;
    private JLabel hairlessRatCollectionTotal;
    private JLabel russianBlueRatCollectionTotal;
    private JLabel patchworkRatCollectionTotal;
    private JLabel manxRatCollectionTotal;
    private JPanel bottomLeftMenuPanel;
    private JPanel gameModeSelectionPanel;
    private JLabel newGameTitleLogoImage;
    private JLabel dollarSymbolLabel;
    private JLabel dollarsTotalLabel;
    private JPanel infoPanel;
    private JPanel callerLabelsPanel;
    private JLabel winsLogoImage;
    private JLabel lossesLogoImage;
    private JPanel purchasedPanel;
    private JPanel purchasedItemsPanel;
    private JLabel purchasedRatImage;
    private JLabel purchasedRatLogo;
    private JLabel purchasedShopLogoImage;
    private JPanel creditsTextPanel;
    private JTextPane creditsTextPanePanel1;
    private JPanel helpTextPanel;
    private JTextPane creditsTextPanePanel2;
    private JTextPane creditsTextPanePanel3;
    private JTextPane question1;
    private JTextPane answer1;
    private JTextPane question2;
    private JTextPane answer2;
    private JTextPane question3;
    private JTextPane answer3;
    private JTextPane question4;
    private JTextPane answer4;
    private JTextPane question5;
    private JTextPane answer5;
    private JTextPane question6;
    private JTextPane answer6;
    private JPanel optionsItemsPanel;
    private JLabel deleteSaveLogoImage;
    private JLabel toggleSoundLogoImage;
    private JLabel callerDelayLogoImage;
    private JPanel callerDelayItems;
    private JLabel oneSecondLogoImage;
    private JLabel twoSecondsLogoImage;
    private JLabel threeSecondsLogoImage;
    private JLabel fourSecondsLogoImage;
    private JLabel fiveSecondsLogoImage;
    private JLabel sixSecondsLogoImage;
    private JLabel sevenSecondsLogoImage;
    private JLabel eightSecondsLogoImage;
    private JLabel nineSecondsLogoImage;
    private JPanel confirmationPanel;
    private JLabel areYouSureLogoImage;
    private JPanel confirmationItemsPanel;
    private JLabel noGoBackLogoImage;
    private JLabel yesDeleteLogoImage;
    private JButton cornersButton;

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

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    ratSqueakSound();
                }
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

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound1();
                }
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

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound1();
                }
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

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound1();
                }
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

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound1();
                }
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

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound1();
                }
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

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound1();
                }
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

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound1();
                }
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

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound1();
                }
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

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound1();
                }
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

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound1();
                }
            }
        });

        // Click "StartGame" on right panel
        startGameLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                startGameLogoImage.setVisible(false);
                bingoLogoImage.setVisible(true);

                // Create game of current game mode
                currentGame = new Game(currentMode);

                initBoardGUI();
                setUpBackgroundProcesses();
                changeDollars(false);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    startGameSound();
                }

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
                    changeLosses();

                    // Play sound if enabled
                    if(currentGame.getSoundStatus())
                    {
                        defeatSound();
                    }
                }
                else
                {
                    // Display win panel
                    displayVictoryScreen();

                    // Change amount of wins
                    changeWins();

                    // Change amount of dollars
                    changeDollars(true);

                    // Play sound if enabled
                    if(currentGame.getSoundStatus())
                    {
                        victorySound();
                    }
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

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound2();
                }
            }
        });

        // Click on b2 (1,0)
        b2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(b2, 1, 0);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound2();
                }
            }
        });

        // Click on b3 (2,0)
        b3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(b3, 2, 0);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound2();
                }
            }
        });

        // Click on b4 (3,0)
        b4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(b4, 3, 0);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound2();
                }
            }
        });

        // Click on b5 (4,0)
        b5.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(b5, 4, 0);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound2();
                }
            }
        });

        // Click on i1 (0,1)
        i1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(i1, 0, 1);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound2();
                }
            }
        });

        // Click on i2 (1,1)
        i2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(i2, 1, 1);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound2();
                }
            }
        });

        // Click on i3 (2,1)
        i3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(i3, 2, 1);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound2();
                }
            }
        });

        // Click on i4 (3,1)
        i4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(i4, 3, 1);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound2();
                }
            }
        });

        // Click on i5 (4,1)
        i5.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(i5, 4, 1);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound2();
                }
            }
        });

        // Click on n1 (0,2)
        n1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(n1, 0, 2);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound2();
                }
            }
        });

        // Click on n2 (1,2)
        n2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(n2, 1, 2);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound2();
                }
            }
        });

        // Click on n3 (2,2)
        n3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(n3, 2, 2);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound2();
                }
            }
        });

        // Click on n4 (3,2)
        n4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(n4, 3, 2);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound2();
                }
            }
        });

        // Click on n5 (4,2)
        n5.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(n5, 4, 2);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound2();
                }
            }
        });

        // Click on g1 (0,3)
        g1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(g1, 0, 3);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound2();
                }
            }
        });

        // Click on g2 (1,3)
        g2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(g2, 1, 3);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound2();
                }
            }
        });

        // Click on g3 (2,3)
        g3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(g3, 2, 3);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound2();
                }
            }
        });

        // Click on g4 (3,3)
        g4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(g4, 3, 3);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound2();
                }
            }
        });

        // Click on g5 (4,3)
        g5.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(g5, 4, 3);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound2();
                }
            }
        });

        // Click on o1 (0,4)
        o1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(o1, 0, 4);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound2();
                }
            }
        });

        // Click on o2 (1,4)
        o2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(o2, 1, 4);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound2();
                }
            }
        });

        // Click on o3 (2,4)
        o3.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(o3, 2, 4);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound2();
                }
            }
        });

        // Click on o4 (3,4)
        o4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(o4, 3, 4);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound2();
                }
            }
        });

        // Click on o5 (4,4)
        o5.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                alterTileGUI(o5, 4, 4);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound2();
                }
            }
        });

        // Click on "Load" on left panel
        loadLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                try
                {
                    currentGame.loadGame();

                    winsTotalLabel.setText(Integer.toString(currentGame.getPlayer().getTotalWins()));
                    lossesTotalLabel.setText(Integer.toString(currentGame.getPlayer().getTotalLosses()));
                    dollarsTotalLabel.setText(Integer.toString(currentGame.getPlayer().getTotalDollars()));
                    hoodedRatCollectionTotal.setText(Integer.toString(currentGame.getPlayer().getTotalHooded()));
                    agoutiRatCollectionTotal.setText(Integer.toString(currentGame.getPlayer().getTotalAgouti()));
                    berkshireRatCollectionTotal.setText(Integer.toString(currentGame.getPlayer().getTotalBerkshire()));
                    roanRatCollectionTotal.setText(Integer.toString(currentGame.getPlayer().getTotalRoan()));
                    albinoRatCollectionTotal.setText(Integer.toString(currentGame.getPlayer().getTotalAlbino()));
                    siameseRatCollectionTotal.setText(Integer.toString(currentGame.getPlayer().getTotalSiamese()));
                    hairlessRatCollectionTotal.setText(Integer.toString(currentGame.getPlayer().getTotalHairless()));
                    russianBlueRatCollectionTotal.setText(Integer.toString(currentGame.getPlayer().getTotalRussianBlue()));
                    patchworkRatCollectionTotal.setText(Integer.toString(currentGame.getPlayer().getTotalPatchwork()));
                    manxRatCollectionTotal.setText(Integer.toString(currentGame.getPlayer().getTotalManx()));

                    // Play sound if enabled
                    if(currentGame.getSoundStatus())
                    {
                        saveLoadSound();
                    }

                }
                catch(IOException ex)
                {
                    ex.printStackTrace();
                }
            }
        });

        // TODO: create a delete save function
        // Click on "Save" on left panel
        saveLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                try
                {
                    establishFunds();
                    establishCollection();

                    currentGame.saveGame();

                    displaySavedScreen();

                    // Remove things you should just see in game
                    setGameStatsVisibility(false);

                    // Play sound if enabled
                    if(currentGame.getSoundStatus())
                    {
                        saveLoadSound();
                    }
                }
                catch(IOException ex)
                {
                    ex.printStackTrace();
                }
            }
        });

        // Click on "Collection" on main menu panel
        collectionLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                displayCollectionScreen();

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound1();
                }
            }
        });

        // Click on "Options" on main menu panel
        optionsLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                displayOptionsScreen();

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound1();
                }
            }
        });

        // Click on "Shop" on main menu panel
        shopLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                displayShopScreen();

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound1();
                }
            }
        });


        // Click hooded rat image on shop panel
        hoodedRatImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    ratSqueakSound();
                }
            }
        });

        // Click agouti rat image on shop panel
        agoutiRatImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    ratSqueakSound();
                }
            }
        });

        // Click berkshire rat image on shop panel
        berkshireRatImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    ratSqueakSound();
                }
            }
        });

        // Click roan rat image on shop panel
        roanRatImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    ratSqueakSound();
                }
            }
        });

        // Click albino rat image on shop panel
        albinoRatImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    ratSqueakSound();
                }
            }
        });

        // Click siamese rat image on shop panel
        siameseRatImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    ratSqueakSound();
                }
            }
        });

        // Click hairless rat image on shop panel
        hairlessRatImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    ratSqueakSound();
                }
            }
        });

        // Click Russian blue rat image on shop panel
        russianBlueRatImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    ratSqueakSound();
                }
            }
        });

        // Click patchwork rat image on shop panel
        patchworkRatImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    ratSqueakSound();
                }
            }
        });

        // Click manx rat image on shop panel
        manxRatImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    ratSqueakSound();
                }
            }
        });

        // Click hooded rat purchase button
        hoodedRatButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(makePurchase(5))
                {
                    changeHooded();
                    displayPurchasedScreen("hooded");
                }
            }
        });

        // Click agouti rat purchase button
        agoutiRatButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(makePurchase(10))
                {
                    changeAgouti();
                    displayPurchasedScreen("agouti");
                }
            }
        });

        // Click berkshire rat purchase button
        berkshireRatButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(makePurchase(15))
                {
                    changeBerkshire();
                    displayPurchasedScreen("berkshire");
                }
            }
        });

        // Click roan rat purchase button
        roanRatButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(makePurchase(20))
                {
                    changeRoan();
                    displayPurchasedScreen("roan");
                }
            }
        });

        // Click albino rat purchase button
        albinoRatButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(makePurchase(25))
                {
                    changeAlbino();
                    displayPurchasedScreen("albino");
                }
            }
        });

        // Click siamese rat purchase button
        siameseRatButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(makePurchase(30))
                {
                    changeSiamese();
                    displayPurchasedScreen("siamese");
                }
            }
        });

        // Click hairless rat purchase button
        hairlessRatButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(makePurchase(35))
                {
                    changeHairless();
                    displayPurchasedScreen("hairless");
                }
            }
        });

        // Click Russian blue rat purchase button
        russianBlueRatButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(makePurchase(40))
                {
                    changeRussianBlue();
                    displayPurchasedScreen("russian blue");
                }
            }
        });

        // Click patchwork rat purchase button
        patchworkRatButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(makePurchase(45))
                {
                    changePatchwork();
                    displayPurchasedScreen("patchwork");
                }
            }
        });

        // Click manx rat purchase button
        manxRatButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                if(makePurchase(50))
                {
                    changeManx();
                    displayPurchasedScreen("manx");
                }
            }
        });

        // Click hooded rat collection image
        hoodedRatCollectionImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    ratSqueakSound();
                }
            }
        });

        // Click agouti rat collection image
        agoutiRatCollectionImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    ratSqueakSound();
                }
            }
        });

        // Click berkshire rat collection image
        berkshireRatCollectionImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    ratSqueakSound();
                }
            }
        });

        // Click roan rat collection image
        roanRatCollectionImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    ratSqueakSound();
                }
            }
        });

        // Click albino rat collection image
        albinoRatCollectionImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    ratSqueakSound();
                }
            }
        });

        // Click siamese rat collection image
        siameseRatCollectionImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    ratSqueakSound();
                }
            }
        });

        // Click hairless rat collection image
        hairlessRatCollectionImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    ratSqueakSound();
                }
            }
        });

        // Click Russian blue rat collection image
        russianBlueRatCollectionImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    ratSqueakSound();
                }
            }
        });

        // Click patchwork rat collection image
        patchworkRatCollectionImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    ratSqueakSound();
                }
            }
        });

        // Click manx rat collection image
        manxRatCollectionImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    ratSqueakSound();
                }
            }
        });

        // Click "Shop" on purchased screen
        purchasedShopLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                displayShopScreen();

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound1();
                }
            }
        });

        // Click first text pane on Credits page
        creditsTextPanePanel1.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                try
                {
                    Desktop desktop = java.awt.Desktop.getDesktop();
                    URI site = new URI("https://giana.dev/");
                    desktop.browse(site);
                }
                catch(Exception e1)
                {
                    e1.printStackTrace();
                }
            }
        });

        // Click second text pane on Credits page
        creditsTextPanePanel2.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                try
                {
                    Desktop desktop = java.awt.Desktop.getDesktop();
                    URI site = new URI("https://logomakr.com/");
                    desktop.browse(site);
                }
                catch(Exception e1)
                {
                    e1.printStackTrace();
                }
            }
        });

        // Click third text pane on Credits page
        creditsTextPanePanel3.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                try
                {
                    Desktop desktop = java.awt.Desktop.getDesktop();
                    URI site = new URI("https://freesound.org/");
                    desktop.browse(site);
                }
                catch(Exception e1)
                {
                    e1.printStackTrace();
                }
            }
        });

        // Click "Delete Save" on Options page
        deleteSaveLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                displayConfirmationPage();

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound1();
                }
            }
        });

        // Click "No, go back!" on confirmation page
        noGoBackLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                displayOptionsScreen();

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound1();
                }
            }
        });

        // Click "Yes, delete!" on confirmation page
        yesDeleteLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                try
                {
                    currentGame.deleteSave();

                    displayOptionsScreen();

                    // Play sound if enabled
                    if(currentGame.getSoundStatus())
                    {
                        saveLoadSound();
                    }
                }
                catch(IOException e2)
                {
                    e2.printStackTrace();
                }
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

        callerCurrentLabel.setText("");
    }

    public void setGameStatsVisibility(boolean bool)
    {
        if(bool)
        {
            callerLogoImage.setVisible(true);
            callerCurrentLabel.setVisible(true);
            startGameLogoImage.setVisible(true);
            setGameModeIcon();
            currentGameModeLogoImage.setVisible(true);
        }
        else
        {
            callerLogoImage.setVisible(false);
            callerCurrentLabel.setVisible(false);
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
    }

    // Displays loss panel
    public void displayDefeatScreen()
    {
        switchPanel.removeAll();
        switchPanel.add(lossPanel);
        switchPanel.repaint();
        switchPanel.revalidate();
    }

    // Displays saved panel
    public void displaySavedScreen()
    {
        switchPanel.removeAll();
        switchPanel.add(savedPanel);
        switchPanel.repaint();
        switchPanel.revalidate();
    }

    // Displays collection panel
    public void displayCollectionScreen()
    {
        switchPanel.removeAll();
        switchPanel.add(collectionPanel);
        switchPanel.repaint();
        switchPanel.revalidate();
    }
    // Displays options panel
    public void displayOptionsScreen()
    {
        switchPanel.removeAll();
        switchPanel.add(optionsPanel);
        switchPanel.repaint();
        switchPanel.revalidate();
    }

    // Displays shop panel
    public void displayShopScreen()
    {
        switchPanel.removeAll();
        switchPanel.add(shopPanel);
        switchPanel.repaint();
        switchPanel.revalidate();
    }

    // Displays confirmation panel
    public void displayConfirmationPage()
    {
        switchPanel.removeAll();
        switchPanel.add(confirmationPanel);
        switchPanel.repaint();
        switchPanel.revalidate();
    }

    // Changes rat image and logo depending on rat type passed
    public void changePurchasedScreenItems(String rat)
    {
        Icon hoodedRatImage = new ImageIcon("src/Images/HoodedRat.png");
        Icon hoodedRatLogo = new ImageIcon("src/Images/HoodedLogo.png");
        Icon agoutiRatImage = new ImageIcon("src/Images/AgoutiRat.png");
        Icon agoutiRatLogo = new ImageIcon("src/Images/AgoutiLogo.png");
        Icon berkshireRatImage = new ImageIcon("src/Images/BerkshireRat.png");
        Icon berkshireRatLogo = new ImageIcon("src/Images/BerkshireLogo.png");
        Icon roanRatImage = new ImageIcon("src/Images/RoanRat.png");
        Icon roanRatLogo = new ImageIcon("src/Images/RoanLogo.png");
        Icon albinoRatImage = new ImageIcon("src/Images/AlbinoRat.png");
        Icon albinoRatLogo = new ImageIcon("src/Images/AlbinoLogo.png");
        Icon siameseRatImage = new ImageIcon("src/Images/SiameseRat.png");
        Icon siameseRatLogo = new ImageIcon("src/Images/SiameseLogo.png");
        Icon hairlessRatImage = new ImageIcon("src/Images/HairlessRat.png");
        Icon hairlessRatLogo = new ImageIcon("src/Images/HairlessLogo.png");
        Icon russianBlueRatImage = new ImageIcon("src/Images/RussianBlueRat.png");
        Icon russianBlueRatLogo = new ImageIcon("src/Images/RussianBlueLogo.png");
        Icon patchworkRatImage = new ImageIcon("src/Images/PatchworkRat.png");
        Icon patchworkRatLogo = new ImageIcon("src/Images/PatchworkLogo.png");
        Icon manxRatImage = new ImageIcon("src/Images/ManxRat.png");
        Icon manxRatLogo = new ImageIcon("src/Images/ManxLogo.png");

        switch(rat)
        {
            case "hooded":
                purchasedRatImage.setIcon(hoodedRatImage);
                purchasedRatLogo.setIcon(hoodedRatLogo);
                break;
            case "agouti":
                purchasedRatImage.setIcon(agoutiRatImage);
                purchasedRatLogo.setIcon(agoutiRatLogo);
                break;
            case "berkshire":
                purchasedRatImage.setIcon(berkshireRatImage);
                purchasedRatLogo.setIcon(berkshireRatLogo);
                break;
            case "roan":
                purchasedRatImage.setIcon(roanRatImage);
                purchasedRatLogo.setIcon(roanRatLogo);
                break;
            case "albino":
                purchasedRatImage.setIcon(albinoRatImage);
                purchasedRatLogo.setIcon(albinoRatLogo);
                break;
            case "siamese":
                purchasedRatImage.setIcon(siameseRatImage);
                purchasedRatLogo.setIcon(siameseRatLogo);
                break;
            case "hairless":
                purchasedRatImage.setIcon(hairlessRatImage);
                purchasedRatLogo.setIcon(hairlessRatLogo);
                break;
            case "russian blue":
                purchasedRatImage.setIcon(russianBlueRatImage);
                purchasedRatLogo.setIcon(russianBlueRatLogo);
                break;
            case "patchwork":
                purchasedRatImage.setIcon(patchworkRatImage);
                purchasedRatLogo.setIcon(patchworkRatLogo);
                break;
            case "manx":
                purchasedRatImage.setIcon(manxRatImage);
                purchasedRatLogo.setIcon(manxRatLogo);
                break;
            default:
                System.out.println("Error: Invalid rat");
                purchasedRatImage.setVisible(false);
                purchasedRatLogo.setVisible(false);
                break;

        }
    }

    // Display purchased panel and correct items (then switch back to shop)
    public void displayPurchasedScreen(String rat)
    {
            changePurchasedScreenItems(rat);

            switchPanel.removeAll();
            switchPanel.add(purchasedPanel);
            switchPanel.repaint();
            switchPanel.revalidate();
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

    // Changes the amount of wins in GUI and in Player class by 1
    public void changeWins()
    {
        int winsListed = Integer.parseInt(winsTotalLabel.getText());
        currentGame.getPlayer().setTotalWins(winsListed);

        int updatedWins = (currentGame.getPlayer().getTotalWins()) + 1;
        winsTotalLabel.setText(Integer.toString(updatedWins));
        currentGame.getPlayer().setTotalWins(updatedWins);
    }

    // Changes the amount of losses in GUI and in Player class by 1
    public void changeLosses()
    {
        int lossesListed = Integer.parseInt(lossesTotalLabel.getText());
        currentGame.getPlayer().setTotalLosses(lossesListed);

        int updatedLosses = (currentGame.getPlayer().getTotalLosses()) + 1;
        lossesTotalLabel.setText(Integer.toString(updatedLosses));
        currentGame.getPlayer().setTotalLosses(updatedLosses);
    }

    // Establishes how much money we have from GUI
    public void establishFunds()
    {
        int dollarsListed = Integer.parseInt(dollarsTotalLabel.getText());
        currentGame.getPlayer().setTotalDollars(dollarsListed);
    }

    // Rewards money to player
    public void reward(int amount)
    {
        establishFunds();

        int updatedDollars = (currentGame.getPlayer().getTotalDollars()) + amount;
        dollarsTotalLabel.setText(Integer.toString(updatedDollars));
        dollarsTotalLabel.setText(Integer.toString(updatedDollars));
        currentGame.getPlayer().setTotalDollars(updatedDollars);
    }

    // Deducts money from player
    public void deduct(int amount)
    {
        establishFunds();

        int updatedDollars = (currentGame.getPlayer().getTotalDollars()) - amount;
        dollarsTotalLabel.setText(Integer.toString(updatedDollars));
        currentGame.getPlayer().setTotalDollars(updatedDollars);
    }

    // Changes amount of dollars in GUI and Player class depending on win/loss
    public void changeDollars(boolean state)
    {
        int cornersReward = 10;
        int diagonalReward = 5;
        int horizontalReward = 4;
        int verticalReward = 4;
        int lReward = 9;
        int tReward = 8;
        int xReward = 11;
        int allReward = 15;

        if(state)
        {
            switch(currentMode)
            {
                case "corners":
                    {
                    reward(cornersReward);
                    break;
                }
                case "diagonal":
                    {
                    reward(diagonalReward);
                    break;
                }
                case "horizontal":
                    {
                    reward(horizontalReward);
                    break;
                }
                case "vertical":
                    {
                    reward(verticalReward);
                    break;
                }
                case "l":
                    {
                    reward(lReward);
                    break;
                }
                case "t":
                    {
                    reward(tReward);
                    break;
                }
                case "x":
                    {
                    reward(xReward);
                    break;
                }
                case "all":
                    {
                    reward(allReward);
                    break;
                }
                default:
                    System.out.println("Error: Invalid game mode");
                    break;
            }
        }
        else
        {
            deduct(1);
        }
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
                // Sleep for 3 seconds before starting caller
                try
                {
                    Thread.sleep(3000);
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }

                int called = currentGame.runCaller();

                String letter = getDisplayLetter(called);

                // Change caller label (once, so we don't have to wait for first call)
                callerCurrentLabel.setText(letter + " " + called);

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    callerSound();
                }

                // Now continue for the next 74
                for(int i = 0; i < 74; i++)
                {
                    // Sleep for 6 seconds
                    try
                    {
                        Thread.sleep(3000);
                    }
                    catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                    called = currentGame.runCaller();

                    letter = getDisplayLetter(called);

                    // Change caller label
                    callerCurrentLabel.setText(letter + " " + called);

                    // Play sound if enabled
                    if(currentGame.getSoundStatus())
                    {
                        callerSound();
                    }

                    // NPC plays game
                    currentGame.getNpcPlayer().scanBoard(called, currentGame);

                    // TODO: move point adjustments out of win/defeat screens
                    // If NPC won
                    if(currentGame.getNpcPlayer().checkForBingo(currentGame))
                    {
                        setGameStatsVisibility(false);
                        displayDefeatScreen();
                        changeLosses();

                        // Play sound if enabled
                        if(currentGame.getSoundStatus())
                        {
                            defeatSound();
                        }

                        break;
                    }
                }

                backgroundProcesses.interrupt();
            }
        });
    }

    // Sets game mode icon when you select a game mode (so you can see current one)
    public void setGameModeIcon()
    {
        Icon cornersIcon = new ImageIcon("src/Images/CornersLogo.png");
        Icon diagonalIcon = new ImageIcon("src/Images/DiagonalLogo.png");
        Icon horizontalIcon = new ImageIcon("src/Images/HorizontalLogo.png");
        Icon verticalIcon = new ImageIcon("src/Images/VerticalLogo.png");
        Icon lIcon = new ImageIcon("src/Images/LLogo.png");
        Icon tIcon = new ImageIcon("src/Images/TLogo.png");
        Icon xIcon = new ImageIcon("src/Images/XLogo.png");
        Icon allIcon = new ImageIcon("src/Images/AllLogo.png");

        switch(currentMode)
        {
            case "corners":
                currentGameModeLogoImage.setIcon(cornersIcon);
                break;
            case "diagonal":
                currentGameModeLogoImage.setIcon(diagonalIcon);
                break;
            case "horizontal":
                currentGameModeLogoImage.setIcon(horizontalIcon);
                break;
            case "vertical":
                currentGameModeLogoImage.setIcon(verticalIcon);
                break;
            case "l":
                currentGameModeLogoImage.setIcon(lIcon);
                break;
            case "t":
                currentGameModeLogoImage.setIcon(tIcon);
                break;
            case "x":
                currentGameModeLogoImage.setIcon(xIcon);
                break;
            case "all":
                currentGameModeLogoImage.setIcon(allIcon);
                break;
            default:
                System.out.println("Error: Invalid game mode");
                currentGameModeLogoImage.setVisible(false);
                break;
        }
    }

    // TODO: find a non-deprecated way of playing sound
    // Plays click sound 1
    public void clickSound1()
    {
        try
        {
            URL soundByte = new File("src/Sounds/ClickSound1.wav").toURI().toURL();
            java.applet.AudioClip clickSound = java.applet.Applet.newAudioClip(soundByte);
            clickSound.play();
        }
        catch(MalformedURLException e1)
        {
            e1.printStackTrace();
        }
    }

    // TODO: find a non-deprecated way of playing sound
    // Plays click sound 2
    public void clickSound2()
    {
        try
        {
            URL soundByte = new File("src/Sounds/ClickSound2.wav").toURI().toURL();
            java.applet.AudioClip clickSound = java.applet.Applet.newAudioClip(soundByte);
            clickSound.play();
        }
        catch(MalformedURLException e1)
        {
            e1.printStackTrace();
        }
    }

    // TODO: find a non-deprecated way of playing sound
    // Plays victory sound
    public void victorySound()
    {
        try
        {
            URL soundByte = new File("src/Sounds/VictorySound.wav").toURI().toURL();
            java.applet.AudioClip clickSound = java.applet.Applet.newAudioClip(soundByte);
            clickSound.play();
        }
        catch(MalformedURLException e1)
        {
            e1.printStackTrace();
        }
    }

    // TODO: find a non-deprecated way of playing sound
    // Plays defeat sound
    public void defeatSound()
    {
        try
        {
            URL soundByte = new File("src/Sounds/DefeatSound.wav").toURI().toURL();
            java.applet.AudioClip clickSound = java.applet.Applet.newAudioClip(soundByte);
            clickSound.play();
        }
        catch(MalformedURLException e1)
        {
            e1.printStackTrace();
        }
    }

    // TODO: find a non-deprecated way of playing sound
    // Plays save/load sound
    public void saveLoadSound()
    {
        try
        {
            URL soundByte = new File("src/Sounds/SaveLoadSound.wav").toURI().toURL();
            java.applet.AudioClip clickSound = java.applet.Applet.newAudioClip(soundByte);
            clickSound.play();
        }
        catch(MalformedURLException e1)
        {
            e1.printStackTrace();
        }
    }

    // TODO: find a non-deprecated way of playing sound
    // Plays rat squeak sound
    public void ratSqueakSound()
    {
        try
        {
            URL soundByte = new File("src/Sounds/RatSqueakSound.wav").toURI().toURL();
            java.applet.AudioClip clickSound = java.applet.Applet.newAudioClip(soundByte);
            clickSound.play();
        }
        catch(MalformedURLException e1)
        {
            e1.printStackTrace();
        }
    }

    // TODO: find a non-deprecated way of playing sound
    // Plays start game sound
    public void startGameSound()
    {
        try
        {
            URL soundByte = new File("src/Sounds/StartGameSound.wav").toURI().toURL();
            java.applet.AudioClip clickSound = java.applet.Applet.newAudioClip(soundByte);
            clickSound.play();
        }
        catch(MalformedURLException e1)
        {
            e1.printStackTrace();
        }
    }

    // TODO: find a non-deprecated way of playing sound
    // Plays purchase sound
    public void purchaseSound()
    {
        try
        {
            URL soundByte = new File("src/Sounds/PurchaseSound.wav").toURI().toURL();
            java.applet.AudioClip clickSound = java.applet.Applet.newAudioClip(soundByte);
            clickSound.play();
        }
        catch(MalformedURLException e1)
        {
            e1.printStackTrace();
        }
    }

    // TODO: find a non-deprecated way of playing sound
    // Plays caller sound
    public void callerSound()
    {
        try
        {
            URL soundByte = new File("src/Sounds/callerSound.wav").toURI().toURL();
            java.applet.AudioClip clickSound = java.applet.Applet.newAudioClip(soundByte);
            clickSound.play();
        }
        catch(MalformedURLException e1)
        {
            e1.printStackTrace();
        }
    }

    // To use when purchasing, deducts amount from dollars
    public boolean makePurchase(int amount)
    {
        establishFunds();        // Useful if buying without loading or playing
        establishCollection();

        // If they have enough money
        if(currentGame.getPlayer().getTotalDollars() >= amount)
        {
            deduct(amount);

            // Play sound if enabled
            if(currentGame.getSoundStatus())
            {
                purchaseSound();
            }

            return true;
        }

        return false;
    }

    // Changes the amount of hooded rats in GUI and in Player class by 1
    public void changeHooded()
    {
        int numberListed = Integer.parseInt(hoodedRatCollectionTotal.getText());
        currentGame.getPlayer().setTotalHooded(numberListed);

        int updatedNumber = (currentGame.getPlayer().getTotalHooded()) + 1;
        hoodedRatCollectionTotal.setText(Integer.toString(updatedNumber));
        currentGame.getPlayer().setTotalHooded(updatedNumber);
    }

    // Changes the amount of agouti rats in GUI and in Player class by 1
    public void changeAgouti()
    {
        int numberListed = Integer.parseInt(agoutiRatCollectionTotal.getText());
        currentGame.getPlayer().setTotalAgouti(numberListed);

        int updatedNumber = (currentGame.getPlayer().getTotalAgouti()) + 1;
        agoutiRatCollectionTotal.setText(Integer.toString(updatedNumber));
        currentGame.getPlayer().setTotalAgouti(updatedNumber);
    }

    // Changes the amount of berkshire rats in GUI and in Player class by 1
    public void changeBerkshire()
    {
        int numberListed = Integer.parseInt(berkshireRatCollectionTotal.getText());
        currentGame.getPlayer().setTotalBerkshire(numberListed);

        int updatedNumber = (currentGame.getPlayer().getTotalBerkshire()) + 1;
        berkshireRatCollectionTotal.setText(Integer.toString(updatedNumber));
        currentGame.getPlayer().setTotalBerkshire(updatedNumber);
    }

    // Changes the amount of roan rats in GUI and in Player class by 1
    public void changeRoan()
    {
        int numberListed = Integer.parseInt(roanRatCollectionTotal.getText());
        currentGame.getPlayer().setTotalRoan(numberListed);

        int updatedNumber = (currentGame.getPlayer().getTotalRoan()) + 1;
        roanRatCollectionTotal.setText(Integer.toString(updatedNumber));
        currentGame.getPlayer().setTotalRoan(updatedNumber);
    }

    // Changes the amount of albino rats in GUI and in Player class by 1
    public void changeAlbino()
    {
        int numberListed = Integer.parseInt(albinoRatCollectionTotal.getText());
        currentGame.getPlayer().setTotalAlbino(numberListed);

        int updatedNumber = (currentGame.getPlayer().getTotalAlbino()) + 1;
        albinoRatCollectionTotal.setText(Integer.toString(updatedNumber));
        currentGame.getPlayer().setTotalAlbino(updatedNumber);
    }

    // Changes the amount of siamese rats in GUI and in Player class by 1
    public void changeSiamese()
    {
        int numberListed = Integer.parseInt(siameseRatCollectionTotal.getText());
        currentGame.getPlayer().setTotalSiamese(numberListed);

        int updatedNumber = (currentGame.getPlayer().getTotalSiamese()) + 1;
        siameseRatCollectionTotal.setText(Integer.toString(updatedNumber));
        currentGame.getPlayer().setTotalSiamese(updatedNumber);
    }

    // Changes the amount of siamese rats in GUI and in Player class by 1
    public void changeHairless()
    {
        int numberListed = Integer.parseInt(hairlessRatCollectionTotal.getText());
        currentGame.getPlayer().setTotalHairless(numberListed);

        int updatedNumber = (currentGame.getPlayer().getTotalHairless()) + 1;
        hairlessRatCollectionTotal.setText(Integer.toString(updatedNumber));
        currentGame.getPlayer().setTotalHairless(updatedNumber);
    }

    // Changes the amount of Russian blue rats in GUI and in Player class by 1
    public void changeRussianBlue()
    {
        int numberListed = Integer.parseInt(russianBlueRatCollectionTotal.getText());
        currentGame.getPlayer().setTotalRussianBlue(numberListed);

        int updatedNumber = (currentGame.getPlayer().getTotalRussianBlue()) + 1;
        russianBlueRatCollectionTotal.setText(Integer.toString(updatedNumber));
        currentGame.getPlayer().setTotalRussianBlue(updatedNumber);
    }

    // Changes the amount of patchwork rats in GUI and in Player class by 1
    public void changePatchwork()
    {
        int numberListed = Integer.parseInt(patchworkRatCollectionTotal.getText());
        currentGame.getPlayer().setTotalPatchwork(numberListed);

        int updatedNumber = (currentGame.getPlayer().getTotalPatchwork()) + 1;
        patchworkRatCollectionTotal.setText(Integer.toString(updatedNumber));
        currentGame.getPlayer().setTotalPatchwork(updatedNumber);
    }

    // Changes the amount of manx rats in GUI and in Player class by 1
    public void changeManx()
    {
        int numberListed = Integer.parseInt(manxRatCollectionTotal.getText());
        currentGame.getPlayer().setTotalManx(numberListed);

        int updatedNumber = (currentGame.getPlayer().getTotalManx()) + 1;
        manxRatCollectionTotal.setText(Integer.toString(updatedNumber));
        currentGame.getPlayer().setTotalManx(updatedNumber);
    }

    // Lets method know how many rats we have if not established
    public void establishCollection()
    {
        int numberListed1 = Integer.parseInt(hoodedRatCollectionTotal.getText());
        int numberListed2 = Integer.parseInt(agoutiRatCollectionTotal.getText());
        int numberListed3 = Integer.parseInt(berkshireRatCollectionTotal.getText());
        int numberListed4 = Integer.parseInt(roanRatCollectionTotal.getText());
        int numberListed5 = Integer.parseInt(albinoRatCollectionTotal.getText());
        int numberListed6 = Integer.parseInt(siameseRatCollectionTotal.getText());
        int numberListed7 = Integer.parseInt(hairlessRatCollectionTotal.getText());
        int numberListed8 = Integer.parseInt(russianBlueRatCollectionTotal.getText());
        int numberListed9 = Integer.parseInt(patchworkRatCollectionTotal.getText());
        int numberListed10 = Integer.parseInt(manxRatCollectionTotal.getText());

        currentGame.getPlayer().setTotalHooded(numberListed1);
        currentGame.getPlayer().setTotalAgouti(numberListed2);
        currentGame.getPlayer().setTotalBerkshire(numberListed3);
        currentGame.getPlayer().setTotalRoan(numberListed4);
        currentGame.getPlayer().setTotalAlbino(numberListed5);
        currentGame.getPlayer().setTotalSiamese(numberListed6);
        currentGame.getPlayer().setTotalHairless(numberListed7);
        currentGame.getPlayer().setTotalRussianBlue(numberListed8);
        currentGame.getPlayer().setTotalPatchwork(numberListed9);
        currentGame.getPlayer().setTotalManx(numberListed10);
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
