package lab3;

public class ClubManagingSystem {

    private Club[] clubList;

    public ClubManagingSystem(Club[] clubList) {
        this.clubList = clubList;
    }

    public double determineAllBudget() {
        double total = 0;

        for (Club club : clubList) {
            total += club.getBudget();
        }

        return total;
    }

    public int getAllMembers() {
        int total = 0;

        for (Club club : clubList) {
            total += club.getNumMember();
        }

        return total;
    }

    public Club getHighestMemberClub() {
        Club highest = clubList[0];

        for (Club club : clubList) {
            if (club.getNumMember() > highest.getNumMember()) {
                highest = club;
            }
        }

        return highest;
    }
}
