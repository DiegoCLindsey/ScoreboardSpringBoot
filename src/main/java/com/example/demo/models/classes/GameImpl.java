package com.example.demo.models.classes;

import com.example.demo.models.interfaces.Game;
import com.example.demo.models.interfaces.Score;
import com.example.demo.models.interfaces.Team;

/**
 * Holds the implementation of a {@link Game} interface.
 */
public class GameImpl implements Game{

    /**
     * Private attributes.
     */
    private Team homeTeam;
    private Team awayTeam;
    private Score score;


    /**
     * Basic constructor for GameImpl Objects.
     * @param homeTeam The 'Home Team'
     * @param awayTeam The 'Away Team'
     */
    public GameImpl(Team homeTeam, Team awayTeam){
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.score = new ScoreImpl();
    }

    /**
     * @return the Away {@link Team} Object.
     */
    @Override
    public Team getAwayTeam() {
        return this.awayTeam;
    }
    
    /**
     * @return the Home {@link Team} Object.
     */
    @Override
    public Team getHomeTeam() {
        return this.homeTeam;
    }

    /**
     * @return the Game {@link Score} Object.
     */
    @Override
    public Score getScore() {
        return this.score;
    }

    /**
     * Updates Score with a new {@link Score} Object.
     */
    @Override
    public void setScore(Score newScore) {
        this.score = newScore;        
    }
    
}
