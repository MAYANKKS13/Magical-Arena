package com.game;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class MagicalArenaTest {


    @Test
    public void testGameBothPlayerZeroHealth(){
        Player player1 = new Player(1, "Player1", 0, 5, 10);
        Player player2 = new Player(2, "Player2", 0, 10, 5);

        MagicalArena arena = new MagicalArena(player1, player2);
        arena.playMatch();
        Assert.assertEquals(arena.getWinner(), null);
    }

    @Test
    public void testGameEitherPlayerZeroHealth(){
        Player player1 = new Player(1, "Player1", 0, 5, 10);
        Player player2 = new Player(2, "Player2", 10, 10, 5);

        MagicalArena arena = new MagicalArena(player1, player2);
        arena.playMatch();
        Assert.assertEquals(arena.canPlay(), false);


        player1.setHealth(10);
        player2.setHealth(0);
        arena = new MagicalArena(player1, player2);
        arena.playMatch();
        Assert.assertEquals(arena.canPlay(), false);

    }

    @Test
    public void testGameWithNegativeHealth(){
        Player player1 = new Player(1, "Player1", -20, 5, 10);
        Player player2 = new Player(2, "Player2", 10, 10, 5);

        MagicalArena arena = new MagicalArena(player1, player2);
        arena.playMatch();
        Assert.assertEquals(arena.canPlay(), false);

        player1.setHealth(-10);
        player2.setHealth(50);
        arena = new MagicalArena(player1, player2);
        arena.playMatch();
        Assert.assertEquals(arena.canPlay(), false);
    }

    @Test
    public void testGameBothPlayerNegativeHealth(){
        Player player1 = new Player(1, "Player1", -10, 5, 10);
        Player player2 = new Player(2, "Player2", -5, 10, 5);

        MagicalArena arena = new MagicalArena(player1, player2);
        arena.playMatch();
        Assert.assertEquals(arena.canPlay(), false);

    }

    @Test
    public void testGameHappyScenario(){
        Player player1 = new Player(1, "Player1", 50, 5, 10);
        Player player2 = new Player(2, "Player2", 100, 10, 5);
        List<Player> playerList = List.of(player1, player2);
        MagicalArena arena = new MagicalArena(player1, player2);
        arena.playMatch();
        Assert.assertTrue(playerList.contains(arena.getWinner()));

    }
}
