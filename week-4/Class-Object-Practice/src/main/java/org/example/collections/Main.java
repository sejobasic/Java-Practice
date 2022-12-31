package org.example.collections;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        String [] cars = {"Toyota", "Honda", "Subaru"};
        List<String> names = new ArrayList<>();

        names.add("Sejo");
        names.add("Sofia");
        names.add("George");
        names.add(1, "Larry");

        String[] namesArray = names.toArray(new String[0]);

        // Returns a fixed size list
        List<String> carsList = Arrays.asList(cars);
        System.out.println(carsList);

        names.remove(1);

        names.set(0, "Bob");

        System.out.println(names.contains("Sofia"));
        System.out.println(names.isEmpty());

        // Sort elements in Alphabetical or Numerical order
        Collections.sort(names);

        // Randomize elements in array
        Collections.shuffle(names);

        // Reverse order of elements in array
        Collections.reverse(names);

        System.out.println(names);
        System.out.println(names.get(2));

        names.clear();
        System.out.println(names);


        // SETS and HASHSETS - No specific order - No duplicate values

        Set<String> namesSet = new HashSet<>();

        namesSet.add("Joe");
        namesSet.add("Sejo");
        namesSet.add("Mike");

        System.out.println(namesSet);



        // MAPS - HASHMAPS - KEY VALUE PAIRS - ALL KEYS UNIQUE
        Map<Integer, String> employees = new HashMap<>();

        employees.put(1, "Sejo");
        employees.put(2, "Mike");
        employees.put(3, "John");

        employees.replace(2, "Jack");

        employees.remove(2);

        for (Integer employeeId : employees.keySet()) {
            System.out.println(employeeId);
        }

        for (String employeeName : employees.values()) {
            System.out.println(employeeName);
        }

        // Return value at key
        System.out.println(employees.get(1));

        // return Boolean
        System.out.println(employees.containsValue("Sejo"));

        System.out.println(employees);

    }
}
