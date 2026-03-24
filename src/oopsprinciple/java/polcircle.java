package oopsprinciple.java;

public class polcircle extends polyshapes{

    // this will run when an object of circle is created
    // hence it is override in parent method
    @Override// this is called as an annotation
    void area(){
        System.out.println(" area is pi*r*r");
    }
}
  