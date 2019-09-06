
/**
we will use an array named board to manage the data Structure. GameEntry instances
that represent the high scores. The array is allocated with the specified
maximum capacity, but all entries are initially null. As entries are added, we will
maintain them from highest to lowest score, starting at index 0 of the array


One of the most common updates we might want to make to a Scoreboard is to add
a new entry. Keep in mind that not every entry will necessarily qualify as a high
score. If the board is not yet full, any new entry will be retained. Once the board is
full, a new entry is only retained if it is strictly better than one of the other scores,
in particular, the last entry of the scoreboard, which is the lowest of the high scores
 */

package data.structures.implementation;

import data.structures.models.GameEntry;

import java.util.Arrays;

public class ScoreBoard {
    private int numOfEntries=0;
    private GameEntry[]board;

    /** constructor initializing the sze of the score board**/
    public ScoreBoard(int capacity) {
        board=new GameEntry[capacity];
    }

    //adding new entry
    public void add(GameEntry e){
        int newScore = e.getScore();
        //is the score really a high score?
        if(numOfEntries<board.length||newScore>board[numOfEntries-1].getScore()){
            if(numOfEntries<board.length){
                numOfEntries++;
                // shift lower score right ward to make room for the higher score
                int j= numOfEntries-1;
                while(j>0 && board[j-1].getScore()<newScore){
                    board[j]=board[j-1];
                    j--;
                }
                board[j]=e; // when done add new entry
            }
        }

    }

    //remove a score from the board at position i and shift the entries to left
    public GameEntry remove(int i)throws IndexOutOfBoundsException {
        if (i < 0 || i > numOfEntries - 1)
            throw new IndexOutOfBoundsException("entry position  i is greater the maximum capacity index");
            GameEntry temp = board[i];
            for (int j = i; j < numOfEntries-1; j++)
                board[j] = board[j + 1];
                board[numOfEntries - 1] = null;
                numOfEntries--;
            return temp;
    }

    // search for a particular entry on the score bord and return true if found else false
    public boolean search(GameEntry[]scoreBoard, GameEntry entry){
        if(scoreBoard.length<1)throw new RuntimeException("You can't perform search in empty board.");
        boolean isFound =false;
        for(int i=0;i<scoreBoard.length;i++){
            if(scoreBoard[i]==entry){
                isFound=true;
            }
        }
        return isFound;
    }

    @Override
    public String toString() {
        return "Entry "+numOfEntries +", board=" + Arrays.toString(board);
    }


}
