import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Scanner;

public class linked_list_6 {

    public static class GetElement{
        public static int firstElement(LinkedList<Integer> list){
            int firstVal=  list.get(0);
            return firstVal;
        }
        public static int givenIndexElements(LinkedList<Integer> list,int index){
            int temp=0;
            for(int i=0;i<index;i++){
                 temp=list.get(i);
            }
            return temp;
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        // Retrieve and print the first element
        int first = GetElement.firstElement(list);
        System.out.println("The first element is: " + first);
        Scanner sc=new Scanner(System.in);
        int index= sc.nextInt();
        int value=GetElement.givenIndexElements(list,index);
        System.out.println("at the index "+index+" value is : "+value);
    }
}
