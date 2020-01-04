package Code;

public class Tile
{
    private int number;
    private boolean selected;

    // Default constructor
    public Tile()
    {
        selected = false;
    }

    // Parameterized constructor
    public Tile(int number)
    {
        this.number = number;
        selected = false;
    }

    // Various getters & setters
    public int getNumber() { return number; }

    public void setNumber(int number) { this.number = number; }

    public boolean getSelected() { return selected; }

    public void setSelected(boolean selected) { this.selected = selected; }
}
