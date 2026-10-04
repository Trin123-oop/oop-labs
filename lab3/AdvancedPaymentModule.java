package lab3;

public class AdvancedPaymentModule extends PaymentModule {

    public void payment(Employee[] employees) {
        if (employees != null) {
            for (Employee emp : employees) {
                if (emp != null) {
                    super.payment(emp); 
                }
            }
        }
    }
}
