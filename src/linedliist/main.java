package linedliist;

public class main {
    public static void main(String[] args) {
        singlelk list=new singlelk();
        list.insertfirst(5);
        list.insertfirst(10);
        list.insertfirst(29);
        list.insertfirst(44);

        list.insertlast(99);

        list.insert(100,2);

        list.display();
        System.out.println(list.deletefirst());

        list.display();
        System.out.println(list.deletelast());
        list.display();
    }
}
