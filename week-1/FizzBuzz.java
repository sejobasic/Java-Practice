public class FizzBuzz {
  public static void main(String[] args) {
    for (int i = 0; i <= 18; i++) {
      if (divides(i, 3) && divides(i, 5)) {
        System.out.println(i + " FizzBuzz");
      } else if (divides(i, 3)) {
        System.out.println(i + " Fizz");
      } else if (divides(i, 5)) {
        System.out.println(i + " Buzz");
      }
    }
  }

  public static boolean divides(int a, int b) {
    return a % b == 0;
  }
}
