public class Main {
    public static void main(String[] args) {

        Cat tabby = new Cat("lola", "silver", "sand");
        Horse stallion = new Horse("tim", "black", 50);

        tabby.eat();
        stallion.eat();

        Dog lab = new Dog(20, 10, "bucky");
        lab.makeNoise();
    }
}