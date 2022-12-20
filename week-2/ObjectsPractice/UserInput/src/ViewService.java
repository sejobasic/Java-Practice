import java.io.*;
import java.util.Scanner;

public class ViewService {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scan = new Scanner(System.in);

        File file = new File("./orders");



        while (true) {
            System.out.println("\nWhich service order would you like to view?");

            int orderNum = scan.nextInt();

            FileInputStream fileInputStream = new FileInputStream(file + "/order" + orderNum + ".txt");
            ObjectInputStream objectInputStream =  new ObjectInputStream(fileInputStream);

            MusicService signupCustomer1 = (MusicService) objectInputStream.readObject();

            signupCustomer1.printOrder();
        }
    }
}
