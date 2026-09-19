package lab1;

public class EmployeeTeamTest {
    public static void main(String[] args) {

        Employee bossObj = new Employee("Somchai", "Jaidee", 8000.0);
        Employee empObj = new Employee("Somsak", "Rakdee", 3000.0);

        EmployeeTeam team = new EmployeeTeam(bossObj, empObj);

        System.out.println("=== Testing Method 1: printEmployeeDetails ===");
        team.printEmployeeDetails();

        System.out.println("\n=== Testing Method 2: printAllEmployeesDetails ===");
        team.printAllEmployeesDetails();

        System.out.println("\n=== Testing Method 3: updateSalaryOfEmployee ===");
        System.out.println("Updating Somsak's salary to 3500.0:");
        team.updateSalaryOfEmployee("Somsak", 3500.0);
        team.printAllEmployeesDetails();

        System.out.println("\nAttempting update with non-positive salary (-500.0):");
        team.updateSalaryOfEmployee("Somsak", -500.0);

        System.out.println("\n=== Testing Method 4: giveRaiseToAllEmployees (10% Raise) ===");
        team.giveRaiseToAllEmployees();
        team.printAllEmployeesDetails();
    }
}
