package lab2;

// ClubTest.java
public class ClubTest {
    public static void main(String[] args) {
        // ทดสอบ SportsClub
        SportsClub sports = new SportsClub("Football Club", 10);
        sports.addMember(5);
        System.out.println("Sports Club Budget: " + sports.determineBudget());
        sports.changeName("New Football Name"); // เปลี่ยนชื่อแต่ต้องไม่เปลี่ยนตามโจทย์
        System.out.println("Sports Club Name: " + sports.getName());

        // ทดสอบ MarketingClub
        MarketingClub marketing = new MarketingClub("Digital Marketing", 5, 1200);
        System.out.println("Marketing Club Budget (budget > 1000): " + marketing.determineBudget()); // ควรได้ 0
        
        boolean success = marketing.useBudget(500);
        System.out.println("Use budget 500 successful? " + success);
        
        MarketingClub marketing2 = new MarketingClub("Social Media", 5, 800);
        System.out.println("Marketing Club 2 Budget (budget <= 1000): " + marketing2.determineBudget()); // ควรได้ตาม Club (5 * 1000 = 5000)
    }
}
