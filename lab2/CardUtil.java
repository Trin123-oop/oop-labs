package lab2;

public class CardUtil {
    public static final Card.Rank HIGHEST_RANK = Card.Rank.ACE;
    public static final Card.Suite HIGHEST_SUITE = Card.Suite.SPADES;

    public static boolean isHighestCard(Card card) {
        if (card == null) return false;
        return card.getRank() == HIGHEST_RANK && card.getSuit() == HIGHEST_SUITE;
    }

    // เอา CardUtilTest มายุบรวมไว้ตรงนี้ จะได้ไม่ต้องสร้างไฟล์เทสแยกเพิ่ม
    public static void main(String[] args) {
        Card myCard = new Card(Card.Rank.ACE, Card.Suite.SPADES);
        System.out.println("Card: " + myCard);
        System.out.println("Is highest card? " + isHighestCard(myCard));
    }
}