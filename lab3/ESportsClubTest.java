package lab3;

public class ESportsClubTest {

    public static void main(String[] args) {

        // Test ESportsClub
        ESportsClub e = new ESportsClub("Esport", 100);

        System.out.println("Name: " + e.getName());
        System.out.println("Num member: " + e.getNumMember());

        e.advertise();

        System.out.println("Budget: " + e.determineBudget());

        System.out.println("--------------------");

        // Test polymorphism
        Club c = new ESportsClub("Esport", 100);

        System.out.println("Name: " + c.getName());

        c.advertise();

        System.out.println("Budget: " + c.determineBudget());
    }
}
