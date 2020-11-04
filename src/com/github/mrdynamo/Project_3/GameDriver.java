package com.github.mrdynamo.Project_3;

import java.util.Scanner;

public class GameDriver {

    /** Class Variables **/
    //private boolean quit = false;

    /** Class Methods **/

    /** Main Method **/
    public static void main(String[] args) {
        boolean quit = false;
        Scanner input = new Scanner(System.in);
        Game game1 = new Game();
        game1.startGame("Is 5 > 4", "yes", "no");

        while (!quit) {
            if (input.equals("quit")) {
                quit = true;
            }
            else {

            }
        }

        game1.endGame();
    }
}
