package com.game;

public class PlayGame {
    public static void main(String[] args) {
        Player playerA = new Player(1, "John", 50, 5, 10);
        Player playerB = new Player(2, "Martin", 100, 10, 5);

        MagicalArena arena = new MagicalArena(playerA, playerB);
        arena.playMatch();
    }
}
