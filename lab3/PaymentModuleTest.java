package lab3;

public class PaymentModuleTest {

    public static void main(String[] args) {

        PaymentModule paymentModule = new PaymentModule(0);

        Employee e1 = new Fulltimer("John", 30000);
        Employee e2 = new Manager("Mike", 5000, 5);
        Employee e3 = new Manager("David", 5000, 15);
        Employee e4 = new Hourly("Tom", 100, 20);

        paymentModule.payment(e1);
        paymentModule.payment(e2);
        paymentModule.payment(e3);
        paymentModule.payment(e4);

        System.out.println("Total Pay = " + paymentModule.getTotalPay());
    }
}
