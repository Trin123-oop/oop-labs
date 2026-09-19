package lab1;

public class BookDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Developing Java Software", "Russel Winder", 79.75);
        System.out.println(b1.getTitle());
        System.out.println(b1.getAuthor());
    }
}
