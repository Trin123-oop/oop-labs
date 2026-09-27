package lab0;
import java.util.*;
public class Tuan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max=0,i,x;
        for ( i = 1; i <= 5; i++) {
            System.out.print("Round "+i+": Enter x: ");
            x = scan.nextInt();
            if(x>max){
                max = x;
            }

        }
        scan.close();
        System.out.println("max value = "+ max);
    }
}
