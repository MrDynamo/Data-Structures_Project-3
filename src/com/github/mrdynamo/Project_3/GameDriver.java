package com.github.mrdynamo.Project_3;

import java.util.Scanner;

public class GameDriver {

    /** Class Variables **/

    /** Class Methods **/

    /** Main Method **/
    public static void main(String[] args) {
        boolean quit = false;
        boolean cont = true;

        Scanner input = new Scanner(System.in);

        GameTree game1 = new Game();
        game1.startGame("Does it have legs?", "Cat", "Snake");

        System.out.println("Think of an animal and I will guess it!\n");

        // While not quit && cont
        while (!quit && cont) {

            // Prompt questions
            while (game1.isQuestion()) {

                System.out.println(game1.getQuestion());

                if (input.nextLine().equalsIgnoreCase("quit"))
                    quit = true;
                else {
                    if (input.nextLine().equalsIgnoreCase("yes"))
                        game1.moveYes();
                    else if (input.nextLine().equalsIgnoreCase("no"))
                        game1.moveNo();
                    else
                        System.out.println("Please enter either 'yes' or 'no'.");
                }

            }

            // Guess animal
            System.out.println("Is it a " + game1.getAnswer() + "\n");

            // if yes, prog wins
            if (input.nextLine().equalsIgnoreCase("yes")) {
                System.out.println("I win!\nThe animal you were thinking of was a " + game1.getAnswer());
                game1.newRound();
            }
            // if no, add new question
            else if (input.nextLine().equalsIgnoreCase("no")) {
                System.out.println("Please enter a question: ");
                String q = input.nextLine();
                System.out.println("Please enter the answer to that question: ");
                String a = input.nextLine();
                game1.setQuestion(q, a);
                game1.newRound();
            }

            // Prompt continue?
            System.out.println("\nDo you want to continue?\n");

            if (input.nextLine().equalsIgnoreCase("yes"))
                cont = true;
            else if (input.nextLine().equalsIgnoreCase("no"))
                cont = false;

        }

        /*
        while (!quit) {

            System.out.println(game1.getQuestion());
            if (input.nextLine().equalsIgnoreCase("quit"))
                quit = true;
            else {
                if (input.nextLine().equalsIgnoreCase("yes"))
                    game1.moveYes();
                else if (input.nextLine().equalsIgnoreCase("no"))
                    game1.moveNo();
                else
                    System.out.println("Please enter either 'yes' or 'no'.");
            }


        }

        game1.endGame();

         */
    }
}
