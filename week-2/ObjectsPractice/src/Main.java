public class Main {
    public static void main(String[] args) {
        Person mark = new Person("mark", "bosnian", "12/09/93", 29);

        System.out.println("Name: " + mark.getName() + "\n" + "Nationality: " + mark.getNationality() + "\n" + "Date of Birth: " + mark.getDateOfBirth() + "\n" + "Seat Number: " + mark.getSeatNumber() + "\n");
    }
}