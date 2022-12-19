import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        // All keys in a map have to be unique
        // You can have duplicate values with different keys
        // Hash Maps are randomly ordered
        Map<Integer, String> employees = new HashMap<>();

        // Linked hash maps maintains map in the order that you put your elements
        // Map<Integer, String> employees = new LinkedHashMap<>();

        // Tree maps sort the order in numerical or alphabetical 1-10 a-z
        // Map<Integer, String> employees = new TreeMap<>();

        employees.put(1241, "Tim");
        employees.put(2123, "Bob");
        employees.put(3254, "Mike");

        // Replace value at given key
        employees.replace(1241, "Morty");

        // Adds element if key doesn't already exist
        employees.putIfAbsent(5555, "Glen");

        // Remove element with given key
        employees.remove(1241);

        // Remove element if key equals the value
        employees.remove(1241, "Tim");

        System.out.println(employees);

        // Get value of specific key
        System.out.println(employees.get(1241));

        // Returns boolean if key exists
        System.out.println(employees.containsKey(1241));

        // Returns boolean if value exists
        System.out.println(employees.containsValue("Tim"));

        // Return all keys in map - for each employee id in key set
        for (Integer employeeId : employees.keySet()) {
            System.out.println(employeeId);
        }

        // Return all values in map - for each employee id in key set
        for (String employeeName : employees.values()) {
            System.out.println(employeeName);
        }

    }
}