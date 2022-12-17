public class Main {
    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "11/11/1985", "01/01/2020");

        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990",
                "05/05/2021", 35000);

        System.out.println(joe);
        System.out.println("Joe's paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's pensions check = $" + joe.collectPay());

        HourlyEmployee marry = new HourlyEmployee("Marry", "05/11/2000",
                "02/05/2018", 22);
        marry.collectPay();
        System.out.println(marry);
        System.out.println("Marry's paycheck = $" + marry.collectPay());
        System.out.println("Marry's paycheck with double pay = $" + marry.getDoublePay());

    }
}