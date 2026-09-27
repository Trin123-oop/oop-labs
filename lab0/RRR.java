package lab0;

public class RRR {
    public static void main(String[] args) {
        int[][]num = {{5,12,8},
                        {3,10,7},
                        {6,14,9}};
        int count=0;
        int sum=0;
        double ave=0;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                int currentnum = num[i][j];
                if(currentnum%2==0){
                    sum+=currentnum;
                    count++;
                }
            }
        }
        if(count>0){
            ave = (double) sum/count;
        }
        System.out.println("--- สถิติเฉพาะเลขคู่ในตาราง 2D ---");
        System.out.println("ผลรวมเลขคู่ (sum) = " + sum);
        System.out.println("จำนวนเลขคู่ที่พบ (count) = " + count);
        System.out.println("ค่าเฉลี่ยเลขคู่ (ave) = " + ave);
    }
}
