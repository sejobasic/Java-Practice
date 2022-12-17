public class Bank {
    private int accNum;
    private double accBalance;
    private String name;
    private String email;
    private String phoneNumber;

    public Bank(int accNum, double accBalance, String name, String email, String phoneNumber) {
        this.accNum = accNum;
        this.accBalance = accBalance;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccNum() {
        return accNum;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositAmount) {
        this.accBalance += depositAmount;

        System.out.println("Thank you for your deposit of " + depositAmount + " Your new balance is " + this.accBalance);
    }

    public void withdrawFunds(double withdrawAmount) {
        if (this.accBalance - withdrawAmount < 0) {
            System.out.println("Sorry your account is in negative");
        } else {
            this.accBalance -= withdrawAmount;
            System.out.println("Your current balance after withdraw of " + withdrawAmount + " is " + this.accBalance);
        }

    }
}
