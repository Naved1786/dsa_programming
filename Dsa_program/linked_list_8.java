import java.util.SequencedSet;

public class linked_list_8 {
      public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
     }
     public static Node head;
      public static Node tail;

    public static void display(Node head){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" ");
           current= current.next;
        }
    }
    public static void main(String[] args) {
        head.data=12;
        head.next=null;
        Node newNode=new Node(1);
        head.next=newNode;
        newNode.next=new Node(12);
        newNode.next.next=new Node(13);
        linked_list_8.display(head);
    }
}
