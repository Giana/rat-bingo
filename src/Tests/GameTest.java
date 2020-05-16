package Tests;

import main.Code.Board;
import main.Code.Game;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * The Rat Bingo program is a bingo game with a rat theme.
 *
 * @author  Giana (Github: G-i-a-n-a - Website: Giana.dev)
 * @version 1.0
 * @since   2020-05-15
 */
public class GameTest
{
    @Test // Test checkRow()
    public void checkRowTest()
    {
        Game testGame = new Game();
        Board testBoard = testGame.getPlayerBoard();
        ArrayList<String> called = testGame.getCalled();
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
                called.add(testBoard.getMap()[i][j].toString());
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
        ArrayList<String> called = testGame.getCalled();
        int size = testBoard.getSize();

        // Check default
        assertEquals("N/A", testGame.checkHorizontal(testBoard));

        // Fill a row, check for horizontal win, reset, repeat
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                called.add(testBoard.getMap()[i][j].toString());
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
        ArrayList<String> called = testGame.getCalled();
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
                called.add(testBoard.getMap()[j][i].toString());
                testBoard.getMap()[j][i].setSelected(true);
            }

            assertTrue(testGame.checkColumn(testBoard, i));
        }
    }

    @Test // Test checkVertical()
    public void checkVerticalTest()
    {
        Game testGame = new Game();
        Board testBoard = testGame.getPlayerBoard();
        ArrayList<String> called = testGame.getCalled();
        int size = testBoard.getSize();

        // Check default
        assertEquals("N/A", testGame.checkVertical(testBoard));

        // Fill a column, check for vertical win, reset, repeat
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                called.add(testBoard.getMap()[j][i].toString());
                testBoard.getMap()[j][i].setSelected(true);
            }

            assertEquals("vertical" + i, testGame.checkVertical(testBoard));
            testGame.reset();
        }
    }

    @Test // Test checkDiagonal()
    public void checkDiagonalTest()
    {
        Game testGame = new Game();
        Board testBoard = testGame.getPlayerBoard();
        ArrayList<String> called = testGame.getCalled();
        int size = testBoard.getSize();
        int j = 4;

        // Check default
        assertEquals("N/A", testGame.checkDiagonal(testBoard));

        // Fill left diagonal, check, reset
        for(int i = 0; i < size; i++)
        {
            called.add(testBoard.getMap()[i][i].toString());
            testBoard.getMap()[i][i].setSelected(true);
        }

        assertEquals("diagonalL", testGame.checkDiagonal(testBoard));
        testGame.reset();

        // Fill right diagonal, check, reset
        for(int i = 0; i < size; i++)
        {
            called.add(testBoard.getMap()[i][j].toString());
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
            called.add(testBoard.getMap()[i][i].toString());
            testBoard.getMap()[i][i].setSelected(true);

            // Right
            called.add(testBoard.getMap()[i][j].toString());
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
        ArrayList<String> called = testGame.getCalled();
        int size = testBoard.getSize();
        int j = 4;

        // Check default
        assertEquals("N/A", testGame.checkX(testBoard));

        // Fill left diagonal, check, reset
        for(int i = 0; i < size; i++)
        {
            called.add(testBoard.getMap()[i][i].toString());
            testBoard.getMap()[i][i].setSelected(true);
        }

        assertEquals("N/A", testGame.checkX(testBoard));
        testGame.reset();

        // Fill right diagonal, check, reset
        for(int i = 0; i < size; i++)
        {
            called.add(testBoard.getMap()[i][j].toString());
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
            called.add(testBoard.getMap()[i][i].toString());
            testBoard.getMap()[i][i].setSelected(true);

            // Right
            called.add(testBoard.getMap()[i][j].toString());
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
        ArrayList<String> called = testGame.getCalled();
        int lowerBound = 0;
        int upperBound = (testBoard.getSize() - 1);

        // Check default
        assertEquals("N/A", testGame.checkCorners(testBoard));

        // Fill the four corners, check
        called.add(testBoard.getMap()[lowerBound][lowerBound].toString());
        testBoard.getMap()[lowerBound][lowerBound].setSelected(true);
        called.add(testBoard.getMap()[lowerBound][upperBound].toString());
        testBoard.getMap()[lowerBound][upperBound].setSelected(true);
        called.add(testBoard.getMap()[upperBound][lowerBound].toString());
        testBoard.getMap()[upperBound][lowerBound].setSelected(true);
        called.add(testBoard.getMap()[upperBound][upperBound].toString());
        testBoard.getMap()[upperBound][upperBound].setSelected(true);

        assertEquals("corners", testGame.checkCorners(testBoard));
    }

    @Test // Test checkT()
    public void checkTTest()
    {
        Game testGame = new Game();
        Board testBoard = testGame.getPlayerBoard();
        ArrayList<String> called = testGame.getCalled();
        int size = testBoard.getSize();
        int row = 0;
        int column = 2;

        // Check default
        assertEquals("N/A", testGame.checkT(testBoard));

        // Fill row & column for T, check
        for(int i = 0; i < size; i++)
        {
            // Row
            called.add(testBoard.getMap()[row][i].toString());
            testBoard.getMap()[row][i].setSelected(true);

            // Column
            called.add(testBoard.getMap()[i][column].toString());
            testBoard.getMap()[i][column].setSelected(true);
        }

        assertEquals("t", testGame.checkT(testBoard));
    }

    @Test // Test checkL()
    public void checkLTest()
    {
        Game testGame = new Game();
        Board testBoard = testGame.getPlayerBoard();
        ArrayList<String> called = testGame.getCalled();
        int size = testBoard.getSize();
        int row = 4;
        int column = 0;

        // Check default
        assertEquals("N/A", testGame.checkL(testBoard));

        // Fill row & column for L, check
        for(int i = 0; i < size; i++)
        {
            // Row
            called.add(testBoard.getMap()[row][i].toString());
            testBoard.getMap()[row][i].setSelected(true);

            // Column
            called.add(testBoard.getMap()[i][column].toString());
            testBoard.getMap()[i][column].setSelected(true);
        }

        assertEquals("l", testGame.checkL(testBoard));
    }

    @Test // Test checkAll()
    public void checkAllTest()
    {
        Game testGame = new Game();
        Board testBoard = testGame.getPlayerBoard();
        ArrayList<String> called = testGame.getCalled();
        int size = testBoard.getSize();

        // Check default
        assertEquals("N/A", testGame.checkAll(testBoard));

        // Fill every cell of board, check
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                called.add(testBoard.getMap()[i][j].toString());
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
        ArrayList<String> called = testGame.getCalled();
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
            called.add(testBoard1.getMap()[i][i].toString());
            testBoard1.getMap()[i][i].setSelected(true);

            // Right diagonal
            called.add(testBoard1.getMap()[i][k].toString());
            testBoard1.getMap()[i][k].setSelected(true);
            k--;
        }

        assertEquals("x", testGame.checkX(testBoard1));

        // Fill every cell, check
        for(int i = 0; i < size2; i++)
        {
            for(int j = 0; j < size2; j++)
            {
                called.add(testBoard2.getMap()[i][j].toString());
                testBoard2.getMap()[i][j].setSelected(true);
            }
        }

        assertEquals("all", testGame.checkAll(testBoard2));

        // Reset, check again
        testGame.reset();

        assertEquals("N/A", testGame.checkX(testBoard1));
        assertEquals("N/A", testGame.checkAll(testBoard2));
    }

    @Test // Test checkWin()
    public void checkWinTest()
    {
        Game testGame = new Game("horizontal");
        Board testBoard = testGame.getPlayerBoard();
        ArrayList<String> called = testGame.getCalled();
        int size = testBoard.getSize();
        int k = 4;
        int lowerBound = 0;
        int upperBound = (testBoard.getSize() - 1);
        int rowT = 0;
        int columnT = 2;
        int rowL = 4;
        int columnL = 0;

        // Check default
        assertEquals("N/A", testGame.checkWin(testBoard));

        // Fill a row, check for horizontal win, reset, repeat
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                called.add(testBoard.getMap()[i][j].toString());
                testBoard.getMap()[i][j].setSelected(true);
            }

            assertEquals("horizontal" + i, testGame.checkWin(testBoard));
            testGame.reset();
        }

        // Check for default after reset
        assertEquals("N/A", testGame.checkWin(testBoard));

        // Change mode
        testGame.setMode("vertical");

        // Fill a column, check for vertical win, reset, repeat
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                called.add(testBoard.getMap()[j][i].toString());
                testBoard.getMap()[j][i].setSelected(true);
            }

            assertEquals("vertical" + i, testGame.checkWin(testBoard));
            testGame.reset();
        }

        // Check for default after reset
        assertEquals("N/A", testGame.checkWin(testBoard));

        // Change mode
        testGame.setMode("diagonal");

        // Fill left diagonal, check, reset
        for(int i = 0; i < size; i++)
        {
            called.add(testBoard.getMap()[i][i].toString());
            testBoard.getMap()[i][i].setSelected(true);
        }

        assertEquals("diagonalL", testGame.checkWin(testBoard));
        testGame.reset();

        // Fill right diagonal, check, reset
        for(int i = 0; i < size; i++)
        {
            called.add(testBoard.getMap()[i][k].toString());
            testBoard.getMap()[i][k].setSelected(true);
            k--;
        }

        assertEquals("diagonalR", testGame.checkWin(testBoard));
        testGame.reset();

        k = 4;

        // Fill both diagonals, check
        for(int i = 0; i < size; i++)
        {
            // Left
            called.add(testBoard.getMap()[i][i].toString());
            testBoard.getMap()[i][i].setSelected(true);

            // Right
            called.add(testBoard.getMap()[i][k].toString());
            testBoard.getMap()[i][k].setSelected(true);
            k--;
        }

        assertEquals("diagonalLR", testGame.checkWin(testBoard));

        testGame.reset();

        // Check for default after reset
        assertEquals("N/A", testGame.checkWin(testBoard));

        // Change mode
        testGame.setMode("x");

        k = 4;

        // Fill both diagonals, check
        for(int i = 0; i < size; i++)
        {
            // Left
            called.add(testBoard.getMap()[i][i].toString());
            testBoard.getMap()[i][i].setSelected(true);

            // Right
            called.add(testBoard.getMap()[i][k].toString());
            testBoard.getMap()[i][k].setSelected(true);
            k--;
        }

        assertEquals("x", testGame.checkWin(testBoard));

        testGame.reset();

        // Check for default after reset
        assertEquals("N/A", testGame.checkWin(testBoard));

        // Change mode
        testGame.setMode("corners");

        // Fill the four corners, check
        called.add(testBoard.getMap()[lowerBound][lowerBound].toString());
        testBoard.getMap()[lowerBound][lowerBound].setSelected(true);
        called.add(testBoard.getMap()[lowerBound][upperBound].toString());
        testBoard.getMap()[lowerBound][upperBound].setSelected(true);
        called.add(testBoard.getMap()[upperBound][lowerBound].toString());
        testBoard.getMap()[upperBound][lowerBound].setSelected(true);
        called.add(testBoard.getMap()[upperBound][upperBound].toString());
        testBoard.getMap()[upperBound][upperBound].setSelected(true);

        assertEquals("corners", testGame.checkWin(testBoard));

        testGame.reset();

        // Check for default after reset
        assertEquals("N/A", testGame.checkWin(testBoard));

        // Change mode
        testGame.setMode("t");

        // Fill row & column for T, check
        for(int i = 0; i < size; i++)
        {
            // Row
            called.add(testBoard.getMap()[rowT][i].toString());
            testBoard.getMap()[rowT][i].setSelected(true);

            // Column
            called.add(testBoard.getMap()[i][columnT].toString());
            testBoard.getMap()[i][columnT].setSelected(true);
        }

        assertEquals("t", testGame.checkWin(testBoard));

        testGame.reset();

        // Check for default after reset
        assertEquals("N/A", testGame.checkWin(testBoard));

        // Change mode
        testGame.setMode("l");

        // Fill row & column for L, check
        for(int i = 0; i < size; i++)
        {
            // Row
            called.add(testBoard.getMap()[rowL][i].toString());
            testBoard.getMap()[rowL][i].setSelected(true);

            // Column
            called.add(testBoard.getMap()[i][columnL].toString());
            testBoard.getMap()[i][columnL].setSelected(true);
        }

        assertEquals("l", testGame.checkWin(testBoard));

        testGame.reset();

        // Check for default after reset
        assertEquals("N/A", testGame.checkWin(testBoard));

        // Change mode
        testGame.setMode("all");

        // Fill every cell of board, check
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                called.add(testBoard.getMap()[i][j].toString());
                testBoard.getMap()[i][j].setSelected(true);
            }
        }

        assertEquals("all", testGame.checkWin(testBoard));
    }

    @Test // Test callsGenerator()
    public void callsGeneratorTest()
    {
        Game testGame = new Game();
        ArrayList<Integer> testList = testGame.getToCall();

        for(int i = 1; i <= 75; i++)
        {
            assertTrue(testList.contains(i));
        }
    }

    @Test // Test runCaller()
    public void runCallerTest()
    {
        Game testGame = new Game();
        ArrayList<String> testList = testGame.getCalled();

        for(int i = 0; i < 75; i++)
        {
            int testInt = testGame.runCaller();
            assertTrue(testList.contains(Integer.toString(testInt)));
            assertTrue(testInt >= 1 && testInt <= 75);
        }
    }
}
