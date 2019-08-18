package data.structure;


import data.structure.models.GameEntry;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class ScoreBoardTest {
    private GameEntry gameEntries[];
    private ScoreBoard scoreBoard=new ScoreBoard(5);
    private GameEntry gameEntry1,gameEntry2,gameEntry3;

    @Before
    public void addEntry(){
        gameEntry1=new GameEntry("John",800);
        gameEntry2=new GameEntry("Favor",850);
        //gameEntry3=new GameEntry("Legend",1000);

        gameEntries=new GameEntry[]{gameEntry1,gameEntry2};
        for(int i=0;i<gameEntries.length;i++){
            scoreBoard.add(gameEntries[i]);
        }

    }
    @Test
    public void searchTest() {
       assertTrue(scoreBoard.search(gameEntries,gameEntry2));
    }



}