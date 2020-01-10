package Code;

public class Player
{
    private int totalWins;
    private int totalLosses;
    private int totalDollars;
    private int totalHooded;
    private int totalAgouti;
    private int totalBerkshire;
    private int totalRoan;
    private int totalAlbino;
    private int totalSiamese;
    private int totalHairless;
    private int totalRussianBlue;
    private int totalPatchwork;
    private int totalManx;

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

    public int getTotalHooded() { return totalHooded; }

    public void setTotalHooded(int totalHooded) { this.totalHooded = totalHooded; }

    public int getTotalAgouti() { return totalAgouti; }

    public void setTotalAgouti(int totalAgouti) { this.totalAgouti = totalAgouti; }

    public int getTotalBerkshire() { return totalBerkshire; }

    public void setTotalBerkshire(int totalBerkshire) { this.totalBerkshire = totalBerkshire; }

    public int getTotalRoan() { return totalRoan; }

    public void setTotalRoan(int totalRoan) { this.totalRoan = totalRoan; }

    public int getTotalAlbino() { return totalAlbino; }

    public void setTotalAlbino(int totalAlbino) { this.totalAlbino = totalAlbino; }

    public int getTotalSiamese() { return totalSiamese; }

    public void setTotalSiamese(int totalSiamese) { this.totalSiamese = totalSiamese; }

    public int getTotalHairless() { return totalHairless; }

    public void setTotalHairless(int totalHairless) { this.totalHairless = totalHairless; }

    public int getTotalRussianBlue() { return totalRussianBlue; }

    public void setTotalRussianBlue(int totalRussianBlue) { this.totalRussianBlue = totalRussianBlue; }

    public int getTotalPatchwork() { return totalPatchwork; }

    public void setTotalPatchwork(int totalPatchwork) { this.totalPatchwork = totalPatchwork; }

    public int getTotalManx() { return totalManx; }

    public void setTotalManx(int totalManx) { this.totalManx = totalManx; }
}
