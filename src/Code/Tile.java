package Code;

/**
 * The Rat Bingo program is a bingo game with a rat theme.
 *
 * @author  Giana (Github: G-i-a-n-a - Website: Giana.dev)
 * @version 1.0
 * @since   2019-01-??
 */
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

    // Returns tile value as a string
    public String toString()
    {
        return Integer.toString(number);
    }
}