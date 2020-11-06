package com.github.mrdynamo.Project_3;

import java.util.Scanner;

public class GameDriver {

    /** Class Variables **/

    /** Class Methods **/

    /** Main Method **/
    public static void main(String[] args) {
        boolean quit = false;
        boolean cont = true;

        Scanner kbd = new Scanner(System.in);
        String input;

        GameTree game1 = new Game();
        game1.startGame("Does it have legs?", "Cat", "Snake");

        System.out.println("Think of an animal and I will guess it!\n");

        // While not quit && cont
        while (!quit && cont) {

            // Prompt questions
            while (game1.isQuestion()) {

                System.out.println(game1.getQuestion());
                input = kbd.nextLine();

                if (input.equalsIgnoreCase("quit"))
                    quit = true;
                else {
                    if (input.equalsIgnoreCase("yes"))
                        game1.moveYes();
                    else if (input.equalsIgnoreCase("no"))
                        game1.moveNo();
                    else
                        System.out.println("Please enter either 'yes' or 'no'.");
                }

            }

            // Guess animal
            System.out.println("Is it a " + game1.getAnswer() + "?\n");
            input = kbd.nextLine();

            // if yes, prog wins
            if (input.equalsIgnoreCase("yes")) {
                System.out.println("I win!\nThe animal you were thinking of was a " + game1.getAnswer() + "!");
                game1.newRound();
            }
            // if no, add new question
            else if (input.equalsIgnoreCase("no")) {
                System.out.println("Please enter a question: ");
                String q = kbd.nextLine();
                System.out.println("Please enter the answer to that question: ");
                String a = kbd.nextLine();
                game1.setQuestion(q, a);
                game1.newRound();
            }

            // Prompt continue?
            System.out.println("\nDo you want to continue?\n");
            input = kbd.nextLine();

            if (input.equalsIgnoreCase("yes"))
                cont = true;
            else if (input.equalsIgnoreCase("no"))
                cont = false;

        }

        game1.endGame();

    }
}
