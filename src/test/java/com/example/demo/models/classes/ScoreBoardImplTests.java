package com.example.demo.models.classes;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ScoreBoardImplTests {
    
    @Test
    public void shouldCreateObject(){
        // Initialize objects
        List<GameImpl> games = new ArrayList<>();
        GameImpl game = new GameImpl(new TeamImpl("Home"), new TeamImpl("Away"));
        games.add(game);
        ScoreBoardImpl scoreBoard = new ScoreBoardImpl(games);

        assertNotNull(scoreBoard);
        assertEquals(1,scoreBoard.getSummary().size());

    }

    @Test 
    public void shouldBeAbleToGetGameScore(){

    }

    @Test 
    public void shouldGenerateSummary(){

    }

    @Test
    public void shouldBeAbleToStartGames(){

    }

    @Test
    public void shouldBeAbleToFinishGames(){

    }

    @Test
    public void shouldBeAbleToUpdateGameScore(){

    }

    @Test
    public void shouldThrowExceptionOnNonExistingGameUpdate(){

    }

    @Test
    public void shouldThrowExceptionOnNonExistingGameFinish(){

    }
}
