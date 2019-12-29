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
}
