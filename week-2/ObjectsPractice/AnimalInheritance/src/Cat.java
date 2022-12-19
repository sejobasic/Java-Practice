public class Cat extends Animal {
    private String litterPref;

    public Cat(String name, String color, String litterPref) {
        super(name, color);
        this.litterPref = litterPref;
    }

    public void meow() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("Lick Lick Lick");
    }
}
