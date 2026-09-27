package lab0;

public class Test2 {
    public static void main(String[] args) {
        int[]num={15, 8, -3, 42, 19, 4};
        int max = num[0];
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]+" ");
            if(num[i]>max){
                max = num[i];
            }
            if(num[i]<min){
                min = num[i];
            }
        }
        System.out.println("max = "+max);
        System.out.println("min = "+min);
    }
}
