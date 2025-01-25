import java.util.LinkedList;

public class linked_list_10 {
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

    public static class linkedlist{
        public static void product(LinkedList<Integer> list){
            int prod=1;
            for(int i=0;i<list.size();i++){
                prod*=list.get(i);
            }
            System.out.println("product of all the data : ");
            System.out.println(prod);
        }
        public static void sum(LinkedList<Integer> list){
            int sum=0;
            for(int i=0;i<list.size();i++){
                sum+=list.get(i);
            }
            System.out.println("sum of all the data : ");
            System.out.println(sum);
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList();
        list.add(12);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(18);
        linkedlist.product(list);
        linkedlist.sum(list);
    }
}
