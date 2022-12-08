import java.util.Scanner;

// Use scanner to pickup users answers
// Store users choice in string
// Generate a random string based of random num for the computers choice

// Game outcome
// - if the answer is yes:
  // print: Great!
  // print: rock - paper - scissors, shoot!
  // pick up user's choice.
  // get the computer choice (can be done after task 3).
  // get the result (can only be done after task 4)
  // print everything (can only ﻿b﻿e done after task 5).
// else:yes
   // print: Darn, some﻿ other time...!

public class RockPaperScissors {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Let's play Rock Paper Scissors.");
    System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.");

    System.out.println("\nAre you ready? Write 'yes' if you are");
    String decision = scan.nextLine();

    if (decision.equals("yes")) {
      System.out.println("\nGreat!");
      System.out.println("\nrock - paper - scissors, shoot!");

      String userChoice = scan.nextLine();
      String compChoice = randomChoice();
      String result = gameResult(userChoice, compChoice);

      printResult(userChoice, compChoice, result);
    } else {
      System.out.println("Darn, some other time...!");
    }
    scan.close();
  }

  public static String randomChoice() {
    double randomNum = Math.random() * 3 + 1;

    switch ((int)randomNum) {
      case 1: return "rock";
      case 2: return "paper";
      case 3: return "scissors";
      default: return "rock";
    }
  }

  public static String gameResult(String userChoice, String compChoice) {
    String result = "";

    if (
      userChoice.equals("rock") && 
      compChoice.equals("scissors") ||
      userChoice.equals("paper") && 
      compChoice.equals("rock") ||
      userChoice.equals("scissors") && 
      compChoice.equals("paper")
      ) {
        result = "You win!";
    } else if (
      compChoice.equals("rock") && 
      userChoice.equals("scissors") ||
      compChoice.equals("paper") && 
      userChoice.equals("rock") ||
      compChoice.equals("scissors") && 
      userChoice.equals("paper")
      ) {
        result = "You lose!";
    } else if (userChoice.equals(compChoice)) {
      result = "Its a tie";
    } else {
      System.out.println("INVALID CHOICE");
      System.exit(0);
    }

    return result;
  }

  public static void printResult(String userChoice, String compChoice, String result) {
    System.out.println("\nYou chose: " + userChoice);
    System.out.println("The computer chose: " + compChoice);
    System.out.println(result);
  }
}
