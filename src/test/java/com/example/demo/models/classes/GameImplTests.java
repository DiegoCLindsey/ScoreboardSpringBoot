package com.example.demo.models.classes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameImplTests {
    
    @Test
    public void shouldCreateObject(){
        TeamImpl home = new TeamImpl("Home");
        TeamImpl away = new TeamImpl("Away");
        GameImpl game = new GameImpl(home, away);
        assertNotNull(game);
        assertNotNull(game.getHomeTeam());
        assertNotNull(game.getAwayTeam());
        assertNotNull(game.getScore());
        assertEquals("Home", game.getHomeTeam().getName());
        assertEquals("Away", game.getAwayTeam().getName());
        assertEqueals(0,game.getScore().getAwayScore());
        assertEquals(0,game.getScore().getHomeScore());
    }

    public void shouldBeAbleToGetItsTeams(){
        
    }

    public void shouldBeAbleToGetGameScore(){

    }
    
    public void shouldUpdateScoresCorrectly(){

    }
}
