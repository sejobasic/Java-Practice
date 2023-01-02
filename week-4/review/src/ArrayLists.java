import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        Object[] groceryArray = new Object[3];

        groceryArray[0] = new GroceryItem("Dairy", "Milk", 1);
        groceryArray[1] = new GroceryItem("Produce", "Apple", 3);
        groceryArray[2] = new GroceryItem("Meat", "Ground Beef", 1);

//        System.out.println(Arrays.toString(groceryArray));

        ArrayList<GroceryItem> objectList = new ArrayList<>();
        objectList.add(new GroceryItem("Dairy", "Milk", 1));
        objectList.add(new GroceryItem("Produce", "Apple", 3));
        objectList.add( 0, new GroceryItem("Meat", "Ground Beef", 1));
        objectList.remove(0);

        System.out.println(objectList);
    }
}
