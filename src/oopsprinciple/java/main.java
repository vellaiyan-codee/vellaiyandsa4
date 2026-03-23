package oopsprinciple.java;

public class main {
    public static void main(String[] args) {
        inheritance inheritance=new inheritance(4);

        System.out.println(inheritance.l+" "+inheritance.w+" "+inheritance.h);

        // it can access this type only
        inheritance inheritance1= new inheritweight(2,3,4,5);
        System.out.println(inheritance.h);

        //notes:
        //there are many variables in both parent and child classes
        // you are given access to variable that are in ref type i.e inheritwei
        //hence you should have access to weight variable

    }
}
