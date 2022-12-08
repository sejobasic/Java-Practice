import java.util.Arrays;

public class UpdatingArrays {
  public static void main(String[] args) {
    String[] menu = {"Espresso", "Iced Coffee", "Hot Coffee"};
    menu[2] = "Latte";

    System.out.println(Arrays.toString(menu));

    String[] newMenu = new String[5];

    for (int i = 0; i < menu.length; i ++) {
      newMenu[i] = menu[i];
    }
    newMenu[3] = "House Blend";
    newMenu[4] = "Dark Roast";
    System.out.println(Arrays.toString(newMenu));


    double[] prices = {1.99, 2.99, 3.99, 4.99};
    double[] afterTax = new double[4];

    for (int i = 0; i < 4; i++) {
      afterTax[i] = prices[i] + 0.13;
    }
    System.out.println(Arrays.toString(afterTax));
  }
}
