public class LL1 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static void insertAtEnd(Node head,int data){
        Node current = new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;  //reached tail
        }
        temp.next=current;
    }


    public static int lengthLL(Node head){
        int count =0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }

    public static void display(Node head){
        Node temp=head;
        System.out.println();
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

// print except the last one 

    public static void exceptLastOne(Node head) {
        Node temp=head;
        for(int i=1;i<=lengthLL(head);i++){
            if(temp.next==null){
                break;
            }
            else{
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println(lengthLL(a));
        exceptLastOne(a);
        insertAtEnd(a, 6);
        display(a);
    }
}
