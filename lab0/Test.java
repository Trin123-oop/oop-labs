package lab0;
import java.util.*;;
public class Test{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=-1;
        int secret = 7;

        
        for (int i = 1; i < 5; i++) {
            System.out.println("ทายเลข1-100");
        System.out.print("round "+ i+ " Enter num: ");
        num = scan.nextInt();
        if(num>secret){
            System.out.println(num+" is too much");
        }
        else if(num<secret){
            System.out.println(num+" is to less");
        }
        else{
            System.out.println(num+ " is correct");
            break;
        }
        }
        scan.close();
        if(num==secret){
            System.out.println("you win");
        }else{
            System.out.println("you lose");
        }
    } 
}