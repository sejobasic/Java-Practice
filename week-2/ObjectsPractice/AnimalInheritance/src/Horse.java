public class Horse extends Animal{
    private int shoeSize;

    public Horse(String name, String color, int shoeSize) {
        super(name, color);
        this.shoeSize = shoeSize;
    }

    public void neigh() {
        System.out.println("Neigh!");
    }

    @Override
    public void eat() {
        System.out.println("Chew Chew Chew");
    }
}
