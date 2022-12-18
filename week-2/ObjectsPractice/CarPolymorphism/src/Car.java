public class Car {
    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {

    }

    protected void runEngine() {

    }

    public void drive() {
        System.out.println("\nCar -> driving, type is " + getClass().getSimpleName());
        runEngine();
    }

}

class GasPowered extends Car{
    private double avgKmPerLitre;
    private int cylinders = 6;

    public GasPowered(String description) {
        super(description);
    }

    public GasPowered(String description, double avgKmPerLitre, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("\nGas -> All %d cylinders are fired up", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLitre);
    }
}

class ElectricPowered extends Car{
    private double avgKmPerCharge;
    private int batterySize = 10;

    public ElectricPowered(String description) {
        super(description);
    }

    public ElectricPowered(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("\nElectric -> All %d batteries are running", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Electric -> usage exceeds the average: %.2f %n", avgKmPerCharge);
    }
}

class HybridPowered extends Car{
    private double avgKmPerLitre;
    private int cylinders = 6;
    private int batterySize = 5;

    public HybridPowered(String description) {
        super(description);
    }

    public HybridPowered(String description, double avgKmPerLitre, int cylinders, int batterySize) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("\nHybrid -> All %d cylinders and %d batteries are running", cylinders, batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage exceeds the average: %.2f %n", avgKmPerLitre);
    }
}

