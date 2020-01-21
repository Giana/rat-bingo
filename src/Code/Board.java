package Code;

import java.util.ArrayList;

/**
 * The Rat Bingo program is a bingo game with a rat theme.
 *
 * @author  Giana (Github: G-i-a-n-a - Website: Giana.dev)
 * @version 1.0
 * @since   2019-01-??
 */
public class Board
{
    private int size = 5;                                     // Length/width of bingo board
    private ArrayList<Integer> numbers = new ArrayList<>();   // Holds numbers on board
    private Tile[][] map;                                     // Holds all tiles in matrix

    /**
     * This is the default constructor for Board.
     * It creates a new map (2D array) of Tiles,
     * and generates a number for each Tile in
     * the map.
     */
    public Board()
    {
        map = new Tile[size][size];
        numbersGenerator();
    }

    /**
     * @return int Size of Board
     */
    public int getSize() { return size; }

    /**
     * @return int Size of Board
     */
    public Tile[][] getMap() { return map; }

    /**
     * This method is used to fill
     * the Board (map of Tiles) with
     * numbers. The range of numbers
     * is dependent on whether the
     * column is B, I, N, G, or O.
     */
    public void numbersGenerator()
    {
        int b = 0, i = 0, n = 0, g = 0, o = 0;

        // Ranges for letters
        int bMin = 1, bMax = 15;
        int iMin = 16, iMax = 30;
        int nMin = 31, nMax = 45;
        int gMin = 46, gMax = 60;
        int oMin = 61, oMax = 75;

        // Generate Bs
        while(b < 5)
        {
            int rand = (int) (Math.random() * ((bMax - bMin) + 1)) + bMin;

            if(!numbers.contains(rand))
            {
                numbers.add(rand);
                map[b][0] = new Tile(rand);
                b++;
            }
        }

        // Generate Is
        while(i < 5)
        {
            int rand = (int) (Math.random() * ((iMax - iMin) + 1)) + iMin;

            if(!numbers.contains(rand))
            {
                numbers.add(rand);
                map[i][1] = new Tile(rand);
                i++;
            }
        }

        // Generate Ns
        while(n < 5)
        {
            int rand = (int) (Math.random() * ((nMax - nMin) + 1)) + nMin;

            if(!numbers.contains(rand))
            {
                numbers.add(rand);
                map[n][2] = new Tile(rand);
                n++;
            }
        }

        // Generate Gs
        while(g < 5)
        {
            int rand = (int) (Math.random() * ((gMax - gMin) + 1)) + gMin;

            if(!numbers.contains(rand))
            {
                numbers.add(rand);
                map[g][3] = new Tile(rand);
                g++;
            }
        }

        // Generate Os
        while(o < 5)
        {
            int rand = (int) (Math.random() * ((oMax - oMin) + 1)) + oMin;

            if(!numbers.contains(rand))
            {
                numbers.add(rand);
                map[o][4] = new Tile(rand);
                o++;
            }
        }
    }
}