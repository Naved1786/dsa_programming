public class linked_list_4 {
    // remove first from linked list
    public static class Node{
        int data;
        Node next;
    }
    public static class linkedList{
        Node head;
        Node tail;
        int size;
       public  void AddLastElements(int value){
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
        public  void removeFirst(){
            if(size==0){
                System.out.println("linkedList is empty ");
            }else if(size==1){
                head=tail=null;
            }else{
                head=head.next;
                size--;
            }
        }
    }
    public static void main(String[] args) {
       linkedList obj=new linkedList();
       obj.AddLastElements(2);
       obj.removeFirst();
    }
}
