package oopsconceptpart1;

public class staticinitilize {
    static int a=10;
    static int b;

    static {
        System.out.println("this is called as static block");
        b= a * 5;
    }

    public static void main(String[] args) {
        staticinitilize obj=new staticinitilize();
        System.out.println(staticinitilize.a+" "+staticinitilize.b);
    }
}
