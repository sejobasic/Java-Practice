public class Loops {
  public static void main(String[] args) {
    for (int i = 99; i >= 1; i--) {
      sing(i);
    }

    double choice = 0.01;
    double guess = 0.99;
    while(guess > choice) {
      guess = Math.random();
      System.out.println(guess);
    }

    for (int i = 0; i <= 10; i++) {
      if (i % 2 != 0) {
        continue;
      }
      System.out.println(i);
    }
  }

  public static void sing(int i) {
    System.out.println(i + "bottles of beer on the wall, "+ i +" bottles of beer! take one down, pass it around "+ (i - 1) +", bottles of beer on the wall!"
    );
  }
}
