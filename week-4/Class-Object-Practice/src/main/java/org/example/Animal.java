package org.example;

public class Animal {

    private String name;
    private String color;
    private int age;

    private final int numOfLegs;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.numOfLegs = 4;
    }

    public void eat() {
        System.out.println("Nom Nom Nom");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", numOfLegs=" + numOfLegs +
                '}';
    }
}
