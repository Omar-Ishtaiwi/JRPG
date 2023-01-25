# Java JRPG-Text-Game

This is a simple command-line RPG battle simulation game written in Java. The main method prompts the user to choose a character, then creates an instance of the chosen character and a randomly generated opponent character. Then it uses the battle method to simulate the battle between the two characters.

The code also uses the Scanner class to read user input from the command line. It also uses a switch statement to determine which character the user has chosen and uses the Math.random() method to generate random numbers.The battle method alternates between who is attacking each turn and uses the attack method to simulate the attack and calculates the damage dealt. The damage dealt is based on the move's damage, the level difference between the characters, and a random integer. The attack method also takes into account the type of the characters and applies a multiplier to the damage if the attacking character's type is super effective or not effective to the defending character.







