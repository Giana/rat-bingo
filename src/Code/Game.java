package Code;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Game
{
    private Board playerBoard;                                 // Board for the player
    private Board npcBoard;                                    // Board for the NPC
    private String playerState;                                // Winning state for player
    private String npcState;                                   // Winning state for NPC
    private String mode;                                       // Game mode
    private ArrayList<Integer> toCall = new ArrayList<>();     // List of random numbers to call
    private ArrayList<String> called = new ArrayList<>();      // List of numbers already called
    private NPC npcPlayer;                                     // NPC playing against player
    private Player player;                                     // The player
    private ArrayList<Integer> gameData = new ArrayList<>();   // List for game stats
    private boolean soundStatus = true;                        // If sound is on/muted

    // Default constructor - for testing where mode is irrelevant
    public Game()
    {
        playerBoard = new Board();
        player = new Player();
        npcBoard = new Board();
        npcPlayer = new NPC();
        playerState = "N/A";
        npcState = "N/A";
        reset();
        callsGenerator();
        called.add("FREE");
    }

    // Parameterized constructor
    public Game(String mode)
    {
        playerBoard = new Board();
        player = new Player();
        npcBoard = new Board();
        npcPlayer = new NPC();
        playerState = "N/A";
        npcState = "N/A";
        this.mode = mode;
        reset();
        callsGenerator();
        called.add("FREE");
    }

    // Getters & setters
    public Board getPlayerBoard() { return playerBoard; }

    public Board getNpcBoard() { return npcBoard; }

    public String getPlayerState() { return playerState; }

    public void setPlayerState(String playerState) { this.playerState = playerState; }

    public String getNpcState() { return npcState; }

    public void setNpcState(String npcState) { this.npcState = npcState; }

    public String getMode() { return mode; }

    public void setMode(String mode) { this.mode = mode; }

    public ArrayList<Integer> getToCall() { return toCall; }

    public ArrayList<String> getCalled() { return called; }

    public NPC getNpcPlayer() { return npcPlayer; }

    public void setNpcPlayer(NPC npcPlayer) { this.npcPlayer = npcPlayer; }

    public Player getPlayer() { return player; }

    public void setPlayer(Player player) { this.player = player; }

    public ArrayList<Integer> getGameData() { return gameData; }

    public void setGameData(ArrayList<Integer> gameData) { this.gameData = gameData; }

    public boolean getSoundStatus() { return soundStatus; }

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
                playerState = "N/A";

                npcBoard.getMap()[i][j].setSelected(false);
                npcState = "N/A";
            }
        }

        toCall.clear();
        called.clear();
    }

    // Checks a board for a win based on the game mode
    public String checkWin(Board board)
    {
        String state = "N/A";

        switch (mode)
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

    // TODO: encrypt data
    // Saves the total wins and losses of Player for the game
    public void saveGame() throws IOException
    {
        FileWriter fileWriter = new FileWriter("Saves/Save.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.println(player.getTotalWins());
        printWriter.println(player.getTotalLosses());
        printWriter.println(player.getTotalDollars());

        for(int i = 0; i < 10; i++)
        {
            printWriter.println(player.getRatData().get(i));
        }

        printWriter.close();
    }

    // Loads the total wins and losses of Player for the game
    public void loadGame() throws IOException
    {
        File saveFile = new File("Saves/Save.txt");
        Scanner input = new Scanner(saveFile);

        while(input.hasNextLine())
        {
            gameData.add(Integer.parseInt(input.nextLine()));
        }
    }
}