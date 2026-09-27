package lab2;

// SportsClub.java
public class SportsClub extends Club {

    public SportsClub(String c, int m) {
        super(c, m);
    }

    @Override
    public int determineBudget() {
        return (numMember * 1000) + (numMember - minNumMember) * 100;
    }

    @Override
    public void changeName(String newName) {
        // changeName() should not modify clubName
        // ดังนั้นจึงปล่อยว่างไว้ ไม่กำหนดค่าใหม่ให้กับ clubName
    }
}
