package com.example.demo.models.classes;

import com.example.demo.models.interfaces.Team;

/**
 * Implementation class of a team.
 */
public class TeamImpl implements Team{

    // Holds the attribute name.
    private String name;

    /**
     * Constructor for the class TeamImpl. Implements a Team Object
     * @param name the name of the team instance
     */
    public TeamImpl(String name){
        this.name = name;
    }

    /**
     * @return The name of the team
     */
    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.name;
    }
}
