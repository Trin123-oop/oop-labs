package lab1;

public class EmployeeTest {
    public static void main(String[] args) {
        System.out.println("--- Part 1: Testing Attributes & Validation ---");
        Employee emp1 = new Employee("Somchai", "Jaidee");
        System.out.println("Initial Name: " + emp1.getFirstName() + " " + emp1.getLastName());
        System.out.println("Default Monthly Salary: $" + emp1.getMonthlySalary());

        emp1.setFirstName("Somsak");
        emp1.setLastName("Rakdee");
        emp1.setMonthlySalary(3000.0);
        System.out.println("Updated Name: " + emp1.getFirstName() + " " + emp1.getLastName());
        System.out.println("Updated Monthly Salary: $" + emp1.getMonthlySalary());

        emp1.setMonthlySalary(-500.0);
        System.out.println("Salary after setting -500: $" + emp1.getMonthlySalary());
        emp1.setMonthlySalary(0.0);
        System.out.println("Salary after setting 0: $" + emp1.getMonthlySalary());


        System.out.println("\n--- Part 2 & 3: Yearly Salary & 10% Raise ---");
        
        Employee e1 = new Employee("John", "Doe", 2500.0);
        Employee e2 = new Employee("Jane", "Smith", 4000.0);

        
        System.out.println(e1.getFirstName() + " " + e1.getLastName() + "'s Yearly Salary: $" + e1.getYearlySalary());
        System.out.println(e2.getFirstName() + " " + e2.getLastName() + "'s Yearly Salary: $" + e2.getYearlySalary());

        e1.giveRaise(10);
        e2.giveRaise(10);

        System.out.println("\nAfter 10% Raise:");
        System.out.println(e1.getFirstName() + " " + e1.getLastName() + "'s Yearly Salary: $" + e1.getYearlySalary());
        System.out.println(e2.getFirstName() + " " + e2.getLastName() + "'s Yearly Salary: $" + e2.getYearlySalary());
    }
}
