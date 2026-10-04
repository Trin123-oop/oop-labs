package lab3;

public class ClubManagingSystemTest {

    public static void main(String[] args) {

        Club[] clubs = {
            new Club("Student", 200, 10),
            new SportsClub("Football", 40, 22),
            new EsportsClub("RoV", 5, 1),
            new MarketingClub("Advertising", 10, 2, 100)
        };

        ClubManagingSystem system = new ClubManagingSystem(clubs);

        System.out.println("Highest member club: "
                + system.getHighestMemberClub().getClubName());

        System.out.println("Total budget: "
                + system.determineAllBudget());

        System.out.println("Total members: "
                + system.getAllMembers());
    }
}
