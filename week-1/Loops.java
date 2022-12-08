import java.util.Scanner;

public class Loops {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Hi, please choose a number to count up to: ");
    int num = scan.nextInt();

    for (int i = 0; i <= num; i++) {
      System.out.print(i);
    }

    scan.close();
  }
}
