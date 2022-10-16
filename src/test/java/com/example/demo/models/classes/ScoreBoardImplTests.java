package com.example.demo.models.classes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.demo.models.exceptions.GameNotFoundException;

public class ScoreBoardImplTests {
    private TeamImpl away = new TeamImpl("Away");
    private TeamImpl home = new TeamImpl("Home");
    private GameImpl game = new GameImpl(home,away);


    
    @Test
    public void shouldCreateObject(){
        // Initialize objects
        List<GameImpl> games = new ArrayList<>();
        games.add(this.game);
        ScoreBoardImpl scoreBoard = new ScoreBoardImpl(games);

        // Check instantiation and data object copy
        assertNotNull(scoreBoard);
        assertEquals(1,scoreBoard.getSummary().size());

    }

    @Test
    public void shouldBeAbleToStartGames(){
        List<GameImpl> games = new ArrayList<>();
        ScoreBoardImpl scoreBoard = new ScoreBoardImpl(games);

        // Check Empty
        assertNotNull(scoreBoard);
        assertEquals(0,scoreBoard.getSummary().size());
        
        // Start game and check if it updates
        scoreBoard.startGame(game);
        assertEquals(1,scoreBoard.getSummary().size());
    }

    @Test
    public void shouldBeAbleToFinishGames() throws GameNotFoundException{
        List<GameImpl> games = new ArrayList<>();
        games.add(this.game);
        ScoreBoardImpl scoreBoard = new ScoreBoardImpl(games);

        // Check Empty
        assertNotNull(scoreBoard);
        assertEquals(1,scoreBoard.getSummary().size());
        
        // Finish game and check if it updates. Should not throw error
        scoreBoard.finishGame(this.game);
        assertEquals(0,scoreBoard.getSummary().size());
    }

    @Test 
    public void shouldBeAbleToUpdateGameScore() throws GameNotFoundException{
        List<GameImpl> games = new ArrayList<>();
        games.add(this.game);
        ScoreBoardImpl scoreBoard = new ScoreBoardImpl(games);
        ScoreImpl score = new ScoreImpl(1,2);

        scoreBoard.updateScore(game,score);
    }

    @Test 
    public void shouldGenerateSummary(){

    }

    @Test
    public void shouldThrowExceptionOnNonExistingGameUpdate(){

    }

    @Test
    public void shouldThrowExceptionOnNonExistingGameFinish(){

    }
}
