public class Functions {
  public static void main(String[] args) {
    singChorus();
    calculateArea(2.5, 5.5);
    calculateTip(100.00);
  }

  public static void singChorus() {
    System.out.println("Don't blame it on the sunshine");
    System.out.println("Don't blame it on the moonlight");
    System.out.println("Don't blame it on good times");
    System.out.println("blame it on the boogie");
  } 

  public static void calculateArea(double length, double width) {
    double area = length * width;
    System.out.println("Area: " + area);
  }

  public static void calculateTip(double bill) {
    double tip = bill * 0.25;
    System.out.println("Your service was great! Here is a tip: " + tip);
  }
}
