public class Main {
    public static void main(String[] args) {

        Bank customer1 = new Bank(12345, 200.00, "Frank Galahger", "frank21@gmail.com", "602-686-3243");

        customer1.depositFunds(200.00);
        customer1.withdrawFunds(300.00);

        for (int i = 1; i <= 5; i++) {
            Student s = new Student("S3456" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Harry";
                        case 5 -> "Lisa";
                        default -> "Anon";
                    }, "02/05/1999", "Java Masterclass");
            System.out.println(s);
        }

    }
}