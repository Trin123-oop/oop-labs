package lab0;

public class Test3 {
    public static void main(String[] args) {
        int[][]num= {{3,8,1},{4,9,6},{7,2,5}};
        int evencount = 0;
        for (int i = 0; i < num.length; i++) {
            for(int j =0; j<num[i].length;j++){
                 int currentnum = num[i][j];
                 if(currentnum%2==0){
                    evencount++;
                    System.out.println("พบเลขคู่ " + currentnum + " ที่พิกัด แถวที่ " + i + ", หลักที่ " + j);
                 }
            }
        }
       System.out.println("--------------------------------");
        System.out.println("สรุป: พบเลขคู่ทั้งหมด " + evencount + " ตัวในตารางนี้");
    }
}
