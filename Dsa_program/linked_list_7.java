import java.util.LinkedList;
import java.lang.Integer;
public class linked_list_7 {

     public   static   class Node{
          int data;
          Node next;
             public Node(int data){
              this.data=data;
              this.next=null;
             }
     }
     public static class LinkedList{
         Node head;
         Node tail;
         int size;
         public  boolean SearchElements(java.util.LinkedList<Integer> list, int value){
             for(int i=0;i<list.size();i++){
                 if(value==list.get(i)){
                     return true;
                 }
             }
             return false;
         }
         public static void AddElementAtThelastPositions(java.util.LinkedList<Integer> list){
             Node NewNode=new Node(20);
             list.add(20);
             for(int i=0;i<list.size();i++) {
                 System.out.print(list.get(i)+" ");
             }

         }
     }

     public static void main(String[] args) {
        java.util.LinkedList<Integer> list=new java.util.LinkedList<>();
        list.add(12);
        list.add(14);
        list.add(15);
        list.add(17);
        LinkedList obj=new LinkedList();
        obj.SearchElements(list,10);
        LinkedList.AddElementAtThelastPositions(list);
        Node head;



    }
}
