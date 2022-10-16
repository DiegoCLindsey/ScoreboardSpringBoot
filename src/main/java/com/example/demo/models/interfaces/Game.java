package com.example.demo.models.interfaces;

/**
 * A game is defined by the teams which plays it and its scores.
 */
public interface Game {
    /**
     *
     * @return the {@link Team} object which defines the 'Away Team'
     */
    Team getAwayTeam();
    /**
     * 
     * @return the {@link Team} object which holds the 'Home team'
     */
    Team getHomeTeam();

    /**
     * 
     * @return the {@link Score} of the game
     */
    Score  getScore();

    /**
     * Sets the score of the game given a {@link Score} pair
     * @param newScore the new Score of the game
     */
    void setScore(Score newScore);
}
