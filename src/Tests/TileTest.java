package Tests;

import main.Code.Board;
import main.Code.Game;
import main.Code.Tile;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * The Rat Bingo program is a bingo game with a rat theme.
 *
 * @author  Giana (Github: G-i-a-n-a - Website: Giana.dev)
 * @version 1.0.1
 */
public class TileTest
{
    @Test // Test tile initialization
    public void testTile()
    {
        Game testGame = new Game();
        Board testBoard = testGame.getPlayerBoard();
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
            assertFalse(testTile.getSelected());
        }

        // Check Is
        for(int i = 0; i < size; i++)
        {
            Tile testTile = testBoard.getMap()[i][1];
            assertTrue(testTile.getNumber() >= iMin);
            assertTrue(testTile.getNumber() <= iMax);
            assertFalse(testTile.getSelected());
        }

        // Check Ns
        for(int i = 0; i < size; i++)
        {
            Tile testTile = testBoard.getMap()[i][2];
            assertTrue(testTile.getNumber() >= nMin);
            assertTrue(testTile.getNumber() <= nMax);
            assertFalse(testTile.getSelected());
        }

        // Check Gs
        for(int i = 0; i < size; i++)
        {
            Tile testTile = testBoard.getMap()[i][3];
            assertTrue(testTile.getNumber() >= gMin);
            assertTrue(testTile.getNumber() <= gMax);
            assertFalse(testTile.getSelected());
        }

        // Check Os
        for(int i = 0; i < size; i++)
        {
            Tile testTile = testBoard.getMap()[i][4];
            assertTrue(testTile.getNumber() >= oMin);
            assertTrue(testTile.getNumber() <= oMax);
            assertFalse(testTile.getSelected());
        }
    }

    @Test // Test setSelected()
    public void setSelectedTest()
    {
        Game testGame = new Game();
        Board testBoard = testGame.getPlayerBoard();
        int size = testBoard.getSize();

        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                Tile testTile = testBoard.getMap()[i][j];
                assertFalse(testTile.getSelected());
                testTile.setSelected(true);
                assertTrue(testTile.getSelected());
            }
        }
    }
}