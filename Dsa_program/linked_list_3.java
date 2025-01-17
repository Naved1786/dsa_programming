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
        void countOddElements(){
            Node current=head;
            int count=0;
            while(current!=null){
                int element=current.data;
                if(element%2!=0){
                    count++;
                }
                current=current.next;
            }
            System.out.println(count);
        }
        void countPrimeNumber(){
            Node current=head;
            int count=1;
            int k=0;
            while (current!=null){
                int val=current.data;
                k=0;
                for(int i=2;i<val;i++){
                    if(val%i==0){
                        k=0;
                      break;
                    }else{
                       k=1;
                    }
                }
                if(k==1){
                    count++;
                }
              current= current.next;
            }
            System.out.println(count);
        }
    }

    public static void main(String[] args) {
        LinkedList obj=new LinkedList();
        for(int i=1;i<=10;i++){
            obj.AddElementsAtTheLast(i);
        }
        System.out.println("total even number is : ");
        obj.countEvenElements();
        System.out.println("total odd number is : ");
        obj.countOddElements();
        System.out.println("total prime number is : ");
        obj.countPrimeNumber();

    }
}
