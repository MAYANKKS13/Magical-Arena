### Problem Statement:

#### Design a Magical Arena. 
```
Every Player is defined by a “health” attribute, “strength” attribute and an “attack” attribute - all positive integers. 
The player dies if his health attribute touches 0. Any two player can fight a match in the arena. 
Players attack in turns. Attacking player rolls the attacking dice and the defending player rolls the defending dice.
The “attack”  value multiplied by the outcome of the  attacking dice roll is the damage created by the attacker. 
The defender “strength” value, multiplied by the outcome of the defending dice is the damage defended by the defender. 
Whatever damage created by attacker which is in excess of the damage defended by the defender
will reduce the “health” of the defender. Game ends when any players health reaches 0
```
```
Player with lower health attacks first at the start of a match.
Assume two players . Player A 50 health 5 strength 10 attack Player B 100 health 10 stregnth and
5 attack . Attacking die and Defending die are both 6 sided die with values ranging from 1- 6.
Player A attacks and rolls die. Die roll : 5 . Player B defends and rolls die. Die roll 2
Attack damage is 5 * 10 = 50 ; Defending strength = 10 * 2 = 20 ; Player B health reduced by 30 to 70
Player B attacks and rolls die. Die roll : 4. Player A defends and rolls die. Die Roll 3
Attack damage is 4 * 5 = 20 ; Defending strength = 5 * 3 = 15 ; Player A health reduced by 5 to 45
And so on
```

### How to Run the code
```
 - Run main method of PlayGame Class.
 - Unit Test case covered in MagicalArenaTest class using junit.
```