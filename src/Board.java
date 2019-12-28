import java.util.ArrayList;

public class Board
{
    private int size = 5;
    private ArrayList<Integer> numbers = new ArrayList<>();   // Holds numbers on board

    // Default constructor
    public Board()
    {
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
                n++;
            }
        }
    }
}
