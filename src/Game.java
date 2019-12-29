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
        int rowCount = 0;
        String state = "N/A";

        while(rowCount < 5)
        {
            for(int i = 0; i < 5; i++)
            {
                if(board.getMap()[rowCount][i].getCalled() == true &&
                        board.getMap()[rowCount][i].getSelected() == true)
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
        int columnCount = 0;
        String state = "N/A";

        while(columnCount < 5)
        {
            for(int i = 0; i < 5; i++)
            {
                if(board.getMap()[i][columnCount].getCalled() == true &&
                        board.getMap()[i][columnCount].getSelected() == true)
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
}
