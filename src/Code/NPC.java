package Code;

public class NPC
{
    // Default constructor
    public NPC() { }

    public boolean checkForTileValue(int tileValue, Game currentGame)
    {
        int size = currentGame.getNpcBoard().getSize();

        // Check for a B
        if(tileValue >= 1 && tileValue <= 15)
        {

        }
        // Check for an I
        else if(tileValue >= 16 && tileValue <= 30)
        {

        }
        // Check for N
        else if(tileValue >= 31 && tileValue <= 45)
        {

        }
        // Check for G
        else if(tileValue >= 46 && tileValue <= 60)
        {

        }
        // Check for O
        else if(tileValue >= 61 && tileValue <= 75)
        {

        }
        else
        {
            return false;
        }
    }

    public void markTile()
    {

    }
}
