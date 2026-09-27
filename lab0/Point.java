package lab0;

public class Point {
    public static void main(String []args){
        int[][] scores = {
    {80, 75, 90}, // นักเรียนคนที่ 0
    {60, 65, 70}, // นักเรียนคนที่ 1
    {85, 90, 95}  // นักเรียนคนที่ 2
            };
        int allsum=0,count=0,n=0;
        for (int i = 0; i < scores.length; i++) {
            int sum=0;
            for (int j = 0; j < scores[i].length; j++) {
                sum = sum+scores[i][j];
                allsum = allsum+scores[i][j];
                n++;
                if(scores[i][j]>=80){
                    count++;
                }
            }
            System.out.println("นักเรียนคนที่ "+i+" คะแนนรวม: "+sum);
           double ave = (double) allsum/count;
            System.out.println("----------------------------------------");
            System.out.println("คะแนนเฉลี่ยทั้งห้อง (ave): " + ave);
            System.out.println("คะแนนที่ >= 80 มีทั้งหมด (count): " + count + " ช่อง");
        }
    }
}
