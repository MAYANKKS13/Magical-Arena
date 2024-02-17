package com.game;

import java.util.Random;
import java.util.logging.Logger;

public class MagicalArena {

    private static final Logger LOGGER = Logger.getLogger(MagicalArena.class.getName());

    private final Player player1;
    private final Player player2;

    public MagicalArena(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void playMatch() {
        Player attacker = getAttacker();
        Player defender = getDefender();
        int round = 0;
        while (canPlay()) {
            round++;
            int attackerRollValue = rollDice();
            int defenderRollValue = rollDice();

            int damageByAttacker = attackerRollValue * attacker.getAttack();
            int defendedDamage = defenderRollValue * defender.getStrength();

            int currentDamage = Math.max(damageByAttacker - defendedDamage, 0);
            defender.setHealth(currentHealth(currentDamage, defender.getHealth()));

            LOGGER.info("Attacker " + attacker.getName() + " attacks to defender " + defender.getName() +
                    " with " + currentDamage + " damage in round " + round);
            LOGGER.info("After round " + round + " Player: " + attacker.getName() + " health: " +
                    attacker.getHealth() + " and Player: " + defender.getName() + " health: " + defender.getHealth());

            // For next round swap attacker and defender
            Player auxiliary = attacker;
            attacker = defender;
            defender = auxiliary;

        }

        if (player1.getHealth() <= 0) {
            LOGGER.info(player2.getName() + " wins!");
        } else {
            LOGGER.info(player1.getName() + " wins!");
        }
    }

    private Player getAttacker() {
        if (player1.getHealth() < player2.getHealth()) {
            return player1;
        } else {
            return player2;
        }
    }

    private Player getDefender() {
        if (getAttacker() == player1) {
            return player2;
        }
        return player1;
    }

    private boolean canPlay() {
        return player1.getHealth() > 0 && player2.getHealth() > 0;
    }

    private int rollDice() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
//        return 6;
    }

    private int currentHealth(int damage, int health) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
        return health;
    }
}
