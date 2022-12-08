import java.util.Scanner;

public class JavaRolls {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Lets play Rolling Java. Type anything to start.");
    scan.nextLine();

    System.out.println("Great, here are the rules:\n");
    System.out.println("- If you roll a 6, the game stops.");
    System.out.println("- If you roll a 4, nothing happens.");
    System.out.println("- Otherwise, you get 1 point.\n");
    System.out.println("You must collect at least 3 points to win. Enter anything to roll:");

    int score = 0;

    while (true) {
      scan.nextLine();
      int diceRoll = rollDice();
      System.out.println("You rolled a " + diceRoll);

      if (diceRoll == 6) {
        System.out.println("End of game\n");
        break;
      } else if (diceRoll == 4) {
        System.out.println("Zero points, keep rolling");
        continue;
      } else {
        score++;
        System.out.println("One point! Keep rolling.");
        continue;
      }
    }
    if (score > 3) {
      System.out.println("Wow, that's a lucky win! You got " + score + " points!");
    } else {
      System.out.println("Tough luck, you lose.");
    }

  }

  public static int rollDice() {
    double randomNum = Math.random() * 6 + 1;
    return (int) randomNum;
  }
}
