import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to spotify music service");
        System.out.println("To sign up please provide your name and phone number\n");

        System.out.print("Name: ");
        String userName = scan.nextLine();

        System.out.print("\nPhone Number: ");
        String userNumber = scan.nextLine();

        System.out.println("\nName: " + userName);
        System.out.println("Phone Number: " + userNumber);
        System.out.print("Is this information correct? - (yes) or (no): ");
        String validation = scan.nextLine();

        do {
            if (validation.equals("no")) {
                System.out.println("Please enter the correct information\n");

                System.out.print("Name: ");
                userName = scan.nextLine();

                System.out.print("\nPhone Number: ");
                userNumber = scan.nextLine();
            }
            validation = scan.nextLine();
        } while  (!validation.equals("yes"));

        System.out.println("Thank you for confirming");

        Customer customer1 = new Customer(userName, userNumber);
        MusicService signupCustomer1 = new MusicService(customer1);

        System.out.println("\nWhat type of service would you like?");
        System.out.print("Gold or Platinum: ");
        String serviceType = scan.nextLine();

        System.out.println("\nFor how many months?");
        System.out.print("6 or 12: ");
        int months = scan.nextInt();

        signupCustomer1.setService(serviceType);
        signupCustomer1.setMonths(months);
        signupCustomer1.printConfirmation();

        File file = new File("./orders/");

        File[] files = file.listFiles();

        FileOutputStream fileOutputStream = new FileOutputStream(file + "/order" + (files.length + 1) + ".txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(signupCustomer1);
    }
}