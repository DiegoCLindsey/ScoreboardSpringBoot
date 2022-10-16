package com.example.demo.models.classes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.example.demo.models.exceptions.GameNotFoundException;
import com.example.demo.models.interfaces.Game;
import com.example.demo.models.interfaces.Score;
import com.example.demo.models.interfaces.ScoreBoard;

public class ScoreBoardImpl implements ScoreBoard{

    private List<Game> games;


    public ScoreBoardImpl(List<Game> data){
        this.games = new ArrayList<>();
        this.games.addAll(data);
       }

    @Override
    public void startGame(Game newGame){
        this.games.add(newGame);
    }

    @Override
    public void finishGame(Game game) throws GameNotFoundException{
        int index = this.games.indexOf(game);
        if(index >= 0){
            this.games.remove(this.games.get(index));
        }else{
            throw new GameNotFoundException();
        }
        
    }

    @Override
    public void updateScore(Game game, Score score) throws GameNotFoundException {
        int index = this.games.indexOf(game);
        if(index >= 0){
            this.games.get(index).setScore(score);;
        }else{
            throw new GameNotFoundException();
        }
        
    }

    @Override
    public List<Game> getSummary() {
        return this.games.stream().sorted((a ,b )->  this.getTotalScore(a) - this.getTotalScore(b)).collect(Collectors.toList());
    }

    private int getTotalScore(Game game){
        return  game.getScore().getAwayScore()+game.getScore().getHomeScore(); 
    }
    
}
