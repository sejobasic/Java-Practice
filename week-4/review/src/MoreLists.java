import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {
        String[] items = {"Apples", "Oranges", "Milk"};


        List<String> list = List.of(items);
        System.out.println(list);


        // New immutable array list populated with the elements of the original list
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Onions");

        ArrayList<String> arrayList = new ArrayList<>(List.of("Ice Cream", "Bananas", "Chocolates"));
        System.out.println(arrayList);

        System.out.println(groceries);

        System.out.println("Third item = " + groceries.get(2));

        if (groceries.contains("Milk")) {
            System.out.println("Milk is present in this list");
        } else {
            System.out.println("Milk is not on the list");
        }

        System.out.println(groceries.indexOf("Milk"));

        groceries.remove("Milk");
        System.out.println(groceries);

        groceries.add("Soda");
        // Compare each element and sort in alphabetical order
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        // Compare each element and sort in reverse order
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        String[] groceryArray = groceries.toArray(new String[groceries.size()]);

    }
}
