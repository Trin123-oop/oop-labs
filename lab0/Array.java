package lab0;

public class Array {
    public static void main(String[] args) {
        int[]num={2,4,3,7,5,6,1};
        int evencount = 0;
        int oddcount = 0;
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
            if(num[i]%2==0){
                evencount++;
            }
            else{
                oddcount++;
            }
        }
        System.out.println("จำนวนเลขคู่: "+evencount);
        System.out.println("จำนวนเลขคี่: "+oddcount);
    }
}
