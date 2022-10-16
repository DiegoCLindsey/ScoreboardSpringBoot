package com.example.demo.models.interfaces;

import java.util.Collection;

import com.example.demo.models.exceptions.GameNotFoundException;

public interface ScoreBoard {

    /**
     * Adds a match to the scoreboard
     * @param newGame
     */
    void startGame(Game newGame) ;

    /**
     * Removes a match from the scoreboard
     * @param game
     */
    void finishGame(Game game) throws GameNotFoundException;

    /**
     * Updates the score of a match in the scoreboard.
     * @param game the game to update 
     */
    void updateScore(Game game, Score score) throws GameNotFoundException;

    /**
     * 
     * @return a collection of games, ordered by total score and insertion time
     */
    Collection<Game> getSummary();
}
