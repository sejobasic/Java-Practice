import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        String[] cars = {"Toyota", "Honda", "Ford"};
//        for (String car : cars) {
//            System.out.println(car);
//        }

        List<String> cars = new ArrayList<>();
        cars.add("honda");
        cars.add("toyota");
        cars.add("ford");
        cars.add("ferrari");
        cars.add(1, "jeep");

        cars.remove("jeep");

        // Replace at index
        cars.set(0, "tesla");

        System.out.println(cars);
        System.out.println(cars.get(1));

        // Get length
        System.out.println(cars.size());

        // Check if element exists returns boolean
        System.out.println(cars.contains("tesla"));

        // Sorts in alphabetical order
        Collections.sort(cars);
        System.out.println(cars);

        // Randomly shuffles elements
        Collections.shuffle(cars);
        System.out.println(cars);

        // Sorts in reverse order
        Collections.reverse(cars);
        System.out.println(cars);

        // Convert list to String array - have to pass in type
        String[] carsArr = cars.toArray(new String[0]);

        // Turn array into a List - as list returns as fixed size
        String[] newCars = {"Toyota", "Honda", "Ford"};
        List<String> carsList = Arrays.asList(newCars);

        // This allows us to add new elements to a list it does not return a fixed size
        String[] oldCars = {"Toyota", "Honda", "Ford"};
        List<String> carsList2 = new ArrayList<>(Arrays.asList(oldCars));
        carsList2.add("Nissan");
        System.out.println(carsList2);

        // Removes all elements from list
        cars.clear();
        System.out.println(cars);
    }
}