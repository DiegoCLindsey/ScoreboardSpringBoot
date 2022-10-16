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
        assertEquals(1,score.getAwayScore());
        assertEquals(2,score.getHomeScore());
    }
}
