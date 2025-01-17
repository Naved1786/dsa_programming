public class linked_list_1 {
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;
        void addLast(int value){
            Node temp=new Node();
            temp.data=value;
            temp.next=null;
            if (size==0){
               head=tail=temp;
            }else {
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        void printAll() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
      LinkedList obj=new LinkedList();
      obj.addLast(1);
      obj.addLast(2);
      obj.addLast(3);
      System.out.println("Linked list values:");
      obj.printAll();
    }
}
