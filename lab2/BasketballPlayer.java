package lab2;

public class BasketballPlayer extends Player {

    public BasketballPlayer(String n, int j) {
        super(n, j);
    }

    public void playGame() {
        minutesPlayed = minutesPlayed + 48;
    }

    public void changeJerseyNumber(int newNumber) {
        jerseyNumber = newNumber;
        System.out.println(name + " changes number to " + jerseyNumber);
    }

    // เมธอด main สำหรับรันเทส (ยุบรวมมาจาก PlayerTest)
    public static void main(String[] args) {
        FootballPlayer f = new FootballPlayer("Ronaldo", 7);
        BasketballPlayer b = new BasketballPlayer("James", 23);
        f.print();
        b.print();
        f.playGame();
        b.playGame();
        System.out.println(f.getMinutesPlayed());
        System.out.println(b.getMinutesPlayed());
        b.changeJerseyNumber(6);
    }
}
