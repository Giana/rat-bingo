package Tests;

import Code.Board;
import Code.Game;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class GameTest
{
    @Test // Test checkRow()
    public void checkRowTest()
    {
        Game testGame = new Game();
        Board testBoard = testGame.getPlayerBoard();
        int size = testBoard.getSize();

        // Check default
        for(int i = 0; i < size; i++)
        {
            assertFalse(testGame.checkRow(testBoard, i));
        }

        // Fill a row, check for horizontal win, repeat
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                testBoard.getMap()[i][j].setCalled(true);
                testBoard.getMap()[i][j].setSelected(true);
            }

            assertTrue(testGame.checkRow(testBoard, i));
        }
    }

    @Test // Test checkHorizontal()
    public void checkHorizontalTest()
    {
        Game testGame = new Game();
        Board testBoard = testGame.getPlayerBoard();
        int size = testBoard.getSize();

        // Check default
        assertEquals("N/A", testGame.checkHorizontal(testBoard));

        // Fill a row, check for horizontal win, reset, repeat
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                testBoard.getMap()[i][j].setCalled(true);
                testBoard.getMap()[i][j].setSelected(true);
            }

            assertEquals("horizontal" + i, testGame.checkHorizontal(testBoard));
            testGame.reset();
        }
    }

    @Test // Test checkColumn()
    public void checkColumnTest()
    {
        Game testGame = new Game();
        Board testBoard = testGame.getPlayerBoard();
        int size = testBoard.getSize();

        // Check default
        for(int i = 0; i < size; i++)
        {
            assertFalse(testGame.checkColumn(testBoard, i));
        }

        // Fill a row, check for horizontal win, repeat
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                testBoard.getMap()[j][i].setCalled(true);
                testBoard.getMap()[j][i].setSelected(true);
            }

            assertTrue(testGame.checkColumn(testBoard, i));
        }
    }

    @Test // Test checkVerticle()
    public void checkVerticleTest()
    {
        Game testGame = new Game();
        Board testBoard = testGame.getPlayerBoard();
        int size = testBoard.getSize();

        // Check default
        assertEquals("N/A", testGame.checkVertical(testBoard));

        // Fill a column, check for verticle win, reset, repeat
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                testBoard.getMap()[j][i].setCalled(true);
                testBoard.getMap()[j][i].setSelected(true);
            }

            assertEquals("verticle" + i, testGame.checkVertical(testBoard));
            testGame.reset();
        }
    }

    @Test // Test checkDiagonal()
    public void checkDiagonalTest()
    {
        Game testGame = new Game();
        Board testBoard = testGame.getPlayerBoard();
        int size = testBoard.getSize();
        int j = 4;

        // Check default
        assertEquals("N/A", testGame.checkDiagonal(testBoard));

        // Fill left diagonal, check, reset
        for(int i = 0; i < size; i++)
        {
            testBoard.getMap()[i][i].setCalled(true);
            testBoard.getMap()[i][i].setSelected(true);
        }

        assertEquals("diagonalL", testGame.checkDiagonal(testBoard));
        testGame.reset();

        // Fill right diagonal, check, reset
        for(int i = 0; i < size; i++)
        {
            testBoard.getMap()[i][j].setCalled(true);
            testBoard.getMap()[i][j].setSelected(true);
            j--;
        }

        assertEquals("diagonalR", testGame.checkDiagonal(testBoard));
        testGame.reset();

        j = 4;

        // Fill both diagonals, check
        for(int i = 0; i < size; i++)
        {
            // Left
            testBoard.getMap()[i][i].setCalled(true);
            testBoard.getMap()[i][i].setSelected(true);

            // Right
            testBoard.getMap()[i][j].setCalled(true);
            testBoard.getMap()[i][j].setSelected(true);
            j--;
        }

        assertEquals("diagonalLR", testGame.checkDiagonal(testBoard));
    }

    @Test // Test checkX()
    public void checkXTest()
    {
        Game testGame = new Game();
        Board testBoard = testGame.getPlayerBoard();
        int size = testBoard.getSize();
        int j = 4;

        // Check default
        assertEquals("N/A", testGame.checkX(testBoard));

        // Fill left diagonal, check, reset
        for(int i = 0; i < size; i++)
        {
            testBoard.getMap()[i][i].setCalled(true);
            testBoard.getMap()[i][i].setSelected(true);
        }

        assertEquals("N/A", testGame.checkX(testBoard));
        testGame.reset();

        // Fill right diagonal, check, reset
        for(int i = 0; i < size; i++)
        {
            testBoard.getMap()[i][j].setCalled(true);
            testBoard.getMap()[i][j].setSelected(true);
            j--;
        }

        assertEquals("N/A", testGame.checkX(testBoard));
        testGame.reset();

        j = 4;

        // Fill both diagonals, check
        for(int i = 0; i < size; i++)
        {
            // Left
            testBoard.getMap()[i][i].setCalled(true);
            testBoard.getMap()[i][i].setSelected(true);

            // Right
            testBoard.getMap()[i][j].setCalled(true);
            testBoard.getMap()[i][j].setSelected(true);
            j--;
        }

        assertEquals("x", testGame.checkX(testBoard));
    }

    @Test // Test checkCorners()
    public void checkCornersTest()
    {
        Game testGame = new Game();
        Board testBoard = testGame.getPlayerBoard();
        int lowerBound = 0;
        int upperBound = (testBoard.getSize() - 1);

        // Check default
        assertEquals("N/A", testGame.checkX(testBoard));

        // Fill the four corners, check
        testBoard.getMap()[lowerBound][lowerBound].setCalled(true);
        testBoard.getMap()[lowerBound][lowerBound].setSelected(true);
        testBoard.getMap()[lowerBound][upperBound].setCalled(true);
        testBoard.getMap()[lowerBound][upperBound].setSelected(true);
        testBoard.getMap()[upperBound][lowerBound].setCalled(true);
        testBoard.getMap()[upperBound][lowerBound].setSelected(true);
        testBoard.getMap()[upperBound][upperBound].setCalled(true);
        testBoard.getMap()[upperBound][upperBound].setSelected(true);

        assertEquals("corners", testGame.checkCorners(testBoard));
    }

    @Test // Test checkT()
    public void checkTTest()
    {
        Game testGame = new Game();
        Board testBoard = testGame.getPlayerBoard();
        int size = testBoard.getSize();
        int row = 0;
        int column = 2;

        // Check default
        assertEquals("N/A", testGame.checkT(testBoard));

        // Fill row & column for T, check
        for(int i = 0; i < size; i++)
        {
            // Row
            testBoard.getMap()[row][i].setCalled(true);
            testBoard.getMap()[row][i].setSelected(true);

            // Column
            testBoard.getMap()[i][column].setCalled(true);
            testBoard.getMap()[i][column].setSelected(true);
        }

        assertEquals("t", testGame.checkT(testBoard));
    }

    @Test // Test checkL()
    public void checkLTest()
    {
        Game testGame = new Game();
        Board testBoard = testGame.getPlayerBoard();
        int size = testBoard.getSize();
        int row = 4;
        int column = 0;

        // Check default
        assertEquals("N/A", testGame.checkL(testBoard));

        // Fill row & column for L, check
        for(int i = 0; i < size; i++)
        {
            // Row
            testBoard.getMap()[row][i].setCalled(true);
            testBoard.getMap()[row][i].setSelected(true);

            // Column
            testBoard.getMap()[i][column].setCalled(true);
            testBoard.getMap()[i][column].setSelected(true);
        }

        assertEquals("l", testGame.checkL(testBoard));
    }

    @Test // Test checkAll()
    public void checkAllTest()
    {
        Game testGame = new Game();
        Board testBoard = testGame.getPlayerBoard();
        int size = testBoard.getSize();

        // Check default
        assertEquals("N/A", testGame.checkAll(testBoard));

        // Fill every cell of board, check
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                testBoard.getMap()[i][j].setCalled(true);
                testBoard.getMap()[i][j].setSelected(true);
            }
        }

        assertEquals("all", testGame.checkAll(testBoard));
    }

    @Test // Test reset()
    public void resetTest()
    {
        Game testGame = new Game();
        Board testBoard1 = testGame.getPlayerBoard();
        Board testBoard2 = testGame.getNpcBoard();
        int size1 = testBoard1.getSize();
        int size2 = testBoard2.getSize();
        int k = 4;

        // Check two random defaults (for X and all)
        assertEquals("N/A", testGame.checkX(testBoard1));
        assertEquals("N/A", testGame.checkAll(testBoard2));

        // Fill X, check
        for(int i = 0; i < size1; i++)
        {
            // Left diagonal
            testBoard1.getMap()[i][i].setCalled(true);
            testBoard1.getMap()[i][i].setSelected(true);

            // Right diagonal
            testBoard1.getMap()[i][k].setCalled(true);
            testBoard1.getMap()[i][k].setSelected(true);
            k--;
        }

        assertEquals("x", testGame.checkX(testBoard1));

        // Fill every cell, check
        for(int i = 0; i < size2; i++)
        {
            for(int j = 0; j < size2; j++)
            {
                testBoard2.getMap()[i][j].setCalled(true);
                testBoard2.getMap()[i][j].setSelected(true);
            }
        }

        assertEquals("all", testGame.checkAll(testBoard2));

        // Reset, check again
        testGame.reset();

        assertEquals("N/A", testGame.checkX(testBoard1));
        assertEquals("N/A", testGame.checkAll(testBoard2));
    }
}
