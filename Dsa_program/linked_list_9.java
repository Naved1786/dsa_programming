public class linked_list_9 {
   public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size=0;
    public static class linkedList{
        public static void CreateLinkedList(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
                size++;
            }else{
                tail.next=newNode;
                tail=tail.next;
                size++;
            }
        }
        public static void display(Node head){
            Node current=head;
            while(current!=null){
                System.out.print(current.data+"->");
                current=current.next;
            }
            System.out.println("null");
        }
        public static void SumOfAllElements(Node head){
            if(head==null){
                System.out.println("linked list is empty");
            }else {
                int sum=0;
                Node current=head;
                while (current.next!=null){
                    sum+=current.data;
                    current=current.next;
                }
                sum+=current.data;
                System.out.println("sum of all elements is : "+sum);
            }
        }
        public static void AverageOfAllElement(Node head){
            int sum=0;
            Node current=head;
            while(current.next!=null){
                sum+=current.data;
                current=current.next;
            }
            sum+= current.data;
            int average=sum/size;
            System.out.println("Average of total elements are : "+average);
        }
    }

    public static void main(String[] args) {
//        linkedList ll=new linkedList();
        linkedList.CreateLinkedList(12);
        linkedList.CreateLinkedList(13);
        linkedList.CreateLinkedList(14);
        linkedList.CreateLinkedList(15);
        linkedList.display(head);
        linkedList.SumOfAllElements(head);
        linkedList.AverageOfAllElement(head);
    }
}
