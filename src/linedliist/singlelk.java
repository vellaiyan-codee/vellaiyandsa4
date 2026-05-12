package linedliist;

public class singlelk {

    private node head;
    private node tail;

    private int size;
    public singlelk(){
        this.size=0;
    }
// Insert an value of an element in an node
    public void insertfirst(int val){
        node node=new node(val);
        node.next=head;
        head=node;

        if (tail==null){
            tail=head;
        }
        size+=1;


    }

    // insert the element at the last index
    public  void insertlast(int val){
       if (tail==null){
           insertfirst(val);
           return;
       }
        node node=new node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    // Insert an value in an particular index
    public void insert(int val,int index){
         if (index==0){
             insertfirst(val);
             return;
         }
         if (index==size){
             insertlast(val);
             return;
         }
         node temp=head;
        for (int i = 0; i <index ; i++) {
            temp=temp.next;
        }
        node node=new node(val,temp.next);
        temp.next=node;
        size++;
    }

    // delete an node
    public int deletefirst(){
        int value= head.value;
        head=head.next;
        if (head==null){
            tail=null;
        }
        size--;
        return value;

    }
    // Display an node
    public void display(){
        node temp=head;
        while (temp!=null){
            System.out.println(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }

    // delete an lastelement
    public int deletelast(){
        if (size<=1){
            return deletefirst();
        }
        node secoundlast=get(size-2);
        int value=tail.value;
        tail=secoundlast;
        tail.next=null;
        return value;
    }
    //geting an index value
    public node get(int index){
        node  node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;

        }
        return node;
    }


    private class node{
        private int value;
        private node next;


        private node(int value){
            this.value=value;
        }
        public node(int value,node next){
            this.value=value;
            this.next=next;
        }
    }

}
