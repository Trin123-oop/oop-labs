package lab2;

public class PersonTest {
    public static void main(String[] args) {
        Mother m = new Mother();
        m.setFirstName("Alice");
        System.out.println(m.getFirstName()); // Ms.Alice[cite: 5]

        Father f = new Father(m);
        f.setFirstName("Bob");
        System.out.println(f.getFirstName()); // Mr.Bob[cite: 5]

        Person p = new Person();
        p.setFirstName("John");
        System.out.println(p.getFirstName()); // John[cite: 5]
    }
}
