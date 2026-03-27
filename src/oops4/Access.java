package oops4;

public class Access {
    private int num;
    String name;
    int[]arr;

    // geters method: getting an numbers
    public int getNum(){
        return num;
    }

    // seters method: setting an numbers
    public void setNum(int num){
        this.num=num;
    }

    public Access(int num,String name){
        this.name=name;
        this.num=num;
        this.arr=new int[num];
    }
}
