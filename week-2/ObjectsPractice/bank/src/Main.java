public class Main {
    public static void main(String[] args) {

        Bank customer1 = new Bank(12345, 200.00, "Frank Galahger", "frank21@gmail.com", "602-686-3243");

        customer1.depositFunds(200.00);
        customer1.withdrawFunds(300.00);

    }
}