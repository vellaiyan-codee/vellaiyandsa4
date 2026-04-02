package oops6;

import java.util.Arrays;

public class A {
    public static void main(String[] args)throws CloneNotSupportedException {
        human praveen=new human(19,"praveen");
//        human twin=new human(praveen);
       human twin=(human) praveen.clone();
        System.out.println(twin.age);
        System.out.println(twin.name);

        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0]=100;
        System.out.println(Arrays.toString(praveen.arr));
        System.out.println(Arrays.toString(twin.arr));

    }
}
