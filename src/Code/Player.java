package Code;

public class Player
{
    private int totalWins;     // Total wins for Player
    private int totalLosses;   // Total losses for Player

    // Default constructor
    public Player() { }

    // Parameterized constructor
    public Player(int totalWins, int totalLosses)
    {
        this.totalWins = totalWins;
        this.totalLosses = totalLosses;
    }

    // Getters & setters
    public int getTotalWins() { return totalWins; }

    public void setTotalWins(int totalWins) { this.totalWins = totalWins; }

    public int getTotalLosses() { return totalLosses; }

    public void setTotalLosses(int totalLosses) { this.totalLosses = totalLosses; }
}
