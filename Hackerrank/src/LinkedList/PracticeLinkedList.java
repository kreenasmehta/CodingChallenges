package LinkedList;

import java.util.Objects;

/**
 * Created by kreenamehta on 5/10/16.
 * https://www.cs.cmu.edu/~adamchik/15-121/lectures/Linked%20Lists/code/LinkedList.java
 */
public class PracticeLinkedList {

    // Reference to the head node
    private Node head;
    // counter to eep count of the number of the elements in the list
    private int listCount;

    //Constructor
    public PracticeLinkedList(){

        /*
        This is a empty list, so the reference to the head node is set to new node with no data.
         */
        head = new Node(null);
        listCount = 0;

    }

    // adds a node to the end of the list
    public void add(Object data){
        Node temp = new Node(data);
        Node current = head;

        // starting from the head node, traverse till the end of the list
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(temp);
        listCount++;
    }

    // adds a node to the specified index
    public void add(Object data, int index){
        Node temp = new Node(data);
        Node current = head;

        for(int i=1; i<index && current.getNext() != null; i++){
            current = current.getNext();
        }
        temp.setNext(current.getNext());
        current.setNext(temp);
        listCount++;
    }

    // returns the object at the given index
    public Object get(int index){
        Node current = head;
        for(int i=1; i<index ; i++){
            if (current.getNext() == null) {
                return null;
            }
            current = current.getNext();
        }

        return current.getData();
    }

    // remove the item at the given index
    public boolean remove(int index){
        Node current = head;
        for (int i=1; i<index; i++){
            current = current.getNext();
        }

    }


    /*---------------------------------------------------------------------------------
    * Node class
     ---------------------------------------------------------------------------------*/
    private class Node{

        Object data;
        Node next;


        public Node(Object data){
            this.data = data;
            next = null;
        }

        public Node(Object data, Node next){
            this.data = data;
            this.next = next;
        }

        public Object getData(){
            return data;
        }

        public void setData(Object data){
            this.data = data;
        }

        public Node getNext(){
            return next;
        }

        public void setNext(Node next){
            this.next = next;
        }
    }
}
