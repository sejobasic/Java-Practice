package org.example;

public class Dog extends Animal {

    String walkDistance;

    public Dog(String name, String color, int age, String walkDistance) {
        super(name, color, age);
        this.walkDistance = walkDistance;
    }

    public void bark() {
        System.out.println("Bark");
    }

    @Override
    public void eat() {
        System.out.println("Chew Chew CHew");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "walkDistance='" + walkDistance + '\'' +
                "} " + super.toString();
    }
}
