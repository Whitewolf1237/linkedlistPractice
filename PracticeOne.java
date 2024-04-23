class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class LinkedList{
    Node head;

    int indexOflinkedList(int e){
        Node curr=head;
        int count = 0;
        while(curr!=null){
            if(curr.data!=e){
                count++;
            }
            else if(curr.data==e){
                return count;
            }
            curr=curr.next;
        }
        return -1;
    }

    void printLinkedList(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data + " ");
            curr=curr.next;
        }
    }

    void addElementAtBeg(int data){
        Node temp = new Node(data);
        if(head==null){
            head=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
    }

    void addAtIndex(int index,int data){
        if(head==null){
            addElementAtBeg(data);
        }
        else{
        Node curr=head;

        Node temp = new Node(data);
        for(int i=0;i<index-1;i++){
            curr=curr.next;
        }
        temp.next=curr.next;
        curr.next= temp;
        }
    }

    void removeFromLast(){
        if(head==null){
            return;
        }
        else if(head.next==null){
            head=null;
        }
        else if(head.next != null){
            Node curr = head;
            while(curr.next.next!=null){
                curr=curr.next;
            }
            curr.next=null;
        }
    }

    void addElementAtEnd(int data){
        Node temp = new Node(data);
        if(head==null){
            head=temp;
        } 
        else{
            Node curr = head;
            while(curr.next != null){
                curr=curr.next;
            }
            curr.next=temp;
        }
    }

    void addAllEleFromArray(int[] arr){
        for(int element : arr){
            addElementAtBeg(element);
        }
    }

    void removeFirstElement(){
        if(head==null){
            return;
        }
        else{
            head=head.next;
        }
    }

    void printReverse(Node head){
        if(head==null)return;
        System.out.println(head.data+" ");
        printReverse(head.next);
    }


    void deleteAtIdx(int idx){
        if(idx<0){
            System.out.println("invalid Input");
        }
        else if(idx==0){
            removeFirstElement();
        }
        else{
            Node curr=head;
            for(int i=0;i<idx-1;i++){
                curr=curr.next;
            }
            curr.next=curr.next.next;
        }
    }
}

public class PracticeOne {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addElementAtEnd(10);
        ll.addElementAtEnd(20);
        ll.addElementAtEnd(30);
        ll.addElementAtEnd(40);
        
        ll.printLinkedList();
        System.out.println();
        ll.addElementAtBeg(5);
        ll.printLinkedList();
        System.out.println();
        ll.addAtIndex(3, 25);
        
        ll.printLinkedList();
        System.out.println();
        ll.removeFromLast();
        ll.printLinkedList();

        System.out.println();
        int[] arr= {1,2,3,4};
        ll.addAllEleFromArray(arr);
        ll.printLinkedList();
        System.out.println();
        System.out.println(ll.indexOflinkedList(25));
        ll.removeFirstElement();
        System.out.println();
        ll.printLinkedList();
        ll.deleteAtIdx(4);
        System.out.println();
        ll.printLinkedList();
        System.out.println();
        ll.printReverse(head);
    }
}
