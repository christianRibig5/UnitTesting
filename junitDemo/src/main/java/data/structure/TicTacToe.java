package data.structure;

public class TicTacToe {
    public static final int X=1,O=-1; // players
    public static final int EMPTY =0;              //empty cell
    private int[][]board = new int[3][3];          //tictactoe gameboard
    private int player;

    /** constructor that initializes the first state of the board**/
    public TicTacToe(){
        clearBoard();
    }

    private void clearBoard() {
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                board[i][j]=EMPTY;  // every cell is initialized to be empty

                player=X;      //the first player X is initialized
    }

    /** put a mark in position i,j**/
    public void putMark(int i,int j)throws IllegalArgumentException{
        if((i<0)||(i>2)||(j<0)||(j>2))throw new IllegalArgumentException("Invalid board position");
        if(board[i][j]!=EMPTY)throw new IllegalArgumentException("Board position occupied");

        board[i][j]=player;   // place the mark on the board
        player=-player;       // switch player ( uses the logic that O = -X)
    }

    /** Checks whether the board configuration is a win for the given player. */
    public boolean isWin(int mark){
        boolean isWin=false;
        if(((board[0][0]+board[0][1]+board[0][2])==mark*3)             //row0
                ||((board[1][0]+board[1][1]+board[1][2])==mark*3)       //row1
                ||((board[2][0]+board[2][1]+board[2][2])==mark*3)       //row2
                ||((board[0][0]+board[1][0]+board[2][0])==mark*3)       //column0
                ||((board[0][1]+board[1][1]+board[2][1])==mark*3)       //column1
                ||((board[0][2]+board[1][2]+board[2][2])==mark*3)       //column2
                ||((board[0][0]+board[1][1]+board[2][2])==mark*3)       //diagonal
                ||((board[2][0]+board[1][1]+board[0][2])==mark*3))      //rev diagonal
            isWin=true;

        return isWin;
    }

    /** Returns the winning player's code, or 0 to indicate a tie (or unfinished game).*/
    public int winner(){
        if(isWin(X))return (X);
        else if(isWin(O))return (O);
        return 0;
    }

    /** Returns a simple character string showing the current board. */
    @Override
    public String toString(){
        StringBuilder mark= new StringBuilder();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                switch(board[i][j]){
                    case X:mark.append("X"); break;
                    case O:mark.append("O"); break;
                    case EMPTY:mark.append(" ");break;
                }
                if(j<2)mark.append("|");  // set boundary for j
            }
            if(i<2)mark.append("\n-----\n"); // set boundary for i
        }
        return  mark.toString();
    }

}
