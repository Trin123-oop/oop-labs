package lab0;
import java.util.*;
public class Trin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = {10, 25, 42, 25, 8, 90, 25};
        int target = 25;
        int count = 0;
        System.out.println("--- เริ่มค้นหาเลขเป้าหมาย: " + target + " ---");
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==target){
                count++;
                System.out.println("พบเป้าหมายที่ Index ตำแหน่งที่: " + i);
            }
        }
        System.out.println("--------------------------------");
        System.out.println("สรุป: พบเลข " + target + " ทั้งหมด " + count + " ครั้ง");
    }
}
