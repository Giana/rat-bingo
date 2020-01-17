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

    /**
     * This is the default constructor for Tile.
     * It sets the selection status to false.
     */
    public Tile()
    {
        selected = false;
    }

    /**
     * This is the parameterized constructor
     * for Tile. It assigns a number to Tile,
     * and sets the selection status to false.
     * @param number Number to assign to Tile
     */
    public Tile(int number)
    {
        this.number = number;
        selected = false;
    }

    /**
     * @return int Number assigned to Tile
     */
    public int getNumber() { return number; }

    /**
     * @param number Number to assign to Tile
     */
    public void setNumber(int number) { this.number = number; }

    /**
     * @return boolean Selection status of Tile
     */
    public boolean getSelected() { return selected; }

    /**
     * @param selected Selection status to assign to Tile
     */
    public void setSelected(boolean selected) { this.selected = selected; }

    /**
     * This method is used to return
     * the Tile number as a string.
     * @return String Tile number as a string
     */
    public String toString()
    {
        return Integer.toString(number);
    }
}