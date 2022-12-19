public class Main {
    public static void main(String[] args) {

        printInt("8");

        try {
            printInt("hello");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Caught an exception");
        }
        System.out.println("end of program");

    }
    private static void printInt(String numberString) {
        int myInt = Integer.parseInt(numberString);
        System.out.println(myInt);

//        try {
//            int myInt = Integer.parseInt(numberString);
//            System.out.println(myInt);
//        }
//        catch (Exception e) {
//            System.out.println("Caught an exception");
//        }
    }
}