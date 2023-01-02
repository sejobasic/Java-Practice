import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArrayListChallenge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> itemsList = new ArrayList<>();

        System.out.println("Please add items to your list");

        label:
        while(true) {
            System.out.println("Type: 0 to shutdown, 1 to add items, 2 to remove items");
            System.out.print("Input: ");
            String userInput = scan.nextLine();

            switch (userInput) {
                case "0":
                    break label;
                case "1": {
                    System.out.print("\nEnter item names separated by commas: ");
                    String[] items = scan.nextLine().split(",");
                    itemsList.addAll(List.of(items));
                    System.out.println(Arrays.toString(items) + " added to the list!");
                    continue;
                }
                case "2": {
                    System.out.print("\nEnter item name to remove: ");
                    String item = scan.nextLine();
                    if (itemsList.contains(item)) {
                        itemsList.remove(item);
                        System.out.println(item + " removed from the list!");
                    }
                    System.out.println("Item does not exist in your list");
                }
            }
        }

        System.out.println(itemsList);
    }
}
