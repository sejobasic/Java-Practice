package org.example;

public class Main {
    public static void main(String[] args) {

        Cat lola = new Cat("Lola", "Silver", 5, "Clumping");
        Dog max = new Dog("Max", "Black", 8, "2 Miles");
        Horse bucky = new Horse("Bucky", "White", 20, 5);

        System.out.println(lola);
        lola.meow();
        lola.eat();

        System.out.println(max);
        max.bark();
        max.eat();

        System.out.println(bucky);
        bucky.neigh();
        bucky.eat();

    }
}