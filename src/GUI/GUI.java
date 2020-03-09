package GUI;

import Code.Game;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import javax.swing.*;

/**
 * The Rat Bingo program is a bingo game with a rat theme.
 *
 * @author  Giana (Github: G-i-a-n-a - Website: Giana.dev)
 * @version 1.0
 * @since   2019-01-??
 */
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
    private JLabel gameModesTitleLogoImage;
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
    private JLabel dollarSymbolLabel;
    private JLabel mainMenuLogoImage;
    private JPanel lossByBotPanel;
    private JLabel defeatByBotLogoImage;
    private JLabel botWinsLogoImage;
    private JButton cornersButton;

    private Game currentGame = new Game();
    private String currentMode;
    Thread backgroundProcesses;
    int callerDelay = 4000;

    public GUI()
    {
        /*
         * This listener outlines what happens if you click the Rat
         * Bingo logo on the top of the left panel.
         */
        smallRatBingoLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Remove things you should just see in game
                setGameStatsVisibility(false);

                displayMainScreen();

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    ratSqueakSound();
                }
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "Main Menu" logo on the top of the left panel.
         */
        mainMenuLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Remove things you should just see in game
                setGameStatsVisibility(false);

                displayMainScreen();

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound1();
                }
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "Corners" logo on the left panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * "Diagonal" logo on the left panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * "Horizontal" logo on the left panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * "Vertical" logo on the left panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * "L" logo on the left panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * "T" logo on the left panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * "X" logo on the left panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * "All" logo on the left panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * "Credits" logo on the left panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * "Help" logo on the left panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * "Start Game" logo on the right panel.
         */
        startGameLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                startGameLogoImage.setVisible(false);
                bingoLogoImage.setVisible(true);
                leftMenuPanel.setVisible(false);

                // Preserve sound status
                boolean sound = currentGame.getSoundStatus();

                // Create game of current game mode
                currentGame = new Game(currentMode);

                // Transfer sound status
                currentGame.setSoundStatus(sound);

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

        /*
         * This listener outlines what happens if you click the
         * "BINGO!" logo on the right panel.
         */
        bingoLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                String winState = currentGame.checkWin(currentGame.getPlayerBoard());

                setGameStatsVisibility(false);
                leftMenuPanel.setVisible(true);

                if(winState.equals("N/A"))
                {
                    // Display loss panel
                    displayLossScreen();

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
                    displayWinScreen();

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

        /*
         * This listener outlines what happens if you click the
         * "b1" button on the board (at 0,0).
         */
        b1.addActionListener(e ->
        {
            alterTileGUI(b1, 0, 0);

            // Play sound if enabled
            if(currentGame.getSoundStatus())
            {
                clickSound2();
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "b2" button on the board (at 1,0).
         */
        b2.addActionListener(e ->
        {
            alterTileGUI(b2, 1, 0);

            // Play sound if enabled
            if(currentGame.getSoundStatus())
            {
                clickSound2();
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "b3" button on the board (at 2,0).
         */
        b3.addActionListener(e ->
        {
            alterTileGUI(b3, 2, 0);

            // Play sound if enabled
            if(currentGame.getSoundStatus())
            {
                clickSound2();
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "b4" button on the board (at 3,0).
         */
        b4.addActionListener(e ->
        {
            alterTileGUI(b4, 3, 0);

            // Play sound if enabled
            if(currentGame.getSoundStatus())
            {
                clickSound2();
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "b5" button on the board (at 4,0).
         */
        b5.addActionListener(e ->
        {
            alterTileGUI(b5, 4, 0);

            // Play sound if enabled
            if(currentGame.getSoundStatus())
            {
                clickSound2();
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "i1" button on the board (at 0,1).
         */
        i1.addActionListener(e ->
        {
            alterTileGUI(i1, 0, 1);

            // Play sound if enabled
            if(currentGame.getSoundStatus())
            {
                clickSound2();
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "i2" button on the board (at 1,1).
         */
        i2.addActionListener(e ->
        {
            alterTileGUI(i2, 1, 1);

            // Play sound if enabled
            if(currentGame.getSoundStatus())
            {
                clickSound2();
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "i3" button on the board (at 2,1).
         */
        i3.addActionListener(e ->
        {
            alterTileGUI(i3, 2, 1);

            // Play sound if enabled
            if(currentGame.getSoundStatus())
            {
                clickSound2();
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "i4" button on the board (at 3,1).
         */
        i4.addActionListener(e ->
        {
            alterTileGUI(i4, 3, 1);

            // Play sound if enabled
            if(currentGame.getSoundStatus())
            {
                clickSound2();
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "i5" button on the board (at 4,1).
         */
        i5.addActionListener(e ->
        {
            alterTileGUI(i5, 4, 1);

            // Play sound if enabled
            if(currentGame.getSoundStatus())
            {
                clickSound2();
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "n1" button on the board (at 0,2).
         */
        n1.addActionListener(e ->
        {
            alterTileGUI(n1, 0, 2);

            // Play sound if enabled
            if(currentGame.getSoundStatus())
            {
                clickSound2();
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "n2" button on the board (at 1,2).
         */
        n2.addActionListener(e ->
        {
            alterTileGUI(n2, 1, 2);

            // Play sound if enabled
            if(currentGame.getSoundStatus())
            {
                clickSound2();
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "n3" button on the board (at 2,2).
         */
        n3.addActionListener(e ->
        {
            alterTileGUI(n3, 2, 2);

            // Play sound if enabled
            if(currentGame.getSoundStatus())
            {
                clickSound2();
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "n4" button on the board (at 3,2).
         */
        n4.addActionListener(e ->
        {
            alterTileGUI(n4, 3, 2);

            // Play sound if enabled
            if(currentGame.getSoundStatus())
            {
                clickSound2();
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "n5" button on the board (at 4,2).
         */
        n5.addActionListener(e ->
        {
            alterTileGUI(n5, 4, 2);

            // Play sound if enabled
            if(currentGame.getSoundStatus())
            {
                clickSound2();
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "g1" button on the board (at 0,3).
         */
        g1.addActionListener(e ->
        {
            alterTileGUI(g1, 0, 3);

            // Play sound if enabled
            if(currentGame.getSoundStatus())
            {
                clickSound2();
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "g2" button on the board (at 1,3).
         */
        g2.addActionListener(e ->
        {
            alterTileGUI(g2, 1, 3);

            // Play sound if enabled
            if(currentGame.getSoundStatus())
            {
                clickSound2();
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "g3" button on the board (at 2,3).
         */
        g3.addActionListener(e ->
        {
            alterTileGUI(g3, 2, 3);

            // Play sound if enabled
            if(currentGame.getSoundStatus())
            {
                clickSound2();
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "g4" button on the board (at 3,3).
         */
        g4.addActionListener(e ->
        {
            alterTileGUI(g4, 3, 3);

            // Play sound if enabled
            if(currentGame.getSoundStatus())
            {
                clickSound2();
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "g5" button on the board (at 4,3).
         */
        g5.addActionListener(e ->
        {
            alterTileGUI(g5, 4, 3);

            // Play sound if enabled
            if(currentGame.getSoundStatus())
            {
                clickSound2();
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "o1" button on the board (at 0,4).
         */
        o1.addActionListener(e ->
        {
            alterTileGUI(o1, 0, 4);

            // Play sound if enabled
            if(currentGame.getSoundStatus())
            {
                clickSound2();
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "o2" button on the board (at 1,4).
         */
        o2.addActionListener(e ->
        {
            alterTileGUI(o2, 1, 4);

            // Play sound if enabled
            if(currentGame.getSoundStatus())
            {
                clickSound2();
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "o3" button on the board (at 2,4).
         */
        o3.addActionListener(e ->
        {
            alterTileGUI(o3, 2, 4);

            // Play sound if enabled
            if(currentGame.getSoundStatus())
            {
                clickSound2();
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "o4" button on the board (at 3,4).
         */
        o4.addActionListener(e ->
        {
            alterTileGUI(o4, 3, 4);

            // Play sound if enabled
            if(currentGame.getSoundStatus())
            {
                clickSound2();
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "o5" button on the board (at 4,4).
         */
        o5.addActionListener(e ->
        {
            alterTileGUI(o5, 4, 4);

            // Play sound if enabled
            if(currentGame.getSoundStatus())
            {
                clickSound2();
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "Load" logo on the left panel.
         */
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

                    setGameStatsVisibility(false);
                    displayMainScreen();

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

        /*
         * This listener outlines what happens if you click the
         * "Load" logo on the left panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * "Collection" logo on the main menu panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * "Options" logo on the main menu panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * "Shop" logo on the main menu panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * hooded rat on the shop panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * agouti rat on the shop panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * berkshire rat on the shop panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * roan rat on the shop panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * albino rat on the shop panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * siamese rat on the shop panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * hairless rat on the shop panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * Russian blue rat on the shop panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * patchwork rat on the shop panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * manx rat on the shop panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * hooded rat purchase button on the shop panel.
         */
        hoodedRatButton.addActionListener(e ->
        {
            if(makePurchase(5))
            {
                changeHooded();
                displayPurchasedScreen("hooded");
            }
        });

        /*
         * This listener outlines what happens if you click the
         * agouti rat purchase button on the shop panel.
         */
        agoutiRatButton.addActionListener(e ->
        {
            if(makePurchase(10))
            {
                changeAgouti();
                displayPurchasedScreen("agouti");
            }
        });

        /*
         * This listener outlines what happens if you click the
         * berkshire rat purchase button on the shop panel.
         */
        berkshireRatButton.addActionListener(e ->
        {
            if(makePurchase(15))
            {
                changeBerkshire();
                displayPurchasedScreen("berkshire");
            }
        });

        /*
         * This listener outlines what happens if you click the
         * roan rat purchase button on the shop panel.
         */
        roanRatButton.addActionListener(e ->
        {
            if(makePurchase(20))
            {
                changeRoan();
                displayPurchasedScreen("roan");
            }
        });

        /*
         * This listener outlines what happens if you click the
         * albino rat purchase button on the shop panel.
         */
        albinoRatButton.addActionListener(e ->
        {
            if(makePurchase(25))
            {
                changeAlbino();
                displayPurchasedScreen("albino");
            }
        });

        /*
         * This listener outlines what happens if you click the
         * siamese rat purchase button on the shop panel.
         */
        siameseRatButton.addActionListener(e ->
        {
            if(makePurchase(30))
            {
                changeSiamese();
                displayPurchasedScreen("siamese");
            }
        });

        /*
         * This listener outlines what happens if you click the
         * hairless rat purchase button on the shop panel.
         */
        hairlessRatButton.addActionListener(e ->
        {
            if(makePurchase(35))
            {
                changeHairless();
                displayPurchasedScreen("hairless");
            }
        });

        /*
         * This listener outlines what happens if you click the
         * Russian blue rat purchase button on the shop panel.
         */
        russianBlueRatButton.addActionListener(e ->
        {
            if(makePurchase(40))
            {
                changeRussianBlue();
                displayPurchasedScreen("russian blue");
            }
        });

        /*
         * This listener outlines what happens if you click the
         * patchwork rat purchase button on the shop panel.
         */
        patchworkRatButton.addActionListener(e ->
        {
            if(makePurchase(45))
            {
                changePatchwork();
                displayPurchasedScreen("patchwork");
            }
        });

        /*
         * This listener outlines what happens if you click the
         * manx rat purchase button on the shop panel.
         */
        manxRatButton.addActionListener(e ->
        {
            if(makePurchase(50))
            {
                changeManx();
                displayPurchasedScreen("manx");
            }
        });

        /*
         * This listener outlines what happens if you click the
         * hooded rat on the collection panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * agouti rat on the collection panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * berkshire rat on the collection panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * roan rat on the collection panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * albino rat on the collection panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * siamese rat on the collection panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * hairless rat on the collection panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * Russian blue rat on the collection panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * patchwork rat on the collection panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * manx rat on the collection panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * "Shop" logo on the purchased panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * 1st text pane on the credits panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * 2nd text pane on the credits panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * 3rd text pane on the credits panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * "Delete Save" logo on the options panel.
         */
        deleteSaveLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                displayConfirmationScreen();

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound1();
                }
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "No, go back!" logo on the confirmation panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * "Yes, delete!" logo on the confirmation panel.
         */
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

        /*
         * This listener outlines what happens if you click the
         * "Toggle Sound On/Off" logo on the options panel.
         */
        toggleSoundLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Sound is enabled (so we are clicking to disable)
                if(currentGame.getSoundStatus())
                {
                    // Play sound
                    clickSound1();

                    currentGame.setSoundStatus(false);

                    // Change to "Toggle Sound On" icon
                    toggleSoundLogoImage.setEnabled(false);
                }
                // Sound is disabled (so we are clicking to enable)
                else
                {
                    currentGame.setSoundStatus(true);

                    // Play sound
                    if(currentGame.getSoundStatus())
                    {
                        clickSound1();
                    }

                    // Change to "Toggle Sound Off" icon
                    toggleSoundLogoImage.setEnabled(true);
                }
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "1" logo on the options panel.
         */
        oneSecondLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                callerDelay = 1000;

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound1();
                }
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "2" logo on the options panel.
         */
        twoSecondsLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                callerDelay = 2000;

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound1();
                }
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "3" logo on the options panel.
         */
        threeSecondsLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                callerDelay = 3000;

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound1();
                }
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "4" logo on the options panel.
         */
        fourSecondsLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                callerDelay = 4000;

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound1();
                }
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "5" logo on the options panel.
         */
        fiveSecondsLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                callerDelay = 5000;

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound1();
                }
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "6" logo on the options panel.
         */
        sixSecondsLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                callerDelay = 6000;

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound1();
                }
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "7" logo on the options panel.
         */
        sevenSecondsLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                callerDelay = 7000;

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound1();
                }
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "8" logo on the options panel.
         */
        eightSecondsLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                callerDelay = 8000;

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound1();
                }
            }
        });

        /*
         * This listener outlines what happens if you click the
         * "9" logo on the options panel.
         */
        nineSecondsLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                callerDelay = 9000;

                // Play sound if enabled
                if(currentGame.getSoundStatus())
                {
                    clickSound1();
                }
            }
        });

        /*
         * This listener outlines what happens if you click the
         * answer6 text pane on the help panel.
         */
        answer6.addMouseListener(new MouseAdapter()
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
    }

    /**
     * This method is used to initialize the board GUI, which is
     * the visible text on each button of the board during game.
     */
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

    /**
     * This method is used to reset the board GUI. It sets the
     * text of each button back to nothing, resets the
     * color of each button back to the default, and sets the
     * text of callerCurrentLabel back to nothing.
     */
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

    /**
     * This method is used to enable or disable the
     * visibility of the game stats. Game stats
     * include callerLogoImage, callerCurrentlabel,
     * startGameLogoImage, and currentGameModeImage.
     * It also sets the game mode icon.
     * @param bool If enabling or disabling
     */
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

    /**
     * This method is used to change the selection status
     * of a button, depending on whether it is being
     * selected or deselected. Additionally, it changes
     * the background color of the button.
     * @param button Button to be altered
     * @param x X coordinate of button
     * @param y Y coordinate of button
     */
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

    /**
     * This method is used to change the
     * center panel to display the
     * mainMenuPanel.
     */
    public void displayMainScreen()
    {
        switchPanel.removeAll();
        switchPanel.add(mainMenuPanel);
        switchPanel.repaint();
        switchPanel.revalidate();
    }

    /**
     * This method is used to change the
     * center panel to display the
     * winPanel.
     */
    public void displayWinScreen()
    {
        switchPanel.removeAll();
        switchPanel.add(winPanel);
        switchPanel.repaint();
        switchPanel.revalidate();
    }

    /**
     * This method is used to change the
     * center panel to display the
     * lossPanel.
     */
    public void displayLossScreen()
    {
        switchPanel.removeAll();
        switchPanel.add(lossPanel);
        switchPanel.repaint();
        switchPanel.revalidate();
    }

    /**
     * This method is used to change the
     * center panel to display the
     * savedPanel.
     */
    public void displaySavedScreen()
    {
        switchPanel.removeAll();
        switchPanel.add(savedPanel);
        switchPanel.repaint();
        switchPanel.revalidate();
    }

    /**
     * This method is used to change the
     * center panel to display the
     * collectionPanel.
     */
    public void displayCollectionScreen()
    {
        switchPanel.removeAll();
        switchPanel.add(collectionPanel);
        switchPanel.repaint();
        switchPanel.revalidate();
    }

    /**
     * This method is used to change the
     * center panel to display the
     * optionsPanel.
     */
    public void displayOptionsScreen()
    {
        switchPanel.removeAll();
        switchPanel.add(optionsPanel);
        switchPanel.repaint();
        switchPanel.revalidate();
    }

    /**
     * This method is used to change the
     * center panel to display the
     * shopPanel.
     */
    public void displayShopScreen()
    {
        switchPanel.removeAll();
        switchPanel.add(shopPanel);
        switchPanel.repaint();
        switchPanel.revalidate();
    }

    /**
     * This method is used to change the
     * center panel to display the
     * confirmationPanel.
     */
    public void displayConfirmationScreen()
    {
        switchPanel.removeAll();
        switchPanel.add(confirmationPanel);
        switchPanel.repaint();
        switchPanel.revalidate();
    }

    /**
     * This method is used to change the
     * center panel to display the
     * lossByBotPanel.
     */
    public void displayLossByBot()
    {
        switchPanel.removeAll();
        switchPanel.add(lossByBotPanel);
        switchPanel.repaint();
        switchPanel.revalidate();
    }

    /**
     * This method is used to change the purchasedRatImage
     * and purchasedRatLogo on the purchased panel, according
     * to the rat type purchased.
     * @param rat Rat type purchased
     */
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

    /**
     * This method is used to change the items on the
     * purchased panel, and then to change the center
     * panel to display the purchased panel.
     * @param rat Rat type purchased
     */
    public void displayPurchasedScreen(String rat)
    {
            changePurchasedScreenItems(rat);

            switchPanel.removeAll();
            switchPanel.add(purchasedPanel);
            switchPanel.repaint();
            switchPanel.revalidate();
    }

    /**
     * This method is used to get the letter
     * corresponding to the number called.
     * @param called Number called
     * @return String Corresponding letter
     */
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

    /**
     * This method is used to increase the number
     * of wins by 1 in the GUI and in the Player
     * class.
     */
    public void changeWins()
    {
        int winsListed = Integer.parseInt(winsTotalLabel.getText());
        currentGame.getPlayer().setTotalWins(winsListed);

        int updatedWins = (currentGame.getPlayer().getTotalWins()) + 1;
        winsTotalLabel.setText(Integer.toString(updatedWins));
        currentGame.getPlayer().setTotalWins(updatedWins);
    }

    /**
     * This method is used to increase the number
     * of losses by 1 in the GUI and in the Player
     * class.
     */
    public void changeLosses()
    {
        int lossesListed = Integer.parseInt(lossesTotalLabel.getText());
        currentGame.getPlayer().setTotalLosses(lossesListed);

        int updatedLosses = (currentGame.getPlayer().getTotalLosses()) + 1;
        lossesTotalLabel.setText(Integer.toString(updatedLosses));
        currentGame.getPlayer().setTotalLosses(updatedLosses);
    }

    /**
     * This method is used to establish the amount
     * of money the player has by setting the number
     * visible in the GUI to the total dollars in the
     * Player class.
     */
    public void establishFunds()
    {
        int dollarsListed = Integer.parseInt(dollarsTotalLabel.getText());
        currentGame.getPlayer().setTotalDollars(dollarsListed);
    }

    /**
     * This method is used to reward dollars to
     * the Player in the GUI and in the Player
     * class.
     * @param amount Amount of money to reward
     */
    public void reward(int amount)
    {
        establishFunds();

        int updatedDollars = (currentGame.getPlayer().getTotalDollars()) + amount;
        dollarsTotalLabel.setText(Integer.toString(updatedDollars));
        dollarsTotalLabel.setText(Integer.toString(updatedDollars));
        currentGame.getPlayer().setTotalDollars(updatedDollars);
    }

    /**
     * This method is used to deduct dollars from
     * the Player in the GUI and in the Player
     * class.
     * @param amount Amount of money to deduct
     */
    public void deduct(int amount)
    {
        establishFunds();

        int updatedDollars = (currentGame.getPlayer().getTotalDollars()) - amount;
        dollarsTotalLabel.setText(Integer.toString(updatedDollars));
        currentGame.getPlayer().setTotalDollars(updatedDollars);
    }

    /**
     * This method is used to reward or deduct
     * dollars to/from the Player in the GUI and
     * in the Player class, depending on whether
     * the game was won, and which type was one.
     * @param state Game win or loss
     */
    public void changeDollars(boolean state)
    {
        int cornersReward = 5;
        int diagonalReward = 4;
        int horizontalReward = 4;
        int verticalReward = 4;
        int lReward = 10;
        int tReward = 10;
        int xReward = 10;
        int allReward = 20;

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

    /**
     * This method is used to set up and define the
     * behavior of the background process, a thread
     * which handles the caller as well as the NPC
     * playing.
     */
    public void setUpBackgroundProcesses()
    {
        // Thread for caller
        backgroundProcesses = new Thread(() ->
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
                    Thread.sleep(callerDelay);
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
                currentGame.getNpcPlayer().scanBoard(currentGame, called);

                // If NPC won
                if(currentGame.getNpcPlayer().checkForBingo(currentGame))
                {
                    setGameStatsVisibility(false);
                    leftMenuPanel.setVisible(true);
                    displayLossByBot();
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
        });
    }

    /**
     * This method is used to set the
     * currentGameModeLogoImage, based on the
     * current game mode.
     */
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

    /**
     * This method is used to play
     * "ClickSound1.wav".
     */
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

    /**
     * This method is used to play
     * "ClickSound2.wav".
     */
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

    /**
     * This method is used to play
     * "VictorySound.wav".
     */
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

    /**
     * This method is used to play
     * "DefeatSound.wav".
     */
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

    /**
     * This method is used to play
     * "SaveLoadSound.wav".
     */
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

    /**
     * This method is used to play
     * "RatSqueakSound.wav".
     */
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

    /**
     * This method is used to play
     * "StartGameSound.wav".
     */
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

    /**
     * This method is used to play
     * "PurchaseSound.wav".
     */
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

    /**
     * This method is used to play
     * "CallerSound.wav".
     */
    public void callerSound()
    {
        try
        {
            URL soundByte = new File("src/Sounds/CallerSound.wav").toURI().toURL();
            java.applet.AudioClip clickSound = java.applet.Applet.newAudioClip(soundByte);
            clickSound.play();
        }
        catch(MalformedURLException e1)
        {
            e1.printStackTrace();
        }
    }

    /**
     * This method is used to deduct dollars from
     * the Player in the GUI and in the Player class
     * when a purchase from the shop is made.
     * @param amount Amount of money to deduct
     * @return boolean Purchase success/failure
     */
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

    /**
     * This method is used to increase the amount
     * of hooded rats by 1 in the collection,
     * in the GUI and in the Player class.
     */
    public void changeHooded()
    {
        int numberListed = Integer.parseInt(hoodedRatCollectionTotal.getText());
        currentGame.getPlayer().setTotalHooded(numberListed);

        int updatedNumber = (currentGame.getPlayer().getTotalHooded()) + 1;
        hoodedRatCollectionTotal.setText(Integer.toString(updatedNumber));
        currentGame.getPlayer().setTotalHooded(updatedNumber);
    }

    /**
     * This method is used to increase the amount
     * of agouti rats by 1 in the collection,
     * in the GUI and in the Player class.
     */
    public void changeAgouti()
    {
        int numberListed = Integer.parseInt(agoutiRatCollectionTotal.getText());
        currentGame.getPlayer().setTotalAgouti(numberListed);

        int updatedNumber = (currentGame.getPlayer().getTotalAgouti()) + 1;
        agoutiRatCollectionTotal.setText(Integer.toString(updatedNumber));
        currentGame.getPlayer().setTotalAgouti(updatedNumber);
    }

    /**
     * This method is used to increase the amount
     * of berkshire rats by 1 in the collection,
     * in the GUI and in the Player class.
     */
    public void changeBerkshire()
    {
        int numberListed = Integer.parseInt(berkshireRatCollectionTotal.getText());
        currentGame.getPlayer().setTotalBerkshire(numberListed);

        int updatedNumber = (currentGame.getPlayer().getTotalBerkshire()) + 1;
        berkshireRatCollectionTotal.setText(Integer.toString(updatedNumber));
        currentGame.getPlayer().setTotalBerkshire(updatedNumber);
    }

    /**
     * This method is used to increase the amount
     * of roan rats by 1 in the collection,
     * in the GUI and in the Player class.
     */
    public void changeRoan()
    {
        int numberListed = Integer.parseInt(roanRatCollectionTotal.getText());
        currentGame.getPlayer().setTotalRoan(numberListed);

        int updatedNumber = (currentGame.getPlayer().getTotalRoan()) + 1;
        roanRatCollectionTotal.setText(Integer.toString(updatedNumber));
        currentGame.getPlayer().setTotalRoan(updatedNumber);
    }

    /**
     * This method is used to increase the amount
     * of albino rats by 1 in the collection,
     * in the GUI and in the Player class.
     */
    public void changeAlbino()
    {
        int numberListed = Integer.parseInt(albinoRatCollectionTotal.getText());
        currentGame.getPlayer().setTotalAlbino(numberListed);

        int updatedNumber = (currentGame.getPlayer().getTotalAlbino()) + 1;
        albinoRatCollectionTotal.setText(Integer.toString(updatedNumber));
        currentGame.getPlayer().setTotalAlbino(updatedNumber);
    }

    /**
     * This method is used to increase the amount
     * of siamese rats by 1 in the collection,
     * in the GUI and in the Player class.
     */
    public void changeSiamese()
    {
        int numberListed = Integer.parseInt(siameseRatCollectionTotal.getText());
        currentGame.getPlayer().setTotalSiamese(numberListed);

        int updatedNumber = (currentGame.getPlayer().getTotalSiamese()) + 1;
        siameseRatCollectionTotal.setText(Integer.toString(updatedNumber));
        currentGame.getPlayer().setTotalSiamese(updatedNumber);
    }

    /**
     * This method is used to increase the amount
     * of hairless rats by 1 in the collection,
     * in the GUI and in the Player class.
     */
    public void changeHairless()
    {
        int numberListed = Integer.parseInt(hairlessRatCollectionTotal.getText());
        currentGame.getPlayer().setTotalHairless(numberListed);

        int updatedNumber = (currentGame.getPlayer().getTotalHairless()) + 1;
        hairlessRatCollectionTotal.setText(Integer.toString(updatedNumber));
        currentGame.getPlayer().setTotalHairless(updatedNumber);
    }

    /**
     * This method is used to increase the amount
     * of Russian blue rats by 1 in the collection,
     * in the GUI and in the Player class.
     */
    public void changeRussianBlue()
    {
        int numberListed = Integer.parseInt(russianBlueRatCollectionTotal.getText());
        currentGame.getPlayer().setTotalRussianBlue(numberListed);

        int updatedNumber = (currentGame.getPlayer().getTotalRussianBlue()) + 1;
        russianBlueRatCollectionTotal.setText(Integer.toString(updatedNumber));
        currentGame.getPlayer().setTotalRussianBlue(updatedNumber);
    }

    /**
     * This method is used to increase the amount
     * of patchwork rats by 1 in the collection,
     * in the GUI and in the Player class.
     */
    public void changePatchwork()
    {
        int numberListed = Integer.parseInt(patchworkRatCollectionTotal.getText());
        currentGame.getPlayer().setTotalPatchwork(numberListed);

        int updatedNumber = (currentGame.getPlayer().getTotalPatchwork()) + 1;
        patchworkRatCollectionTotal.setText(Integer.toString(updatedNumber));
        currentGame.getPlayer().setTotalPatchwork(updatedNumber);
    }

    /**
     * This method is used to increase the amount
     * of manx rats by 1 in the collection,
     * in the GUI and in the Player class.
     */
    public void changeManx()
    {
        int numberListed = Integer.parseInt(manxRatCollectionTotal.getText());
        currentGame.getPlayer().setTotalManx(numberListed);

        int updatedNumber = (currentGame.getPlayer().getTotalManx()) + 1;
        manxRatCollectionTotal.setText(Integer.toString(updatedNumber));
        currentGame.getPlayer().setTotalManx(updatedNumber);
    }

    /**
     * This method is used to establish the amount of
     * each rat in the collection GUI to the Player
     * class.
     */
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
        gameFrame.setLocationRelativeTo(null);
        gameFrame.setVisible(true);
    }
}
