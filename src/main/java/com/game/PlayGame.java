package com.game;

public class PlayGame {
    public static void main(String[] args) {
        Player john = new Player(1, "John", 50, 5, 10);
        Player martin = new Player(2, "Martin", 100, 10, 5);

        MagicalArena arena = new MagicalArena(john, martin);
        arena.playMatch();
    }
}
