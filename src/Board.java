import java.util.ArrayList;

public class Board
{
    private int size = 5;                                     // Length/width of bingo board
    private ArrayList<Integer> numbers = new ArrayList<>();   // Holds numbers on board
    private Tile[][] map;                             // Holds all tiles in matrix

    // Default constructor
    public Board()
    {
        map = new Tile[size][size];
        numbersGenerator();
    }

    // Randomly selects numbers for the board
    public void numbersGenerator()
    {
        int i = 0, j = 0, k = 0, m = 0, n = 0;

        // Ranges for letters
        int bMin = 1, bMax = 15;
        int iMin = 16, iMax = 30;
        int nMin = 31, nMax = 45;
        int gMin = 46, gMax = 60;
        int oMin = 61, oMax = 75;

        // Generate Bs
        while(i < 5)
        {
            int rand = (int) (Math.random() * ((bMax - bMin) + 1)) + bMin;

            if(!numbers.contains(rand))
            {
                numbers.add(rand);
                map[i][0] = new Tile(rand);
                i++;
            }
        }

        // Generate Is
        while(j < 5)
        {
            int rand = (int) (Math.random() * ((iMax - iMin) + 1)) + iMin;

            if(!numbers.contains(rand))
            {
                numbers.add(rand);
                map[j][1] = new Tile(rand);
                j++;
            }
        }

        // Generate Ns
        while(k < 5)
        {
            int rand = (int) (Math.random() * ((nMax - nMin) + 1)) + nMin;

            if(!numbers.contains(rand))
            {
                numbers.add(rand);
                map[k][2] = new Tile(rand);
                k++;
            }
        }

        // Generate Gs
        while(m < 5)
        {
            int rand = (int) (Math.random() * ((gMax - gMin) + 1)) + gMin;

            if(!numbers.contains(rand))
            {
                numbers.add(rand);
                map[m][3] = new Tile(rand);
                m++;
            }
        }

        // Generate Os
        while(n < 5)
        {
            int rand = (int) (Math.random() * ((oMax - oMin) + 1)) + oMin;

            if(!numbers.contains(rand))
            {
                numbers.add(rand);
                map[n][4] = new Tile(rand);
                n++;
            }
        }
    }
}
