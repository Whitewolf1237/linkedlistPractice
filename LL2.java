public class LL2 {

    public static class ListNode{
        int data;
        ListNode next;

        ListNode(int data){
            this.data=data;
        }
    }

    public static class linkedlist{
        ListNode head = null;
        ListNode tail = null;


        void insertAtEnd(int data){
            ListNode temp = new ListNode(data);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
        void display(){
            ListNode temp = head;
            while(temp!=null){
                System.out.print(temp.data+ " ");
                temp=temp.next;
            }
            System.out.println();
        }

        int size(){
            int count=0;
            ListNode temp=head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }

        void insertAtHead(int data){
            ListNode temp = new ListNode(data);
            if(head==null){  //empty list
                head=tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(7);
        ll.insertAtEnd(8);
        ll.display();
        ll.insertAtHead(2);
        ll.display();
    }
}
