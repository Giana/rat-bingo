import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest
{
    @Test // Test board initialization
    public void testBoard()
    {
        Board testBoard = new Board();
        Tile testTile1 = testBoard.getMap()[0][0];
        Tile testTile2 = testBoard.getMap()[0][1];
        Tile testTile3 = testBoard.getMap()[0][2];
        Tile testTile4 = testBoard.getMap()[0][3];
        Tile testTile5 = testBoard.getMap()[0][4];

        // Tile 1
        System.out.println("Tile[0][0] Value = " + testTile1.getNumber());
        assertTrue(testTile1.getNumber() >= 1);
        assertTrue(testTile1.getNumber() <= 15);
        assertFalse(testTile1.getCalled());
        assertFalse(testTile1.getSelected());

        // Tile 2
        System.out.println("Tile[0][1] Value = " + testTile2.getNumber());
        assertTrue(testTile2.getNumber() >= 16);
        assertTrue(testTile2.getNumber() <= 30);
        assertFalse(testTile2.getCalled());
        assertFalse(testTile2.getSelected());

        // Tile 3
        System.out.println("Tile[0][2] Value = " + testTile3.getNumber());
        assertTrue(testTile3.getNumber() >= 31);
        assertTrue(testTile3.getNumber() <= 45);
        assertFalse(testTile3.getCalled());
        assertFalse(testTile3.getSelected());

        // Tile 4
        System.out.println("Tile[0][3] Value = " + testTile4.getNumber());
        assertTrue(testTile4.getNumber() >= 46);
        assertTrue(testTile4.getNumber() <= 60);
        assertFalse(testTile4.getCalled());
        assertFalse(testTile4.getSelected());

        // Tile 5
        System.out.println("Tile[0][4] Value = " + testTile5.getNumber());
        assertTrue(testTile5.getNumber() >= 61);
        assertTrue(testTile5.getNumber() <= 75);
        assertFalse(testTile5.getCalled());
        assertFalse(testTile5.getSelected());

        assertEquals(5, testBoard.getSize());
    }
}
