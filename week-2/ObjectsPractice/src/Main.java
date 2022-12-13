public class Main {
    public static void main(String[] args) {
        Person mark = new Person("mark", "bosnian", "12/09/93", 29);

        System.out.println("Name: " + mark.name + "\n" + "Nationality: " + mark.nationality + "\n" + "Date of Birth: " + mark.dateOfBirth + "\n" + "Seat Number: " + mark.seatNumber + "\n");
    }
}