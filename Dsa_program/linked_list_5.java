import java.util.LinkedList;
public class linked_list_5 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);
        linkedList.add(60);
        linkedList.add(70);
        System.out.println(linkedList);
        linkedList.remove(0);
        System.out.println(linkedList);
        linkedList.remove(0);
        System.out.println(linkedList);
        linkedList.addFirst(100);
        System.out.println(linkedList);
        linkedList.addLast(200);
        System.out.println(linkedList);
        System.out.println("after removing the 4th element from the linkedlist : "+ linkedList.remove(3));
        System.out.println("we are getting the value at the index 2 position from the linkedList "+linkedList.get(2));
        // we are iterating the linkedList here :
        for(int val:linkedList){
            System.out.print(val+" ");
        }

    }
}
