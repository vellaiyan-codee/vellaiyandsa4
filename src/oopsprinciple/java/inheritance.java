package oopsprinciple.java;

public class inheritance  {
    double l;
    double  h;
    double w;

    inheritance(){
        this.l=-1;
        this.h=-1;
        this.w=-1;

    }
    // cube
    inheritance(double side){
        super();// object class
        this.l=side;
        this.w=side;
        this.h=side;
    }
    // this is caalled as a copy constructor
    inheritance(inheritance old){
        this.l=old.l;
        this.w=old.w;
        this.h=old.h;
    }
    inheritance(double l,double w,double h){
        this.l=-1;
        this.w=-1;
        this.h=-1;
    }
    public void imformation(){
        System.out.println("this is an inheritance box example");
    }

}

