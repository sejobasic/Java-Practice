public class Machine {

    private Item[][] items;

    // Set field equal to a new 2D array
    public Machine(Item[][] items) {
        this.items = new Item[items.length][items[0].length];

        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                this.items[i][j] = new Item(items[i][j]);
            }
        }
    }

    // Return a new item copy of the object at the request spot inside the row that is passed in
    public Item getItems(int row, int spot) {
        return new Item(this.items[row][spot]);
    }

    public void setItems(Item item, int row, int spot) {
        this.items[row][spot] = new Item(item);
    }

    public boolean dispense(int row, int spot) {
        int quantity = this.items[row][spot].getQuantity();
        if (quantity > 0) {
            this.items[row][spot].setQuantity(quantity - 1);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String temp = "";
        for (int i = 0; i < items.length; i++) {

            for (int j = 0; j < items[i].length; j++) {
               temp += this.items[i][j].toString();
            }
            temp += "\n\n";

        }
        return temp;
    }
}
