package lab0;

public class III {
    public static void main(String[]args){
        String name[]={"PETER", "BRAD", "SIMON", "JOHN", "ALAN"};
        int sum=0,num,i;
        for ( i = 0; i < name.length;i++) {
            num = name[i].length();
            sum = sum+num;
         }
        System.out.println("There are "+sum+" characters");
    }
}
