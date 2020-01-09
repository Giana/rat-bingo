package Code;

import java.util.ArrayList;

public class Player
{
    private int totalWins;                                     // Total wins for Player
    private int totalLosses;                                   // Total losses for Player
    private int totalDollars;                                  // Amount of money player has
    private ArrayList<Integer> ratData = new ArrayList<>();    // List for rat collection data

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

    public int getTotalDollars() { return totalDollars; }

    public void setTotalDollars(int totalDollars) { this.totalDollars = totalDollars; }

    public ArrayList<Integer> getRatData() { return ratData; }

    public void setRatData(ArrayList<Integer> ratData) { this.ratData = ratData; }
}
