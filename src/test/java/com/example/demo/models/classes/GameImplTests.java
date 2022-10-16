package com.example.demo.models.classes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameImplTests {
    
    /**
     * Basic test. Checks if the Game object instantiates correctly.
     */
    @Test
    public void shouldCreateObject(){
        TeamImpl home = new TeamImpl("Home");
        TeamImpl away = new TeamImpl("Away");
        GameImpl game = new GameImpl(home, away);
        assertNotNull(game);
    }

    /**
     * Checks if the games are correctly set after object construction.
     */
    @Test
    public void shouldBeAbleToGetItsTeams(){
        TeamImpl home = new TeamImpl("Home");
        TeamImpl away = new TeamImpl("Away");
        GameImpl game = new GameImpl(home, away);
        assertNotNull(game.getHomeTeam());
        assertNotNull(game.getAwayTeam());
        assertEquals("Home", game.getHomeTeam().getName());
        assertEquals("Away", game.getAwayTeam().getName());
    }

    /**
     * Checks if the game Score is correctly set after object construction.
     */
    @Test
    public void shouldBeAbleToGetGameScore(){
        TeamImpl home = new TeamImpl("Home");
        TeamImpl away = new TeamImpl("Away");
        GameImpl game = new GameImpl(home, away);
        assertNotNull(game.getScore());
        assertEquals(0,game.getScore().getAwayScore());
        assertEquals(0,game.getScore().getHomeScore());

    }
    
    /**
     * Checks if the game Score is correctly updated after setScore() method
     */
    @Test
    public void shouldUpdateScoresCorrectly(){
        TeamImpl home = new TeamImpl("Home");
        TeamImpl away = new TeamImpl("Away");
        GameImpl game = new GameImpl(home, away);
        assertNotNull(game.getScore());
        assertEquals(0,game.getScore().getAwayScore());
        assertEquals(0,game.getScore().getHomeScore());
        game.setScore(new ScoreImpl(1,2));
        assertNotNull(game.getScore());
        assertEquals(2,game.getScore().getAwayScore());
        assertEquals(1,game.getScore().getHomeScore());

    }
}
