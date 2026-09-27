package lab0;
import java.util.*;
public class Last {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String name;
    int length;
    char result1,result2;
    System.out.print("Enter name: ");
    name = scan.nextLine();
    length = name.length();
    System.out.println("name = "+name);
    System.out.println("length = "+length);
    result1 = name.charAt(0);
    result2 = name.charAt(length-1);
    System.out.println("first letter: "+result1);
    System.out.println("last letter: "+result2);
    }
}
