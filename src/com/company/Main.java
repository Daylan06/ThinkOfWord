package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Think of a word");
        String wordThink = input.next();
        //System.out.println(wordThink);

        System.out.println("Try guess the word");
        String wordGuess = input.next();
        //System.out.println(wordGuess);

        boolean total = wordThink.equals(wordGuess);

        System.out.println(total);
        if (total == false) {
            System.out.println("Sorry you didn't guess the word try again");
        } else if (total == true) {
            System.out.println("You guessed the word well done!");
        }
    }
}




