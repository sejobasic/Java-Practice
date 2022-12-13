import java.util.Arrays;

public class Car {
    private String make;
    private int price;
    private int year;
    private String color;
    private String[] parts;


    public Car(String make, int price, int year, String color, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public Car(Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(source.parts, source.parts.length);
    }

    public String getMake() {
        return make;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String[] getParts() {
        return Arrays.copyOf(parts, parts.length);
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setParts(String[] parts) {
        this.parts = Arrays.copyOf(parts, parts.length);
    }

    public void drive() {
        System.out.println("\nYou bought the beautiful " + this.color + " " + this.make);
        System.out.println("Please drive your car to the nearest exit.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", parts=" + Arrays.toString(parts) +
                '}';
    }
}
