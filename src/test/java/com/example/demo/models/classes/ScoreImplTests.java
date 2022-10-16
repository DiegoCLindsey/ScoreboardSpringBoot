package com.example.demo.models.classes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoreImplTests {
    
    /**
     * This test creates a TeamImpl object and checks if it's correctly initialized
     */
    @Test
    public void shouldCreateObject(){
        ScoreImpl score = new ScoreImpl(1,2);
        assertNotNull(score);
        assertEquals(1,score.getHomeScore());
        assertEquals(2,score.getAwayScore());
    }

    /**
     * Without further information, a score is set by default to 0,0
     */
    @Test
    public void shouldCreateEmptyScoreWithZeros(){
        ScoreImpl score = new ScoreImpl();
        assertNotNull(score);
        assertEquals(0,score.getAwayScore());
        assertEquals(0,score.getHomeScore());
    }

    /**
     * Using the interface increments methods results in a +1 update of the Away score
     */
    @Test
    public void shouldIncrementAwayScore(){
        ScoreImpl score = new ScoreImpl();
        assertNotNull(score);
        assertEquals(0,score.getAwayScore());
        assertEquals(0,score.getHomeScore());
        score.AwayTeamScores();
        assertEquals(0,score.getHomeScore());
        assertEquals(1,score.getAwayScore());
    }

    /**
     * Using the interface increments methods results in a +1 update of the Away score
     */
    @Test
    public void shouldIncrementHomeScore(){
        ScoreImpl score = new ScoreImpl();
        assertNotNull(score);
        assertEquals(0,score.getAwayScore());
        assertEquals(0,score.getHomeScore());
        score.HomeTeamScores();
        assertEquals(1,score.getHomeScore());
        assertEquals(0,score.getAwayScore());
    }

}
