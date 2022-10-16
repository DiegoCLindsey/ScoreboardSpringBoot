package com.example.demo.models.classes;

import java.util.List;

import com.example.demo.models.exceptions.GameNotFoundException;
import com.example.demo.models.interfaces.Game;
import com.example.demo.models.interfaces.ScoreBoard;

public class ScoreBoardImpl implements ScoreBoard{

    private List<GameImpl> games;


    public ScoreBoardImpl(List<GameImpl> data){
        this.games.addAll(data);
       }

    @Override
    public void startGame(Game newGame){
        // TODO Auto-generated method stub
        
    }

    @Override
    public void finishGame(Game game) throws GameNotFoundException{
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updateScore(Game game) throws GameNotFoundException {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Game> getSummary() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
