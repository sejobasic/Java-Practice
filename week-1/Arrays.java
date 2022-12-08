public class Arrays {
  public static void main(String[] args) {
    String[] seats = {"Harry", "Neville", "Ron", "Hermione", "Seamus"};

    System.out.println(seats[0] + ", you will take seat 0");
    System.out.println(seats[1] + ", you will take seat 1");
    System.out.println(seats[2] + ", you will take seat 2");
    System.out.println(seats[3] + ", you will take seat 3");
    System.out.println(seats[4] + ", you will take seat 4");


    String[] cars = {"E30", "E40", "E28"};
    for (int i = 0; i < cars.length; i++) {
      System.out.println(cars[i]);
    }
  }
}
