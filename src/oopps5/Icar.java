package oopps5;

public class Icar implements Iengine,Ibrake {
    @Override
    public void brake(){
        System.out.println(" I brake an normal car");
    }
    @Override
    public void start(){
        System.out.println("I start like an normal car");

    }
    @Override
    public void stop(){
        System.out.println("I stop  like an normal car");

    }
    public void acc(){
        System.out.println("I accelerate an normal car");

    }

}
