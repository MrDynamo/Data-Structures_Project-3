package com.github.mrdynamo.Project_3;

import java.util.Scanner;

public class GameDriver {

    /** Class Variables **/

    /** Class Methods **/

    /** Main Method **/
    public static void main(String[] args) {
        boolean quit = false;
        Scanner input = new Scanner(System.in);

        GameTree game1 = new Game();
        game1.startGame("Is 5 > 4", "yes", "no");

        while (!quit) {
            System.out.println(game1.getQuestion());
            if (input.nextLine().equalsIgnoreCase("quit"))
                quit = true;
            else {
                if (input.nextLine().equalsIgnoreCase(game1.getAnswer()))
                    game1.moveYes();
                else
                    game1.moveNo();
            }
        }

        game1.endGame();
    }
}
