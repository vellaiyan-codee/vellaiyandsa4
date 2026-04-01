package oops6;

public class comparision implements Comparable<comparision>{
    int rollno;
    float marks;

    public comparision(int rollno,float marks){
        this.rollno=rollno;
        this.marks=marks;
    }
    @Override
    public String toString(){
        return marks+" ";
    }

    @Override
    public int compareTo(comparision o){
        System.out.println("in compare method");
        int diff=(int)(this.marks-o.marks);
  // if diff==0 : means both are equal
      // if diff is <1 : means o is bigger else o  is smaller


        return diff;
    }


}
