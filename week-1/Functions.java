import javax.sound.midi.SysexMessage;

public class Functions {
  public static void main(String[] args) {
    double area = calculateArea(2.5, 5.5);
    printArea(2.5, 5.5, area);

    double tip = calculateTip(100.00);
    System.out.println("Your service was great! Here is a tip: " + tip);

    String english = explainArea("English");
    System.out.println(english);

  }

  public static double calculateArea(double length, double width) {
    if (length < 0 || width < 0) {
      System.out.println("INVALID DIMENSIONS");
      System.exit(0);
    }
    double area = length * width;
    return area;
  }

  public static double calculateTip(double bill) {
    double tip = bill * 0.25;
    return tip;
  }

  public static String explainArea(String language) {
    switch (language) {
      case "English":
        return "Area equals length * width";
      case "French":
        return "La surface est egale a la longueur * la largeur";
      case "Spanish":
        return "area es ligula a largo * ancho";
      default:
        return "Language does not exist";
    }
  }

  public static void printArea(
  double length, 
  double width, 
  double area) {
    System.out.println();
  }
}