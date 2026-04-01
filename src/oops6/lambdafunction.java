package oops6;

import java.util.ArrayList;
import java.util.function.Consumer;

public class lambdafunction {
    public static void main(String[] args) {
       ArrayList<Integer>arr=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i+1);

        }
//       arr.forEach((item)->{System.out.println(item*2);}
        //  consumer type

        Consumer<Integer> fun=(item)-> System.out.println(item*2);
        arr.forEach(fun);

        operation sum=(a,b)->a+b;
        operation sub=(a,b)->a-b;

        lambdafunction mycalc=new lambdafunction();
        System.out.println(mycalc.operation(5,7,sum));
}
    private int operation(int a,int b,operation op){
        return op.operaton(a,b);
    }
}
interface operation{
    int operaton(int a,int b);

}
