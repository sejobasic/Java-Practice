public class Main {
    public static void main(String[] args) {

        Car car = new Car("Black 2020 Honda Civic");
        runRace(car);

        Car ferrari = new GasPowered("Blue 2022 Ferrari GTS", 15.4, 6);
        runRace(ferrari);

        Car tesla = new ElectricPowered("2022 Red Tesla Model 3", 568, 75);
        runRace(tesla);

        Car ferrariHybrid = new HybridPowered("2022 Black Ferrari SF90", 400, 8, 40);
        runRace(ferrariHybrid);

    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}