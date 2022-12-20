public class Main {
    public static void main(String[] args) {
        Printer<Integer> intPrinter = new Printer<>(23);
        Printer<Double> doublePrinter = new Printer<>(200.00);
        Printer<String> stringPrinter = new Printer<>("Hello");

        intPrinter.print();
        doublePrinter.print();
        stringPrinter.print();

        shout("John");

    }

    public static <T> void shout(T thingToShout) {
        System.out.println(thingToShout + "!!!!");
    }
}