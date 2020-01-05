package Code;

import java.util.ArrayList;
import java.util.Collections;

public class Game
{
    private Board playerBoard;                               // Board for the player
    private Board npcBoard;                                  // Board for the NPC
    private String playerState;                              // Winning state for player
    private String npcState;                                 // Winning state for NPC
    private String mode;                                     // Game mode
    private ArrayList<Integer> toCall = new ArrayList<>();   // List of random numbers to call
    private ArrayList<Integer> called = new ArrayList<>();   // List of numbers already called
    private int totalWins;                                   // Total amount of game wins
    private int totalLosses;                                 // Total amount of game losses
    private NPC npcPlayer;                                   // NPC playing against player


    // Default constructor - for testing where mode is irrelevant
    public Game()
    {
        playerBoard = new Board();
        npcBoard = new Board();
        npcPlayer = new NPC();
        playerState = "N/A";
        npcState = "N/A";
        reset();
        callsGenerator();
    }

    // Parameterized constructor
    public Game(String mode)
    {
        playerBoard = new Board();
        npcBoard = new Board();
        npcPlayer = new NPC();
        playerState = "N/A";
        npcState = "N/A";
        this.mode = mode;
        reset();
        callsGenerator();
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

    public ArrayList<Integer> getCalled() { return called; }

    public int getTotalWins() { return totalWins; }

    public void setTotalWins(int totalWins) { this.totalWins = totalWins; }

    public int getTotalLosses() { return totalLosses; }

    public void setTotalLosses(int totalLosses) { this.totalLosses = totalLosses; }

    public NPC getNpcPlayer() { return npcPlayer; }

    public void setNpcPlayer(NPC npcPlayer) { this.npcPlayer = npcPlayer; }

    // Checks a single row for a horizontal win
    public boolean checkRow(Board board, int row)
    {
        int size = board.getSize();

        for(int i = 0; i < size; i++)
        {
            if(!(board.getMap()[row][i].getSelected() &&
                    called.contains(board.getMap()[row][i].getNumber())))
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
                    called.contains(board.getMap()[i][column].getNumber())))
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
                    called.contains(board.getMap()[i][i].getNumber()))
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
                    called.contains(board.getMap()[i][j].getNumber()))
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
                called.contains(board.getMap()[lowerBound][lowerBound].getNumber()) &&
                board.getMap()[lowerBound][upperBound].getSelected() &&
                called.contains(board.getMap()[lowerBound][upperBound].getNumber()) &&
                board.getMap()[upperBound][lowerBound].getSelected() &&
                called.contains(board.getMap()[upperBound][lowerBound].getNumber()) &&
                board.getMap()[upperBound][upperBound].getSelected() &&
                called.contains(board.getMap()[upperBound][upperBound].getNumber()))
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
        called.add(calling);

        toCall.remove(0);

        return calling;
    }
}