// Composition is creating objects within objects
// The Personal Computer class IS A child class relationship of Product
// The Personal Computer clas HAS A relationship with Monitor, Motherboard and ComputerCase classes
// The personal computer will consist of those three other classes

// We need to create our computer case object first
// Then Monitor object
// Then MotherBoard
// Then personal computer which is made up of those 3 subclasses


public class Main {
    public static void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "Dell", "240W");

        Monitor theMonitor = new Monitor("27in Beast", "Acer",
                27, "2540 x 1440");

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus",
                4, 6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("2208", "Dell",
                theCase, theMonitor, theMotherboard);

//        thePC.getMonitor().drawPixelAt(10, 10, "red");
//        thePC.getMotherboard().loadProgram("Windows OS");
//        thePC.getComputerCase().pressPowerBtn();

        thePC.powerUp();

    }
}