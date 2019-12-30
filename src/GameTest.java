import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GameTest
{
    @Test
    public void checkHorizontalTest()
    {
        Game testGame = new Game();
        Board testBoard1 = testGame.getPlayerBoard();
        Board testBoard2 = testGame.getNpcBoard();
        int size1 = testBoard1.getSize();
        int size2 = testBoard2.getSize();

        for(int i = 0; i < size1; i++)
        {
            testBoard1.getMap()[i][i].setCalled(true);
            testBoard1.getMap()[i][i].setSelected(true);
        }
        // Every tile is called & selected
        for(int i = 0; i < size1; i++)
        {
            for(int j = 0; j < size1; j++)
            {
                testBoard1.getMap()[i][i].setCalled(true);
                testBoard1.getMap()[i][i].setSelected(true);
            }
        }

        assertEquals("horizontal" + 0, testGame.checkHorizontal(testBoard1));


        testBoard2.getMap()[1][0].setCalled(true);
        testBoard2.getMap()[1][0].setSelected(true);
        testBoard2.getMap()[1][1].setCalled(true);
        testBoard2.getMap()[1][1].setSelected(true);
        testBoard2.getMap()[1][2].setCalled(false);
        testBoard2.getMap()[1][2].setSelected(false);
        testBoard2.getMap()[1][3].setCalled(true);
        testBoard2.getMap()[1][3].setSelected(true);
        testBoard2.getMap()[1][4].setCalled(false);
        testBoard2.getMap()[1][4].setSelected(false);

        assertEquals("N/A", testGame.checkHorizontal(testBoard2));
    }
}
