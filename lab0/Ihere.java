package lab0;
import java.util.*;
public class Ihere {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = {15, 8, 42, 23, 4, 99, 16};
        int max = numbers[0]; 
        int min = numbers[0];
         System.out.println("สมาชิกใน array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]+" ");
            if(numbers[i]>max){
                max = numbers[i];
            }
            if(numbers[i]<min){
                min = numbers[i];
            }
        }
        System.out.println("ค่าที่มากทึ่สุด (max) = "+max);
        System.out.println("ค่าที่มากที่สุด (min) = "+min);
        scan.close();
    }
}
 