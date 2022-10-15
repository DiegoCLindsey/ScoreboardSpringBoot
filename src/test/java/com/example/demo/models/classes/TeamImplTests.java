package com.example.demo.models.classes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class TeamImplTests {

    /**
     * This test creates a TeamImpl object and checks if it's correctly initialized
     */
    @Test
    public void shouldCreateObject(){
        String name = "TestTeam";
        TeamImpl team = new TeamImpl(name);
        assertNotNull(team);
        assertInstanceOf(TeamImpl.class, team);
        assertEquals(team.getName(),name);
    }
}
