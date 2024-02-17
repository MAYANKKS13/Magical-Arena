package com.game;

import org.junit.Assert;
import org.junit.Test;

public class MagicalArenaTest {


    @Test
    public void testGame(){
        Player player1 = new Player(1, "Player1", 0, 5, 10);
        Player player2 = new Player(2, "Player2", 0, 10, 5);

        MagicalArena arena = new MagicalArena(player1, player2);
        arena.playMatch();
        Assert.assertEquals(arena.getWinner(), null);
    }
}
