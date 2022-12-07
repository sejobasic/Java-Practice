public class Convert {
  public static void main(String[] args) {
    double noon = 77;
    double evening = 61;
    double midnight = 55;

    printTemp(noon);
    printTemp(evening);
    printTemp(midnight);

  }

  /**
   * Function: Converts fahrenheit to celsius with formula
   * @param f
   * @return celsius double
   */
  public static double fahrenheitToCelsius(double f) {
    return (f - 32) * 5/9;
  }

  /**
   * Function: Prints fahrenheit and celsius values - Calls f to c to get celsius
   * @param f
   */
  public static void printTemp(double f) {
    double celsius = fahrenheitToCelsius(f);
    System.out.println("F: " + f);
    System.out.println("C: " + celsius);
  }
}
