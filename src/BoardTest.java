import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest
{
    @Test // Test board initialization
    public void testBoard()
    {
        Board testBoard = new Board();
        int size = testBoard.getSize();

        // Ranges for letters
        int bMin = 1, bMax = 15;
        int iMin = 16, iMax = 30;
        int nMin = 31, nMax = 45;
        int gMin = 46, gMax = 60;
        int oMin = 61, oMax = 75;

        // Check Bs
        for(int i = 0; i < size; i++)
        {
            Tile testTile = testBoard.getMap()[i][0];
            assertTrue(testTile.getNumber() >= bMin);
            assertTrue(testTile.getNumber() <= bMax);
            assertFalse(testTile.getCalled());
            assertFalse(testTile.getSelected());
        }

        // Check Is
        for(int i = 0; i < size; i++)
        {
            Tile testTile = testBoard.getMap()[i][1];
            assertTrue(testTile.getNumber() >= iMin);
            assertTrue(testTile.getNumber() <= iMax);
            assertFalse(testTile.getCalled());
            assertFalse(testTile.getSelected());
        }

        // Check Ns
        for(int i = 0; i < size; i++)
        {
            Tile testTile = testBoard.getMap()[i][2];
            assertTrue(testTile.getNumber() >= nMin);
            assertTrue(testTile.getNumber() <= nMax);
            assertFalse(testTile.getCalled());
            assertFalse(testTile.getSelected());
        }

        // Check Gs
        for(int i = 0; i < size; i++)
        {
            Tile testTile = testBoard.getMap()[i][3];
            assertTrue(testTile.getNumber() >= gMin);
            assertTrue(testTile.getNumber() <= gMax);
            assertFalse(testTile.getCalled());
            assertFalse(testTile.getSelected());
        }

        // Check Os
        for(int i = 0; i < size; i++)
        {
            Tile testTile = testBoard.getMap()[i][4];
            assertTrue(testTile.getNumber() >= oMin);
            assertTrue(testTile.getNumber() <= oMax);
            assertFalse(testTile.getCalled());
            assertFalse(testTile.getSelected());
        }

        assertEquals(5, testBoard.getSize());
    }
}
