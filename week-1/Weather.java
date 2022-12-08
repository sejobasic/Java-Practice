import java.util.Arrays;

public class Weather {
  public static void main(String[] args) {
    double[] celsius = { 12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0 };
    double[] fahrenheit = cToF(celsius);

    printTemp(celsius, "Celsius");
    printTemp(fahrenheit, "Fahrenheit");

  }

  public static double[] cToF(double[] celsius) {
    double[] fahrenheit = Arrays.copyOf(celsius, celsius.length);
    for (int i = 0; i < fahrenheit.length; i++) {
      fahrenheit[i] = (celsius[i] / 5 * 9) + 32;
    }
    return fahrenheit;
  }

  public static void printTemp(double[] temp, String tempType) {
    System.out.print(tempType + ": ");
    for (int i = 0; i < temp.length; i++) {
      System.out.print(temp[i] + " ");
    }
    System.out.print("\n");
  }
}
