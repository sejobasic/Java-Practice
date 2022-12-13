import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Car[] cars = new Car[] {
                new Car("Nissan", 5000, 2020, "Red", new String[] {"Tires", "Keys"}),
                new Car("Dodge", 2000, 2015, "Blue", new String[] {"Radio", "Keys"}),
                new Car("Honda", 1000, 1999, "Green", new String[] {"Sunroof", "Keys"}),
                new Car("Mercedes", 10000, 2020, "Silver", new String[] {"Tires", "Keys"}),
                new Car("Nissan", 7000, 2021, "Black", new String[] {"Tires", "Keys"}),
        };

        Dealership dealership = new Dealership(cars);

        System.out.println("\n Dealership");
        System.out.println("Feel free to browse");
        System.out.println(dealership);
        System.out.println("Which car are you interested in? 0-4");
        int index = scan.nextInt();

        dealership.sell(index);

        scan.close();

    }
}