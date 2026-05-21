package linedliist;


public class doublylLL {

   private node head;

    public void insertf(int val){
        node node=new node(val);
        node.next=head;
        node.prev=null;
        if (head!=null) {
            head.prev = node;
        }
        head=node;
    }

    public void display(){
        node node=head;
        node last=null;
        while (node!=null){
            System.out.println(node.val+"->");
            last=node;
            node=node.next;
        }
        System.out.println("END");

        System.out.println("print in  reverse");
        while (last!=null){
            System.out.println(last.val+"->");
            last=last.prev;
        }
        System.out.println();
    }

    public void insertlast(int val){
        node node=new node(val);
        node last=head;

         node.next=null;
        if (head==null){
            node.prev=null;
            head=node;
            return;
        }

        while (last.next!=null){
           last=last.next;
        }
        last.next=node;
         node.prev=last;
    }
    // insert beetween the value
    public void insert(int after,int val){
        node p=find(after);
        if (p==null){
            System.out.println("does not exist");
            return;
        }
        node node =new node(val);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if (node.next!=null) {
            node.next.prev = node;
        }
    }

    private class node{
            int val;
            node next;
            node prev;

            public node(int val){
                this.val=val;
            }
            public node(int val,node next,node prev){
                this.val=val;
                this.next=next;
                this.prev=prev;
            }
        }
    }

