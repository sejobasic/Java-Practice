import java.io.Serial;
import java.io.Serializable;

public class MusicService implements Serializable {

    @Serial
    private static final long serialVersionUID = 9018832639449206350L;
    private Customer customer;
    private String service;
    private int months;

    public MusicService() {

    }

    public MusicService(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setService(String service) {
        if (service.equals("Gold") || service.equals("Platinum")) {
            this.service = service;
        }
    }

    public void setMonths(int months) {
        if (months == 6 || months == 12) {
            this.months = months;
        }
    }
    public String getService() {
        return service;
    }

    public int getMonths() {
        return months;
    }

    public void printConfirmation() {
        System.out.println("\nThank you " + customer.getName() + "!");
        System.out.println("You have chosen the " + service + " service.");
        System.out.println("For the duration of " + months + " months.");
    }

    public void printOrder() {
        System.out.println("Name: " + customer.getName());
        System.out.println("Phone Number: " + customer.getPhoneNumber());
        System.out.println("Service Type: " + service);
        System.out.println("Duration: " + months);
    }
}
