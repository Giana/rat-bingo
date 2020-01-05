package Code;

public class NPC
{
    // Default constructor
    public NPC() { }

    // Selects location on board depending on circumstances, during game
    public void selectTile(Game currentGame, int x, int y)
    {
        currentGame.getNpcBoard().getMap()[x][y].setSelected(true);
    }

    // Knowing the number called, search the board for it (and select if present)
    public void scanBoard(int called, Game currentGame)
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

    // Checks win state and returns if bingo has been achieved
    public boolean checkForBingo(Game currentGame)
    {
        Board currentBoard = currentGame.getNpcBoard();

        String state = currentGame.checkWin(currentBoard);

        return !state.equals("N/A");
    }
}
