class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class PracticeOne {
    public static void main(String[] args) {
        Node a = new Node(4)
        Node b = new Node(6)
        Node c = new Node(7)
        Node d = new Node(8)
        a.next=b;
        Node head = a;
    }
    
}
