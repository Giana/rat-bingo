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

    private Game currentGame;
    private static List<JButton> buttons;

    public GUI()
    {
        // Click small "Rat Bingo" logo on left panel
        smallRatBingoLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Things you should just see in game
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

                // Things you need to see while in game
                setGameStatsVisibility(true);

                // Display game panel
                switchPanel.removeAll();
                switchPanel.add(gamePanel);
                switchPanel.revalidate();
                switchPanel.repaint();

                // Create new game
                //currentGame = new Game("corners");

                //Initialize board GUI
                //initBoardGUI();
                //gamePanel.repaint();
                //gamePanel.revalidate();
            }
        });

        // Click "Diagonal" on left panel
        diagonalLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Create new game
                //currentGame = new Game("diagonal");

                // Things you need to see while in game
                setGameStatsVisibility(true);

                // Display game panel
                switchPanel.removeAll();
                switchPanel.add(gamePanel);
                switchPanel.repaint();
                switchPanel.revalidate();
            }
        });

        // Click "Horizontal" on left panel
        horizontalLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Create new game
                //currentGame = new Game("horizontal");

                // Things you need to see while in game
                setGameStatsVisibility(true);

                // Display game panel
                switchPanel.removeAll();
                switchPanel.add(gamePanel);
                switchPanel.repaint();
                switchPanel.revalidate();
            }
        });

        // Click "Vertical" on left panel
        verticalLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Create new game
                //currentGame = new Game("vertical");

                // Things you need to see while in game
                setGameStatsVisibility(true);

                // Display game panel
                switchPanel.removeAll();
                switchPanel.add(gamePanel);
                switchPanel.repaint();
                switchPanel.revalidate();
            }
        });

        // Click "L" on left panel
        lLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Create new game
                //currentGame = new Game("l");

                // Things you need to see while in game
                setGameStatsVisibility(true);

                // Display game panel
                switchPanel.removeAll();
                switchPanel.add(gamePanel);
                switchPanel.repaint();
                switchPanel.revalidate();
            }
        });

        // Click "T" on left panel
        tLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Create new game
                //currentGame = new Game("t");

                // Things you need to see while in game
                setGameStatsVisibility(true);

                // Display game panel
                switchPanel.removeAll();
                switchPanel.add(gamePanel);
                switchPanel.repaint();
                switchPanel.revalidate();
            }
        });

        // Click "X" on left panel
        xLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Create new game
                //currentGame = new Game("x");

                // Things you need to see while in game
                setGameStatsVisibility(true);

                // Display game panel
                switchPanel.removeAll();
                switchPanel.add(gamePanel);
                switchPanel.repaint();
                switchPanel.revalidate();
            }
        });

        // Click "All" on left panel
        allLogoImage.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                super.mouseClicked(e);

                // Create new game
                //currentGame = new Game("all");

                // Things you need to see while in game
                setGameStatsVisibility(true);

                // Display game panel
                switchPanel.removeAll();
                switchPanel.add(gamePanel);
                switchPanel.repaint();
                switchPanel.revalidate();
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

                // Things you should just see in game
                setGameStatsVisibility(false);

                // Display help panel
                switchPanel.removeAll();
                switchPanel.add(helpPanel);
                switchPanel.repaint();
                switchPanel.revalidate();
            }
        });
    }

    // Puts every JButton into "buttons" to be referenced
    public void createButtonList()
    {
        for(Component x: boardPanel.getComponents())
        {
            if(x instanceof JButton)
            {
                buttons.add((JButton) x);
            }
        }
    }

    public void initBoardGUI()
    {
        int k = 0;
        int size = currentGame.getPlayerBoard().getSize();

        createButtonList();

        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                JButton currButton = buttons.get(k);
                String currText = Integer.toString(currentGame.getPlayerBoard().getMap()[i][j].getNumber());
                currButton.setText(currText);
                k++;
            }
            System.out.println();
        }
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
