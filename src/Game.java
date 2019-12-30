public class Game
{
    private Board playerBoard;     // Board for the player
    private Board npcBoard;        // Board for the NPC
    private String playerState;   // Winning state for player
    private String npcState;      // Winning state for NPC


    // Default constructor
    public Game()
    {
        playerBoard = new Board();
        npcBoard = new Board();
        playerState = "N/A";
        npcState = "N/A";
    }

    // Getters & setters
    public Board getPlayerBoard() { return playerBoard; }

    public Board getNpcBoard() { return npcBoard; }

    public String getPlayerState() { return playerState; }

    public void setPlayerState(String playerState) { this.playerState = playerState; }

    public String getNpcState() { return npcState; }

    public void setNpcState(String npcState) { this.npcState = npcState; }

    // Checks a single row for a horizontal win
    public boolean checkRow(Board board, int row)
    {
        int size = board.getSize();

        for(int i = 0; i < size; i++)
        {
            if(board.getMap()[row][i].getCalled() &&
                    board.getMap()[row][i].getSelected())
            {
                continue;
            }
            else
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
            else
            {
                continue;
            }
        }

        return "N/A";
    }

    // Checks a single column for a verticle win
    public boolean checkColumn(Board board, int column)
    {
        int size = board.getSize();

        for(int i = 0; i < size; i++)
        {
            if(board.getMap()[i][column].getCalled() &&
                    board.getMap()[i][column].getSelected())
            {
                continue;
            }
            else
            {
                return false;
            }
        }

        return true;
    }

    // Checks for a verticle win
    public String checkVerticle(Board board)
    {
        int size = board.getSize();

        for(int i = 0; i < size; i++)
        {
            if(checkColumn(board, i))
            {
                return "verticle" + i;
            }
            else
            {
                continue;
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
            if(board.getMap()[i][i].getCalled() &&
                    board.getMap()[i][i].getSelected())
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
            if(board.getMap()[i][j].getCalled() &&
                    board.getMap()[i][j].getSelected())
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
        if(leftState == "diagonal" && rightState == "N/A")
        {
            return "diagonalL";
        }
        // Only a right diagonal
        else if(leftState == "N/A" && rightState == "diagonal")
        {
            return "diagonalR";
        }
        // Both diagonals
        else if(leftState == "diagonal" && rightState == "diagonal")
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
        if(state == "diagonalLR")
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
        int upperBound = board.getSize();
        String state = "N/A";

        if(board.getMap()[lowerBound][lowerBound].getCalled() &&
                board.getMap()[lowerBound][lowerBound].getSelected() &&
                board.getMap()[lowerBound][upperBound].getCalled() &&
                board.getMap()[lowerBound][upperBound].getSelected() &&
                board.getMap()[upperBound][lowerBound].getCalled() &&
                board.getMap()[upperBound][lowerBound].getSelected() &&
                board.getMap()[upperBound][upperBound].getCalled() &&
                board.getMap()[upperBound][upperBound].getSelected())
        {
            state = "corners";
        }

        return state;
    }

    // Check for a T win
    public String checkT(Board board)
    {
        int size = board.getSize();
        int row = 0;
        int column = (int) Math.floor(size / 2);
        String state = "N/A";
        String horizontalState = "N/A";
        String verticleState = "N/A";

        // Check horizontal
        for(int i = 0; i < size; i++)
        {
            if(board.getMap()[row][i].getCalled() &&
                    board.getMap()[row][i].getSelected())
            {
                horizontalState = "horizonal";
            }
            else
            {
                horizontalState = "N/A";
                break;
            }
        }
        // Check verticle
        for(int i = 0; i < size; i++)
        {
            if(board.getMap()[i][column].getCalled() &&
                    board.getMap()[i][column].getSelected())
            {
                verticleState = "verticle";
            }
            else
            {
                verticleState = "N/A";
                break;
            }
        }

        // Check for T conditions
        if(horizontalState == "horizontal" && verticleState == "verticle")
        {
            state = "t";
        }

        return state;
    }

    // Check for L win
    public String checkL(Board board)
    {
        int size = board.getSize();
        int row = (size - 1);
        int column = 0;
        String state = "N/A";
        String horizontalState = "N/A";
        String verticleState = "N/A";

        // Check horizontal
        for(int i = 0; i < size; i++)
        {
            if(board.getMap()[row][i].getCalled() &&
                    board.getMap()[row][i].getSelected())
            {
                horizontalState = "horizonal";
            }
            else
            {
                horizontalState = "N/A";
                break;
            }
        }
        // Check verticle
        for(int i = 0; i < size; i++)
        {
            if(board.getMap()[i][column].getCalled() &&
                    board.getMap()[i][column].getSelected())
            {
                verticleState = "verticle";
            }
            else
            {
                verticleState = "N/A";
                break;
            }
        }

        // Check for T conditions
        if(horizontalState == "horizontal" && verticleState == "verticle")
        {
            state = "t";
        }

        return state;
    }

    // Check for all win
    public String checkAll(Board board)
    {
        int size = board.getSize();
        int rowCount = 0;
        String horizontalState = "N/A";
        String state = "N/A";

        while(rowCount < size)
        {
            for(int i = 0; i < size; i++)
            {
                if(board.getMap()[rowCount][i].getCalled() &&
                        board.getMap()[rowCount][i].getSelected())
                {
                    horizontalState = "horizontal";
                }
                else
                {
                    state = "N/A";
                    break;
                }
            }

            rowCount++;
        }

        if(horizontalState == "horizontal")
        {
            state = "all";
        }

        return state;
    }

    // Resets player and NPC boards to have no calls/selections/wins
    public void reset()
    {
        int size = playerBoard.getSize();

        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                playerBoard.getMap()[i][j].setCalled(false);
                playerBoard.getMap()[i][j].setSelected(false);
                playerState = "N/A";

                npcBoard.getMap()[i][j].setCalled(false);
                npcBoard.getMap()[i][j].setSelected(false);
                npcState = "N/A";
            }
        }
    }
}