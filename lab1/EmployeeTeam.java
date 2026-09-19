package lab1;

public class EmployeeTeam {
    private Employee boss;
    private Employee employee;

    public EmployeeTeam(Employee boss, Employee employee) {
        this.boss = boss;
        this.employee = employee;
    }

    public Employee getBoss() {
        return boss;
    }

    public void setBoss(Employee boss) {
        this.boss = boss;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void printEmployeeDetails() {
        if (employee != null) {
            System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName() 
                               + " | Monthly Salary: $" + employee.getMonthlySalary());
        }
    }

    public void printAllEmployeesDetails() {
        System.out.println("--- Team Details ---");
        if (boss != null) {
            System.out.println("Boss: " + boss.getFirstName() + " " + boss.getLastName() 
                               + " | Monthly Salary: $" + boss.getMonthlySalary());
        }
        if (employee != null) {
            System.out.println("Employee: " + employee.getFirstName() + " " + employee.getLastName() 
                               + " | Monthly Salary: $" + employee.getMonthlySalary());
        }
    }

    public void updateSalaryOfEmployee(String firstname, double newSalary) {
        if (newSalary <= 0) {
            System.out.println("Update failed: New salary must be greater than 0.");
            return;
        }

        boolean updated = false;

        if (boss != null && boss.getFirstName().equalsIgnoreCase(firstname)) {
            boss.setMonthlySalary(newSalary);
            updated = true;
        }

        if (employee != null && employee.getFirstName().equalsIgnoreCase(firstname)) {
            employee.setMonthlySalary(newSalary);
            updated = true;
        }

        if (!updated) {
            System.out.println("No employee found with first name: " + firstname);
        }
    }

    public void giveRaiseToAllEmployees() {
        if (boss != null) {
            boss.giveRaise(10);
        }
        if (employee != null) {
            employee.giveRaise(10);
        }
    }
}
