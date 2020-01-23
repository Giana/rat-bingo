package Code;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * The Rat Bingo program is a bingo game with a rat theme.
 *
 * @author  Giana (Github: G-i-a-n-a - Website: Giana.dev)
 * @version 1.0
 * @since   2019-01-??
 */
public class Game
{
    private Board playerBoard;                                 // Board for the player
    private Board npcBoard;                                    // Board for the NPC
    private String mode;                                       // Game mode
    private ArrayList<Integer> toCall = new ArrayList<>();     // List of random numbers to call
    private ArrayList<String> called = new ArrayList<>();      // List of numbers already called
    private NPC npcPlayer;                                     // NPC playing against player
    private Player player;                                     // The player
    private ArrayList<Integer> gameData = new ArrayList<>();   // List for game stats
    private boolean soundStatus = true;                        // If sound is on/muted

    /**
     * This is the default constructor for Game.
     * It creates new instances of a Player and
     * an NPC, and generates a new Board for the
     * Player, and a new Board for the NPC. It
     * resets the Player and NPC Boards back to
     * default, as well as the call lists. It
     * creates a new shuffled list of numbers to
     * call, and adds the free space to the list
     * of numbers already called.
     */
    public Game()
    {
        playerBoard = new Board();
        player = new Player();
        npcBoard = new Board();
        npcPlayer = new NPC();
        reset();
        callsGenerator();
        called.add("FREE");
    }

    /**
     * This is the parameterized constructor
     * for Game. It creates new instances of a
     * Player and an NPC, and generates a new
     * Board for the Player, and a new Board for
     * the NPC. It resets the Player and NPC
     * Boards back to default, as well as the call
     * lists. It creates a new shuffled list of
     * numbers to call, and adds the free space to
     * the list of numbers already called. It also
     * assigns a game mode to the Game.
     * @param mode Game mode to assign to Game
     */
    public Game(String mode)
    {
        playerBoard = new Board();
        player = new Player();
        npcBoard = new Board();
        npcPlayer = new NPC();
        this.mode = mode;
        reset();
        callsGenerator();
        called.add("FREE");
    }

    /**
     * @return Board Player's Board
     */
    public Board getPlayerBoard() { return playerBoard; }

    /**
     * @return Board NPC's Board
     */
    public Board getNpcBoard() { return npcBoard; }

    /**
     * @param mode Mode to assign to Game
     */
    public void setMode(String mode) { this.mode = mode; }

    /**
     * @return ArrayList<Integer> List of numbers to call
     */
    public ArrayList<Integer> getToCall() { return toCall; }

    /**
     * @return ArrayList<Integer> List of numbers called
     */
    public ArrayList<String> getCalled() { return called; }

    /**
     * @return Player Game's Player
     */
    public Player getPlayer() { return player; }

    /**
     * @return NPC Game's NPC player
     */
    public NPC getNpcPlayer() { return npcPlayer; }

    /**
     * @return boolean Status of sound (toggled on/off)
     */
    public boolean getSoundStatus() { return soundStatus; }

    /**
     * @param soundStatus Sound status to assign to Game (toggle on/off)
     */
    public void setSoundStatus(boolean soundStatus) { this.soundStatus = soundStatus; }

    // Checks a single row for a horizontal win
    public boolean checkRow(Board board, int row)
    {
        int size = board.getSize();

        for(int i = 0; i < size; i++)
        {
            if(!(board.getMap()[row][i].getSelected() &&
                    called.contains(board.getMap()[row][i].toString())))
            {
                return false;
            }
        }

        return true;
    }

    // Checks for a horizontal win
    public String checkHorizontal(Board board)
    {
        int size = board.getSize();

        for(int i = 0; i < size; i++)
        {
            if(checkRow(board, i))
            {
                return "horizontal" + i;
            }
        }

        return "N/A";
    }

    // Checks a single column for a vertical win
    public boolean checkColumn(Board board, int column)
    {
        int size = board.getSize();

        for(int i = 0; i < size; i++)
        {
            if(!(board.getMap()[i][column].getSelected() &&
                    called.contains(board.getMap()[i][column].toString())))
            {
                return false;
            }
        }

        return true;
    }

    // Checks for a vertical win
    public String checkVertical(Board board)
    {
        int size = board.getSize();

        for(int i = 0; i < size; i++)
        {
            if(checkColumn(board, i))
            {
                return "vertical" + i;
            }
        }

        return "N/A";
    }

    // Check for a diagonal win
    public String checkDiagonal(Board board)
    {
        int size = board.getSize();
        int j = 4;
        String rightState = "N/A";
        String leftState = "N/A";

        // Check from top left
        for(int i = 0; i < size; i++)
        {
            if(board.getMap()[i][i].getSelected() &&
                    called.contains(board.getMap()[i][i].toString()))
            {
                leftState = "diagonal";
            }
            else
            {
                leftState = "N/A";
                break;
            }
        }

        // Check from top right
        for(int i = 0; i < size; i++)
        {
            if(board.getMap()[i][j].getSelected() &&
                    called.contains(board.getMap()[i][j].toString()))
            {
                rightState = "diagonal";
                j--;
            }
            else
            {
                rightState = "N/A";
                break;
            }
        }

        // Only a left diagonal
        if(leftState.equals("diagonal") && rightState.equals("N/A"))
        {
            return "diagonalL";
        }
        // Only a right diagonal
        else if(leftState.equals("N/A") && rightState.equals("diagonal"))
        {
            return "diagonalR";
        }
        // Both diagonals
        else if(leftState.equals("diagonal") && rightState.equals("diagonal"))
        {
            return "diagonalLR";
        }
        // Nothing was found
        else
        {
            return "N/A";
        }
    }

