package oopsprinciple.java;

public class inheritweight extends inheritance{
    double weight;

    public inheritweight(){
        this.weight=-1;
    }
    public inheritweight(double l,double w,double h ,double weight){
        super(l,h,w);//this super is called as called an parent class constructor
        // an box class was initilize it
        this.weight=weight;
    }
}
