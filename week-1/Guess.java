import java.util.Scanner;

public class Guess {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int secretNum = 3;

    System.out.print("I chose a number between 1 and 5. Try to guess it: ");
    int userNum = scan.nextInt();

    while (userNum != secretNum) {
      System.out.print("Guess again ");
      userNum = scan.nextInt();
    }
      System.out.println("You got it!");

      scan.close();
  }
}
