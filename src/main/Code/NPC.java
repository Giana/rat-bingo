package main.Code;

/**
 * The Rat Bingo program is a bingo game with a rat theme.
 *
 * @author  Giana (Github: G-i-a-n-a - Website: Giana.dev)
 * @version 1.0
 * @since   2020-05-15
 */
public class NPC
{
    /**
     * This is the default constructor for NPC.
     */
    public NPC() { }

    /**
     * This method is used to select a Tile on the Board
     * based on its location for the NPC. It is logically
     * equivalent to a Player clicking on a Tile during a
     * Game, indicating that they are selecting that Tile.
     * @param currentGame Current Game
     * @param x X-intercept of Tile on Board
     * @param y Y-intercept of Tile on Board
     */
    public void selectTile(Game currentGame, int x, int y)
    {
        currentGame.getNpcBoard().getMap()[x][y].setSelected(true);
    }

    /**
     * This method is used to scan the Board for a Tile with
     * the number called for the NPC. That Tile is then selected
     * if found. It is logically equivalent to a Player checking
     * their Board for the number called, and clicking on the
     * Tile if it is present.
     * @param currentGame Current Game
     * @param called Number called
     */
    public void scanBoard(Game currentGame, int called)
    {
        int size = currentGame.getNpcBoard().getSize();
        Board board = currentGame.getNpcBoard();

        // Columns
        int bColumn = 0;
        int iColumn = 1;
        int nColumn = 2;
        int gColumn = 3;
        int oColumn = 4;

        // Check for a B
        if(called >= 1 && called <= 15)
        {
            for(int i = 0; i < size; i++)
            {
                if(board.getMap()[i][bColumn].getNumber() == called)
                {
                    selectTile(currentGame, i, bColumn);
                }
            }
        }
        // Check for an I
        else if(called >= 16 && called <= 30)
        {
            for(int i = 0; i < size; i++)
            {
                if(board.getMap()[i][iColumn].getNumber() == called)
                {
                    selectTile(currentGame, i, iColumn);
                }
            }
        }
        // Check for N
        else if(called >= 31 && called <= 45)
        {
            for(int i = 0; i < size; i++)
            {
                if(board.getMap()[i][nColumn].getNumber() == called)
                {
                    selectTile(currentGame, i, nColumn);
                }
            }
        }
        // Check for G
        else if(called >= 46 && called <= 60)
        {
            for(int i = 0; i < size; i++)
            {
                if(board.getMap()[i][gColumn].getNumber() == called)
                {
                    selectTile(currentGame, i, gColumn);
                }
            }
        }
        // Check for O
        else if(called >= 61 && called <= 75)
        {
            for(int i = 0; i < size; i++)
            {
                if(board.getMap()[i][oColumn].getNumber() == called)
                {
                    selectTile(currentGame, i, oColumn);
                }
            }
        }
        else
        {
            System.out.println("Error: Tile value out of range");
        }
    }

    /**
     * This method is used to check for a win for the
     * NPC. It is logically equivalent to a Player
     * checking their Board for "bingo".
     * @param currentGame Current Game
     * @return boolean If win is found
     */
    // Checks win state and returns if bingo has been achieved
    public boolean checkForBingo(Game currentGame)
    {
        Board currentBoard = currentGame.getNpcBoard();

        String state = currentGame.checkWin(currentBoard);

        return !state.equals("N/A");
    }
}
