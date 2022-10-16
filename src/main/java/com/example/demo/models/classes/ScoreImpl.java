package com.example.demo.models.classes;

import com.example.demo.models.interfaces.Score;

/**
 * Implementation of the {@link Score} interface
 */
public class ScoreImpl implements Score{

    /**
     * Private variables to hold the scores of each team
     */
    private int awayTeamScore;
    private int homeTeamScore;

    /**
     * Public Empty constructor. Initializes values to zero
     */
    public ScoreImpl(){
        this.awayTeamScore = 0;
        this.homeTeamScore = 0;
    }

    /**
     * Public constructor to instanciate a Score Object
     * @param awayTeamScore the number of points of 'Away Team'
     * @param homeTeamScore the number of points of 'Home Team'
     */
    public ScoreImpl(int homeTeamScore,int awayTeamScore){
        this.homeTeamScore = homeTeamScore;
        this.awayTeamScore = awayTeamScore;
    }

    /**
     * 
     * @return the number of points of 'Away Team'
     */
    public int getAwayScore(){
        return this.awayTeamScore;
    }
    /**
     * 
     * @return the number of points of 'Home Team'
     */
    public int getHomeScore(){
        return this.homeTeamScore;
    }

    /**
     * Increments the 'Away team' score by 1
     */
    public void AwayTeamScores(){
        this.awayTeamScore++;
    }
    
    /**
     * Increments the 'Home team' score by 1
     */
    public void HomeTeamScores(){
        this.homeTeamScore++;
    }
}
