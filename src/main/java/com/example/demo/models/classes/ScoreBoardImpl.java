package com.example.demo.models.classes;

import java.util.Collection;

import com.example.demo.models.exceptions.GameNotFoundException;
import com.example.demo.models.interfaces.Game;
import com.example.demo.models.interfaces.ScoreBoard;

public class ScoreBoardImpl implements ScoreBoard{

    public ScoreBoardImpl(Collection<Game> data){
        // TODO: Implement constructor
    }

    @Override
    public void startGame(Game newGame) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void finishGame(Game game) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updateScore(Game game) throws GameNotFoundException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Collection<Game> getSummary() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
