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

    // Checks for a horizontal win
    public String checkHorizontal(Board board)
    {
        int size = board.getSize();
        int rowCount = 0;
        String state = "N/A";

        while(rowCount < size)
        {
            for(int i = 0; i < size; i++)
            {
                if(board.getMap()[rowCount][i].getCalled() &&
                        board.getMap()[rowCount][i].getSelected())
                {
                    state = "horizonal";
                }
                else
                {
                    state = "N/A";
                    break;
                }
            }

            rowCount++;
        }

        return state;
    }

    // Checks for a verticle win
    public String checkVerticle(Board board)
    {
        int size = board.getSize();
        int columnCount = 0;
        String state = "N/A";

        while(columnCount < size)
        {
            for(int i = 0; i < size; i++)
            {
                if(board.getMap()[i][columnCount].getCalled() &&
                        board.getMap()[i][columnCount].getSelected())
                {
                    state = "verticle";
                }
                else
                {
                    state = "N/A";
                    break;
                }
            }

            columnCount++;
        }

        return state;
    }

    // Check for a diagonal win
    public String checkDiagonal(Board board)
    {
        int size = board.getSize();
        int j = 4;
        String state = "N/A";
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

        if(leftState == "diagonal" || rightState == "diagonal")
        {
            state = "diagonal";
        }

        return state;
    }

    // Check for an X win
    public String checkX(Board board)
    {
        int size = board.getSize();
        int j = 4;
        String state = "N/A";
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

        // Check for X conditions
        if(leftState == "diagonal" && rightState == "diagonal")
        {
            state = "x";
        }

        return state;
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
}
