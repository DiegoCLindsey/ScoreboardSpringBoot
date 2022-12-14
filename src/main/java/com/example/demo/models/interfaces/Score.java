package com.example.demo.models.interfaces;

/**
 * The interface Score holds the score of a {@link Game}.
 */
public interface Score {
    /**
     * 
     * @return the number of points scored by 'Away team'
     */
    public int getAwayScore();

    /**
     * 
     * @return the number of points scored by 'Home team'
     */
    public int getHomeScore();

    /**
     * Increments the 'Away Team' score by 1
     */
    public void AwayTeamScores();
    /**
     * Increments the 'Home Team' score by 1
     */
    public void HomeTeamScores();

}
