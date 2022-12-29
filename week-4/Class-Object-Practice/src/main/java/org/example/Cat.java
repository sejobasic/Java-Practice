package org.example;

public class Cat extends Animal {

    private String litter;

    public Cat(String name, String color, int age, String litter) {
        super(name, color, age);
        this.litter = litter;
    }

    public void meow() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("Lick Lick Lick");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "litter='" + litter + '\'' +
                "} " + super.toString();
    }
}
