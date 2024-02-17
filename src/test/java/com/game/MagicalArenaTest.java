package com.game;

import org.junit.Assert;
import org.junit.Test;

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
        Assert.assertEquals(arena.getWinner(), player2);

        player1.setHealth(10);
        player2.setHealth(0);
        arena = new MagicalArena(player1, player2);
        arena.playMatch();
        Assert.assertEquals(arena.getWinner(), player1);
    }
}
