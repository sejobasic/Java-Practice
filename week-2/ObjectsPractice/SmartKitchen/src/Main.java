public class Main {
    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishWasher().setHasWorkToDo(true);
//        kitchen.getFridge().setHasWorkToDo(true);
//        kitchen.getCoffeeMaker().setHasWorkToDo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getFridge().orderFood();
//        kitchen.getCoffeeMaker().brewCoffee();

        kitchen.setKitchenState(true, false, false);
        kitchen.doKitchenWork();

        kitchen.setKitchenState(false, false, false);
        kitchen.doKitchenWork();
    }
}