package org.example.interfaces;

public class Dog implements MakesNoise, CanRun {

    private String name;
    private String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void makeNoise() {
        System.out.println("Woof! Woof!");
    }
}
