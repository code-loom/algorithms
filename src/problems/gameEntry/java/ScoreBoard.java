/**
 * A scoreboard is limited to a certain number of high scores that can be saved; once that limit is reached, a new score only qualifies for the scoreboard if it is strictly higher than the lowest “high score” on the board.
 */

 public class ScoreBoard {
    private GameEntry[] board;
    private int numOfEntries = 0;

    public ScoreBoard(int capacity) {
        board = new GameEntry[capacity];
    }

    public boolean add(GameEntry entry) {
        boolean flag = false;
        int newScore = entry.getScore();

        // Assuming that the data is stored sorted
        if (numOfEntries < board.length || newScore > board[numOfEntries -1].getScore()) {
            // update numOfEntries first if applicable
            if (numOfEntries < board.length) {
                numOfEntries++;
            }

            // if the entries are full, add the data at the appropriate location
            int j = numOfEntries - 1;
            while (j > 0 && board[j - 1].getScore() < newScore) {
                board[j] = board[j - 1];
                j--;
            }
            board[j] = entry;
            flag = true;
        }

        if (flag) {
            System.out.println("Game Entry with score " + entry.getScore() + " added.");
        } else {
            System.out.println("Game Entry with score " + entry.getScore() + " NOT added.");
        }
        return flag;
     }

     public String toString() {
         for(GameEntry entry : board) {
             if (entry != null) {
                 System.out.println(entry.getName() + ": " + entry.getScore());
             }
         }
         return "";
     }
 }