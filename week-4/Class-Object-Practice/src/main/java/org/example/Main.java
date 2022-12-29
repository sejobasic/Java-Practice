package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Random rand = new Random();

        int randomNum = rand.nextInt(5) + 1;

        boolean playerGuessCorrect = false;

        while (!playerGuessCorrect) {
            System.out.println("Enter your guess (1-100)");
            int guess = scan.nextInt();
            if (guess == randomNum) {
                System.out.println("Correct! You Win!");
                playerGuessCorrect = true;
            } else if (randomNum > guess) {
                System.out.println("Nope! the number is higher");
            } else if (randomNum < guess) {
                System.out.println("Nope! the number is lower");
            }
        }
    }
}