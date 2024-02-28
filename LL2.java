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

        void insertAt(int idx,int data){
            ListNode t = new ListNode(data);
            ListNode temp=head;
            if(idx==size()){
                insertAtEnd(data);
                return;
            }
            else if (idx==0) {
                insertAtHead(data);
                return;
                
            }
            else{
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        }

    void getElementAt(int idx){
        ListNode temp=head;
        for(int i=1;i<=idx;i++){
            temp=temp.next;
        }
        System.out.println("value at index "+idx+" is:"+temp.data);
    }

    void deleteAtIndex(int idx){
        if(idx==0) {
            head=head.next;
        }
        ListNode temp=head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        tail=temp;
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
        ll.insertAt(0,10);
        ll.display();
        ll.getElementAt(3);
        ll.deleteAtIndex(4);
        ll.display();
    }
}
