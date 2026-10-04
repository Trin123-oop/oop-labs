package lab3;

public class AdvancedPaymentModuleTest {
    public static void main(String[] args) {

        Employee[] employees = new Employee[2];
        employees[0] = new Employee("Alice", 30000);
        employees[1] = new Employee("Bob", 45000);

        AdvancedPaymentModule advancedModule = new AdvancedPaymentModule();

        System.out.println("Starting batch payment for employees...");
        advancedModule.payment(employees);
        System.out.println("Batch payment completed.");
    }
}
