import org.w3c.dom.Node;

public class linked_list_2 {

    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;
        void addLast(int val){
            Node temp=new Node();
            temp.data=val;
            temp.next=null;
            if (size==0){
                head=tail=temp;
            }else{
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
        void sumOfAllElements(){
            int sum=0;
            Node current =head;
            while(current!=null){
                sum+=current.data;
                current=current.next;
            }
            System.out.println(sum);
        }
        void Average(){
            double Average=0;
            double sum=0;
            Node current=head;
            while (current!=null){
                sum+=current.data;
                current=current.next;
            }Average=sum/size;
            System.out.println(Average);
        }
    }
    public static void main(String[] args) {
        LinkedList obj=new LinkedList();
        for(int i=1;i<=10;i++){
            obj.addLast(i);
        }
        System.out.println("Linked list values:");
        obj.printAll();
        System.out.println("sum of all elements of linked list is : ");
        obj.sumOfAllElements();
        System.out.println("Average of total elements presents in linkedlist ");
        obj.Average();
    }
}
