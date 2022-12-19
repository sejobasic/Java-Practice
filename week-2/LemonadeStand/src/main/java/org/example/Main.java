package org.example;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Will", "999-999-9999");
        Customer customer2 = new Customer("Frank", "333-333-3333");

        Order order1 = new Order(customer1);
        order1.addLemonade(new Lemonade(1.2, 2.2, 2.2, 5));
        order1.addLemonade(new Lemonade(1.8, 5.5, 2.7, 2));
        order1.addLemonade(new Lemonade(1.9, 2.8, 2.2, 2));

//        System.out.println(order1.getTotal());

        Order order2 = new Order(customer2);
        order2.addLemonade(new Lemonade(5.5, 2.2, 2.2, 2));
        order2.addLemonade(new Lemonade(1.1, 3.3, 2.7, 2));
        order2.addLemonade(new Lemonade(1.1, 2.8, 2.2, 2));

//        System.out.println(order2.getTotal());

        Box b1 = new Box(order1);

        System.out.println(b1.getObj());
    }
}