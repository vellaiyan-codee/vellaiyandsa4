package oops6;

public class human implements Cloneable{
    int age;
    String name;
    int[]arr;

    public human(int age,String name){
        this.name=name;
        this.age=age;
        this.arr=new int[]{10,29,44,5};
    }
//     public Object clone() throws CloneNotSupportedException{
//        // this is called as shallow copy
//        return super.clone();
//     }
     public Object clone()throws CloneNotSupportedException{
        human twin=(human) super.clone();

        // make adeep copy
         twin.arr=new int[twin.arr.length];
         for (int i = 0; i <twin.arr.length ; i++) {
             twin.arr[i]=this.arr[i];
             
         }
         return twin;
     }
}
