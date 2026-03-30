package oopps5;

public class a {
    // nested interface
    public interface NestedInterface{
        boolean isOdd(int num);
    }
}
class b implements a.NestedInterface{
    @Override
    public boolean isOdd(int num){
        return (num & 1)==1;
    }
}
