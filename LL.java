public class LL {

    public static class Node{
        int data;
        Node next; /*address of next node */
        Node(int data){  /*Constructor */
            this.data=data;
            this.next=null;  /*input data */
        }
    }
    //
    //
    //Traversing Linked List
    public static void traversing(Node head){
        Node temp=head;
        while(temp!=null){  
            System.out.print(temp.data+" ");
            temp=temp.next;  //shift the temp node to next node
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        a.next =b;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        //
        traversing(a);
    }

}