    // Check for an X win
    public String checkX(Board board)
    {
        String state = checkDiagonal(board);

        // Two diagonals found (an X)
        if(state.equals("diagonalLR"))
        {
            return "x";
        }
        else
        {
            return "N/A";
        }
    }

    // Check for a four corners win
    public String checkCorners(Board board)
    {
        int lowerBound = 0;
        int upperBound = (board.getSize() - 1);
        String state = "N/A";

        if(board.getMap()[lowerBound][lowerBound].getSelected() &&
                called.contains(board.getMap()[lowerBound][lowerBound].toString()) &&
                board.getMap()[lowerBound][upperBound].getSelected() &&
                called.contains(board.getMap()[lowerBound][upperBound].toString()) &&
                board.getMap()[upperBound][lowerBound].getSelected() &&
                called.contains(board.getMap()[upperBound][lowerBound].toString()) &&
                board.getMap()[upperBound][upperBound].getSelected() &&
                called.contains(board.getMap()[upperBound][upperBound].toString()))
        {
            state = "corners";
        }

        return state;
    }

    // Check for a T win
    public String checkT(Board board)
    {
        int row = 0;
        int column = 2;

        // Check row and column that make a T
        if(checkRow(board, row) && checkColumn(board, column))
        {
            return "t";
        }

        // Nothing found
        return "N/A";
    }

    // Check for L win
    public String checkL(Board board)
    {
        int row = 4;
        int column = 0;

        // Check row and column that make a L
        if(checkRow(board, row) && checkColumn(board, column))
        {
            return "l";
        }

        // Nothing found
        return "N/A";
    }

    // Check for all win
    public String checkAll(Board board)
    {
        int size = board.getSize();

        for(int i = 0; i < size; i++)
        {
            if(!(checkRow(board, i)))
            {
                return "N/A";
            }
        }

        return "all";
    }

    // Resets player and NPC boards to have no calls/wins, resets call lists
    public void reset()
    {
        int size = playerBoard.getSize();

        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                playerBoard.getMap()[i][j].setSelected(false);
                npcBoard.getMap()[i][j].setSelected(false);
            }
        }

        toCall.clear();
        called.clear();
    }

    // Checks a board for a win based on the game mode
    public String checkWin(Board board)
    {
        String state = "N/A";

        switch(mode)
        {
            case "horizontal":
                state = checkHorizontal(board);
                break;
            case "vertical":
                state = checkVertical(board);
                break;
            case "diagonal":
                state = checkDiagonal(board);
                break;
            case "x":
                state = checkX(board);
                break;
            case "corners":
                state = checkCorners(board);
                break;
            case "t":
                state = checkT(board);
                break;
            case "l":
                state = checkL(board);
                break;
            case "all":
                state = checkAll(board);
                break;
        }

        return state;
    }

    // Initializes calls list
    public void callsGenerator()
    {
        // Add possible numbers to calls list (1 - 75)
        for(int i = 1; i <= 75; i++)
        {
            toCall.add(i);
        }

        // Shuffle so it's not in order
        Collections.shuffle(toCall);
    }

    // Returns first number from the toCall list (pre-shuffled)
    public int runCaller()
    {
        int calling = toCall.get(0);

        // Add to list of numbers called
        called.add(Integer.toString(calling));

        toCall.remove(0);

        return calling;
    }

    // Saves the total wins/losses/dollars/rats of Player for the game
    public void saveGame() throws IOException
    {
        FileWriter fileWriter = new FileWriter("Saves/Save.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);

        printWriter.println(player.getTotalWins());
        printWriter.println(player.getTotalLosses());
        printWriter.println(player.getTotalDollars());
        printWriter.println(player.getTotalHooded());
        printWriter.println(player.getTotalAgouti());
        printWriter.println(player.getTotalBerkshire());
        printWriter.println(player.getTotalRoan());
        printWriter.println(player.getTotalAlbino());
        printWriter.println(player.getTotalSiamese());
        printWriter.println(player.getTotalHairless());
        printWriter.println(player.getTotalRussianBlue());
        printWriter.println(player.getTotalPatchwork());
        printWriter.println(player.getTotalManx());

        printWriter.close();
    }

    // Loads the total wins/losses/dollars/rats of Player for the game
    public void loadGame() throws IOException
    {
        File saveFile = new File("Saves/Save.txt");
        Scanner input = new Scanner(saveFile);

        while(input.hasNextLine())
        {
            gameData.add(Integer.parseInt(input.nextLine()));
        }

        if(!gameData.isEmpty())
        {
            player.setTotalWins(gameData.get(0));
            player.setTotalLosses(gameData.get(1));
            player.setTotalDollars(gameData.get(2));
            player.setTotalHooded(gameData.get(3));
            player.setTotalAgouti(gameData.get(4));
            player.setTotalBerkshire(gameData.get(5));
            player.setTotalRoan(gameData.get(6));
            player.setTotalAlbino(gameData.get(7));
            player.setTotalSiamese(gameData.get(8));
            player.setTotalHairless(gameData.get(9));
            player.setTotalRussianBlue(gameData.get(10));
            player.setTotalPatchwork(gameData.get(11));
            player.setTotalManx(gameData.get(12));
        }
    }

    // Deletes items in save file
    public void deleteSave() throws IOException
    {
        FileWriter fileWriter = new FileWriter("Saves/Save.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);

        for(int i = 0; i < 13; i++)
        {
            printWriter.println("0");
        }

        printWriter.close();
    }
}