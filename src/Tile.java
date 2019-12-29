 public class Tile
{
    private int number;
    private boolean called;
    private boolean selected;

    // Default constructor
    public Tile()
    {
        called = false;
        selected = false;
    }

    // Parameterized constructor
    public Tile(int number)
    {
        this.number = number;
        called = false;
        selected = false;
    }

    // Various getters & setters
    public int getNumber() { return number; }

    public void setNumber(int number) { this.number = number; }

    public boolean getCalled() { return called; }

    public void setCalled(boolean called) { this.called = called; }

    public boolean getSelected() { return selected; }

    public void setSelected(boolean selected) { this.selected = selected; }
}
