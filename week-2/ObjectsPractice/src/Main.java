import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person mark = new Person("mark", "bosnian", "12/09/93", new String[] {"Expires: 2030", "International"},35);

        mark.setName("Mark Johnson");
        mark.setPassport(new String[]{"Expires 2020", "Domestic"});
        mark.chooseSeat();

        System.out.println("Name: " + mark.getName() + "\nNationality: " + mark.getNationality() + "\nDate Of Birth: " + mark.getDateOfBirth() + "\nPassport: " + Arrays.toString(mark.getPassport()));

        if (mark.applyPassport()) {
            System.out.println("Congratulations " + mark.getName() + ". Your passport was approved! Your seat number is " + mark.getSeatNumber());
        } else {
            System.out.println("We are sorry " + mark.getName() + ". We cannot process your application.");
        }



    }
}