import java.util.ArrayList;

public class Board
{
    // TODO: Remove numbers if it's unnecessary
    private int size = 5;                                     // Length/width of bingo board
    private ArrayList<Integer> numbers = new ArrayList<>();   // Holds numbers on board
    private Tile[][] map;                                     // Holds all tiles in matrix

    // Default constructor
    public Board()
    {
        map = new Tile[size][size];
        numbersGenerator();
    }

    // Getters & setters
    public int getSize() { return size; }

    public ArrayList<Integer> getNumbers() { return numbers; }

    public Tile[][] getMap() { return map; }

    // Randomly selects numbers for the board
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

    // For testing purposes
    public void printBoard()
    {
        System.out.println("  B   I   N   G   O  ");

        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                System.out.printf("%3d ", map[i][j].getNumber());
            }
            System.out.println();
        }
    }
}
