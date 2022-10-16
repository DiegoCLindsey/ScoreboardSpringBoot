package com.example.demo.models.classes;

import com.example.demo.models.interfaces.Game;
import com.example.demo.models.interfaces.Score;
import com.example.demo.models.interfaces.Team;

public class GameImpl implements Game{

    private Team homeTeam;
    private Team awayTeam;
    private Score score;


    public GameImpl(Team homeTeam, Team awayTeam){
        //TODO: Implement constructor
    }

    @Override
    public Team getAwayTeam() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Team getHomeTeam() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getScore() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setScore(Score newScore) {
        // TODO Auto-generated method stub
        
    }
    
}
