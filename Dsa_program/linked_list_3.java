public class linked_list_3 {
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;
        void AddElementsAtTheLast(int value){
          Node temp=new Node();
          temp.data=value;
          temp.next=null;
          if(size==0){
              head=tail=temp;
          }else{
              tail.next=temp;
              tail=temp;
          }
          size++;
        }
        void countEvenElements(){
            Node current=head;
            int count=0;
            while(current!=null){
                int elem=current.data;
                if(elem%2==0){
                   count++;
                }
                current=current.next;
            }
            System.out.println(count);
        }
    }

    public static void main(String[] args) {
        LinkedList obj=new LinkedList();
        for(int i=1;i<=10;i++){
            obj.AddElementsAtTheLast(i);
        }
        obj.countEvenElements();
    }
}
