package data.structure;

import org.junit.Test;

import static org.junit.Assert.*;

public class TicTacToeTest {

    @Test
    public void playGame() {
        TicTacToe game = new TicTacToe( );
        System.out.println("Game board at start of game");
        System.out.println(game);

        /* O moves: */
        game.putMark(0,2);
        game.putMark(0,0);
        game.putMark(0,1);
        game.putMark(2,1);
        game.putMark(2,0);

        /* X moves: */
        game.putMark(1,1);
        game.putMark(2,2);
        game.putMark(1,2);
        game.putMark(1,0);



        System.out.println("Game board after playing  game");
        System.out.println(game);
        int winningPlayer = game.winner( );
        String[ ] outcome = {"O wins", "Tie", "X wins"}; // rely on ordering
        System.out.println(outcome[1 + winningPlayer]); // 0 or 1 or 2
    }

}