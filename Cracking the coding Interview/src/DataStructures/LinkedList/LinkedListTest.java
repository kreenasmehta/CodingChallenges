package DataStructures.LinkedList;

import sun.awt.image.ImageWatched;

/**
 * Created by kreenamehta on 7/7/16.
 */
public class LinkedListTest {

    public static void main(String args[]){
//        LinkedList l = new LinkedList();
//        l.add(1);
//        l.add(2);
//        l.add(3);
//        l.add(4);
//        l.add(5);
//        l.add(6);
//        l.add(7);
//        l.add(8);
//        l.add(9);
//        l.add(10);
//        l.print();
//        System.out.println();
//        System.out.println("---------------------");
//        l.printNthToLastElement(5);

        LinkedList n1 = new LinkedList();
        n1.add(4);
        n1.add(1);
        n1.add(5);
        LinkedList n2 = new LinkedList();
        n2.add(5);
        n2.add(9);
        n2.add(2);
        int sum = n1.getNumberFromLinkedList()+n2.getNumberFromLinkedList();
        LinkedList x = LinkedList.createReverseLinkedList(sum);
        x.print();

    }
}
