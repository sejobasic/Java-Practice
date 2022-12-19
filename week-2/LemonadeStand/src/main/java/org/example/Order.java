package org.example;

import java.util.Arrays;

public class Order {
    private Customer customer;
    private Lemonade[] lemonades;

    private double total;

    public Order(Customer customer) {
        this.customer = customer;
        lemonades = new Lemonade[0];
    }

    // For each lemonade in lemonades with type of Lemonade
    private void updateTotal() {
        total = 0.0;
        for (Lemonade lemonade : lemonades) {
            total += lemonade.getPrice();
        }
    }

    public void addLemonade(Lemonade lemonade) {
        Lemonade[] newLemonadeArr = Arrays.copyOf(lemonades, lemonades.length + 1);
        newLemonadeArr[newLemonadeArr.length - 1] = lemonade;
        lemonades = newLemonadeArr;
        updateTotal();
    }

    public Customer getCustomer() {
        return customer;
    }

    public Lemonade[] getLemonades() {
        return lemonades;
    }

    public double getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", lemonades=" + Arrays.toString(lemonades) +
                ", total=" + total +
                '}';
    }
}
