package lab1;

public class Test {
    public int speed;
    public String color;
    public double weight;
    public Test(String c ){
        color = c;
        speed = 0;
        weight = 100.0d;
    }
    public Test(String c, int s){
        color = c;
        speed = s;
        weight = 1000.0d;
    }
}
