package com.example.demo.models.classes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.example.demo.models.exceptions.GameNotFoundException;
import com.example.demo.models.interfaces.Game;

public class ScoreBoardImplTests {
    private TeamImpl away = new TeamImpl("Away");
    private TeamImpl home = new TeamImpl("Home");
    private GameImpl game = new GameImpl(home,away);


    
    @Test
    public void shouldCreateObject(){
        // Initialize objects
        List<Game> games = new ArrayList<>();
        games.add(this.game);
        ScoreBoardImpl scoreBoard = new ScoreBoardImpl(games);

        // Check instantiation and data object copy
        assertNotNull(scoreBoard);
        assertEquals(1,scoreBoard.getSummary().size());

    }

    @Test
    public void shouldBeAbleToStartGames(){
        List<Game> games = new ArrayList<>();
        ScoreBoardImpl scoreBoard = new ScoreBoardImpl(games);

        // Check Empty
        assertNotNull(scoreBoard);
        assertEquals(0,scoreBoard.getSummary().size());
        
        // Start game and check if it updates
        scoreBoard.startGame(game);
        assertEquals(1,scoreBoard.getSummary().size());
    }

    @Test
    public void shouldBeAbleToFinishGames() throws GameNotFoundException{
        List<Game> games = new ArrayList<>();
        games.add(this.game);
        ScoreBoardImpl scoreBoard = new ScoreBoardImpl(games);

        // Check Empty
        assertNotNull(scoreBoard);
        assertEquals(1,scoreBoard.getSummary().size());
        
        // Finish game and check if it updates. Should not throw error
        scoreBoard.finishGame(this.game);
        assertEquals(0,scoreBoard.getSummary().size());
    }

    @Test 
    public void shouldBeAbleToUpdateGameScore() throws GameNotFoundException{
        List<Game> games = new ArrayList<>();
        games.add(this.game);
        ScoreBoardImpl scoreBoard = new ScoreBoardImpl(games);
        ScoreImpl score = new ScoreImpl(1,2);

        scoreBoard.updateScore(game,score);

        assertEquals(1,score.getHomeScore());
        assertEquals(2,score.getAwayScore());
    }

    /**
     * The summary would provide with the following information:
     * 4 Uruguay 6 - Italy 6
     * 2 Spain 10 - Brazil 2
     * 1 Mexico 0 - Canada 5
     * 5 Argentina 3 - Australia 1
     * 3 Germany 2 - France 2
     */
    @Test 
    public void shouldGenerateSummary(){
        // Generate Games Dataset
        List<Game> data = this.getDataFromSystem();
        ScoreBoardImpl scoreboard = new ScoreBoardImpl(data);
        
        List<Integer> expectedOrder = List.of(4,2,1,5,3);
        List<Game> resume = scoreboard.getSummary();
        
        // Check order
        for(int i=0;i<expectedOrder.size();i++){
            assertEquals(expectedOrder.get(i), resume.indexOf(game));
        }  
    }

    @Test
    public void shouldThrowExceptionOnNonExistingGameUpdate(){
        List<Game> games = new ArrayList<>();
        ScoreBoardImpl scoreBoard = new ScoreBoardImpl(games);
        ScoreImpl score = new ScoreImpl(1,2);

        try{
            scoreBoard.updateScore(this.game,score);
            fail();
        }catch(Exception e){
            assertEquals(GameNotFoundException.class, e.getClass());
        }
    }

    @Test
    public void shouldThrowExceptionOnNonExistingGameFinish(){
        List<Game> games = new ArrayList<>();
        ScoreBoardImpl scoreBoard = new ScoreBoardImpl(games);

        try{
            scoreBoard.finishGame(this.game);
            fail();
        }catch(Exception e){
            assertEquals(GameNotFoundException.class, e.getClass());
        }
    }


    /**
     * 1 Mexico - Canada: 0 - 5
     * 2 Spain - Brazil: 10 – 2
     * 3 Germany - France: 2 – 2
     * 4 Uruguay - Italy: 6 – 6
     * 5 Argentina - Australia: 3 - 1
     */
    private List<Game> getDataFromSystem(){
        List<Game> games = new ArrayList<>();
        GameImpl mexico_canada = new GameImpl(new TeamImpl("Mexico"), new TeamImpl("Canada"));
        mexico_canada.setScore(new ScoreImpl(0,5));

        GameImpl spain_brazil = new GameImpl(new TeamImpl("Spain"), new TeamImpl("Brazil"));
        spain_brazil.setScore(new ScoreImpl(10,2));

        GameImpl germany_france = new GameImpl(new TeamImpl("Germany"), new TeamImpl("France"));
        germany_france.setScore(new ScoreImpl(2,2));

        GameImpl uruguay_italy = new GameImpl(new TeamImpl("Uruguay"), new TeamImpl("Italy"));
        uruguay_italy.setScore(new ScoreImpl(6,6));

        GameImpl argentina_australia = new GameImpl(new TeamImpl("Argentina"), new TeamImpl("Australia"));
        argentina_australia.setScore(new ScoreImpl(3,1));

        games.addAll(List.of(mexico_canada,spain_brazil,germany_france,uruguay_italy,argentina_australia));

        return games;
    }
}
