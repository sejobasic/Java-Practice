package org.example;

public class Horse extends Animal {

    private int shoeSize;

    public Horse(String name, String color, int age, int shoeSize) {
        super(name, color, age);
        this.shoeSize = shoeSize;
    }

    public void neigh() {
        System.out.println("Neigh");
    }

    @Override
    public void eat() {
        System.out.println("Chomp Chomp Chomp");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "shoeSize=" + shoeSize +
                "} " + super.toString();
    }
}
