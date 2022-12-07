import java.util.Scanner;

// The user needs to pick three numbers
// The user needs to roll the dice three times
// The user wins if: 
  // the sum of dice rolls is smaller than the sum of numbers you chose
  // the difference between the two numbers is less than three

public class Dice {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int roll1 = rollDice();
    int roll2 = rollDice();
    int roll3 = rollDice();

    System.out.println("Enter three numbers between 1-6");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int num3 = scan.nextInt();

    if (num1 < 1 || num2 < 1 || num3 < 1) {
      System.out.println("Numbers cannot be less than 1. Shutting the game down.");
      System.exit(0);
    }

    if (num1 > 6 || num2 > 6 || num3 > 6) {
      System.out.println("Numbers cannot be higher than 6. Shutting the game down.");
      System.exit(0);
    }

    int sumOfNums = num1+num2+num3;
    int sumDiceRolls = roll1+roll2+roll3;
    System.out.println("Dice sum = " + sumDiceRolls + " Number sum = " + sumOfNums);

    if (checkWin(sumDiceRolls, sumOfNums)) {
      System.out.println("Congrats you win!");
    } else {
      System.out.println("Sorry you lose");
    }

    scan.close();
  }

  public static int rollDice() {
    double randomNum = Math.random() * 6 + 1;
    return (int)randomNum;
  }

  public static boolean checkWin(int diceSum, int numSum) {
    return (diceSum < numSum && numSum - diceSum < 3);
  }
}
