package oops4;

public class Objectclass  {
    int  num;
    float gpa;
    public Objectclass(int num,float gpa){
        this.num=num;
        this.gpa=gpa;
    }
    // it is in detailed about in hashmap lecture
    public int hashcode(){
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj){
        return this.num==((Objectclass)obj).num;
    }

    @Override
    protected Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
    @Override
    public String toString(){
        return super.toString();
    }

    public static void main(String[] args) {
        Objectclass obj1=new Objectclass(34,35.5f);

        int n=obj1.num;
        System.out.println(obj1 instanceof Objectclass);
        System.out.println(obj1.getClass().getName());

//        Objectclass obj2=new Objectclass(5,90.5f);
//
//        //System.out.println(obj.hashcode());
////
//        if (obj1.equals(obj2)){
//            System.out.println("obj 1 is equal to obj2");
        }
        }




