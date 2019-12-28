public class Tile
{
    private String letter;
    private int number;
    private boolean called;
    private boolean selected;

    // Constructor
    // Creates a new bingo tile
    public Tile(String letter, int number)
    {
        this.letter = letter;
        this.number = number;
    }

    // Various getters & setters
    public String getLetter() { return letter; }

    public void setLetter(String letter) { this.letter = letter; }

    public int getNumber() { return number; }

    public void setNumber(int number) { this.number = number; }

    public boolean getCalled() { return called; }

    public void setCalled(boolean called) { this.called = called; }

    public boolean getSelected() { return selected; }

    public void setSelected(boolean selected) { this.selected = selected; }
}
