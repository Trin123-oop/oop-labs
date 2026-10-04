package lab3;

public class PaymentModule {

    private double totalPay;

    public PaymentModule(double totalPay) {
        this.totalPay = totalPay;
    }

    public void payment(Employee employee) {

        double pay = employee.computePay();

        if (employee instanceof Manager) {
            Manager manager = (Manager) employee;

            if (manager.getWorkYear() > 10) {
                pay = pay * 2;
            }
        }

        totalPay += pay;
    }

    public double getTotalPay() {
        return totalPay;
    }
}