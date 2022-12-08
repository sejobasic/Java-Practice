import java.util.Scanner;

public class Arrays {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    String[] seats = { "Harry", "Neville", "Ron", "Hermione", "Seamus" };

    System.out.println(seats[0] + ", you will take seat 0");
    System.out.println(seats[1] + ", you will take seat 1");
    System.out.println(seats[2] + ", you will take seat 2");
    System.out.println(seats[3] + ", you will take seat 3");
    System.out.println(seats[4] + ", you will take seat 4");

    String[] cars = { "E30", "E40", "E28" };
    for (int i = 0; i < cars.length; i++) {
      System.out.println(cars[i]);
    }

    String[] items = { "apples", "bananas", "candy", "chocolate", "coffee", "tea" };

    System.out.println("Welcome to Java Grocers.");
    System.out.println("What can I help you find?\n");
    String userInput = scan.nextLine();

    for (int i = 0; i < items.length; i++) {
      if (items[i].equals(userInput)) {
        System.out.println("\nWe have that in aisle: " + i);
        break;
      }
    }

    scan.close();

    int[] scores = { getRandomNum(), getRandomNum(), getRandomNum(), getRandomNum() };
    int highScore = 0;

    System.out.print("Here are the scores: ");
    for (int i = 0; i < scores.length; i++) {
      System.out.print(scores[i] + " ");

      if (scores[i] > highScore) {
        highScore = scores[i];
      }
    }

    System.out.println("\nThe highest score is: " + highScore);


    String[] apples = {"Gala", "Granny Smith", "Macintosh"};
    double[] price = {1.99, 1.49, 1.29};

    for (int i = 0; i < apples.length; i++) {
      System.out.println(apples[i] + ": $" + price[i]);
    }

  }

  public static int getRandomNum() {
    double randomNum = Math.random() * 50000;
    return (int) randomNum;
  }
}
