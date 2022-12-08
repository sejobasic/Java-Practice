import java.util.Scanner;

public class Javagram {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String username = "Sejo";
    String password = "Java";

    System.out.print("Username: ");
    String userInput = scan.nextLine();

    System.out.print("Password: ");
    String passInput = scan.nextLine();

    while (!userInput.equals(username) || !passInput.equals(password)) {
      System.out.println("\nIncorrect, please try again");
      System.out.print("\nUsername: ");
      userInput = scan.nextLine();
      System.out.print("Password: ");
      passInput = scan.nextLine();
    }

    System.out.print("\nSign in successful!");
  }
}
