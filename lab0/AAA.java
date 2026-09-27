package lab0;

public class AAA {
    public static void main(String[] args) {
         String name[][]={{"PETER", "BRAD", "SIMON", "JOHN", "ALAN"},
                            {"JIM", "TIM", "ANN", "BABARA", "STEVE"}};
                            int sum=0,num;
         for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name[i].length; j++) {
                num = name[i][j].length();
                sum+=name[i][j].length();
            }
          }
          System.out.println("There are "+sum+" character");
    }
   
}
