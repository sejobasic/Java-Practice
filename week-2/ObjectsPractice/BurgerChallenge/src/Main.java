public class Main {
    public static void main(String[] args) {

//        Item fries = new Item("fries", "side", 2.00);
//        fries.printItem();
//
//        Burger burger = new Burger("regular", 4.00);
//        burger.addToppings("avocado", "mayo", "ketchup");
//        burger.printItem();
//
//        MealOrder regularMeal = new MealOrder();
//        regularMeal.addBurgerToppings("BACON", "MUSHROOM", "CRISPY ONION");
//        regularMeal.setDrinkSize("LARGE");
//        regularMeal.printItemizedList();

        MealOrder secondMeal = new MealOrder("turkey", "7-up", "chili");
        secondMeal.addBurgerToppings("LETTUCE", "MUSHROOM", "KETCHUP");
        secondMeal.setDrinkSize("SMALL");
        secondMeal.printItemizedList();
    }
}