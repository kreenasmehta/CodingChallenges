package DataStructures.LinkedList;

import java.util.Hashtable;

/**
 * Created by kreenamehta on 7/7/16.
 */
public class LinkedList {

    private Node head;
    private int count;

    public LinkedList(){
        head = new Node(null);
        count = 0;
    }

    public Node getHead(){
        return head;
    }

    public void add(Object data){
        Node newNode = new Node(data);
        Node current = head;
        while(current.getNext()!=null){
            current=current.getNext();
        }
        current.setNext(newNode);
        incrementNodeCount();
    }

    private void incrementNodeCount(){
        count++;
    }

    private void decrementCounter(){
        count--;
    }

    public int getCount(){
        return count;
    }

    public void print(){
        Node current = head;
        if(current!=null){
            current=current.getNext();
            while (current!=null){
                System.out.print(current.getData()+" ");
                current=current.getNext();
            }
        } else {
            System.out.println("Empty linked list");
        }
    }

    // removes the node from the linked list at a given index
    public boolean remove(int index){
        if(index < 1 || index > getCount()){
            return false;
        }
        Node current = head;
        if(head!=null){
            for(int i =1;i<index;i++){
                if(current.getNext() == null){
                    return false;
                }
                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());
            decrementCounter();
            return true;
        }
        return false;
    }

    public Node getAndRemove(int index){
        if(index < 1 || index > getCount()){
            return null;
        }
        Node current = head;
        if(head!=null){
            for(int i =1;i<index;i++){
                if(current.getNext() == null){
                    return null;
                }
                current = current.getNext();
            }
            Node removedNode = current.getNext();
            current.setNext(current.getNext().getNext());
            decrementCounter();
            return removedNode;
        }
        return null;
    }




    // removes duplicates from the linked list in O(n) time
    // Using a hashtable
    public void removeDuplicates(){

        Hashtable table = new Hashtable();
        Node previous = head;
        Node current = previous.getNext();
        while (current!=null){
            if(table.containsKey(current.getData())){
                previous.setNext(current.getNext());
                decrementCounter();
                current=current.getNext();
                continue;
            } else {
                table.put(current.getData(),1);
            }
            previous=previous.getNext();
            current=current.getNext();
        }
    }

    public void removeDuplicates2(){

        Node i = head;
        Node j = i;
        Node k = j.getNext();

        // start from head node to the end of the linked list
        // keep j = i at the beginning of every iteration
        // keep k = j.next
        // compare i and k data at every step
        // increase the index of j and k at every step until k reaches the end of the list
        // when k reaches the end of the list, increase the index of i to i+1
        // and iterate again
        // if it is equal then remove the node at k
        //  removing: set j.next = k.next
        //  decrement the count
        //  set k = k.next
        // time O(n^2)
        // no extra buffer
        while (i!=null){
            if(k==null){
                i=i.getNext();
                if(i!=null && i.getNext()!=null){
                    j=i;
                    k=j.getNext();
                } else{
                    break;
                }

            }
            if(i.getData()==k.getData()){
                    j.setNext(k.getNext());
                    k=k.getNext();
                    decrementCounter();
                    continue;
            } else{
                    j=j.getNext();
                    k=k.getNext();
            }

        }
    }

    public void printNthToLastElement(int n){
        Node current = head;
        int countNodeIndex =0;
        if(current!=null && current.getNext()!=null){
            current = current.getNext();
            countNodeIndex++;
            while (current!=null){
                if(countNodeIndex>= n){
                    System.out.print(current.getData()+" ");
                }
                current=current.getNext();
                countNodeIndex++;
            }
        }
    }

    public Node get(int index){

        if(index<=0){
            return null;
        }
        if(getCount() < index){
            return null;
        }

        Node current = head;
        int currentIndex = 0;

        while(current != null){
            if(currentIndex == index){
                return current;
            }
            current = current.getNext();
            currentIndex++;
        }
        return current;
    }


    // remove the given node from the linked list
    public boolean remove(Node node){
        Node current = head;
        if(current!=null){
            while (current.getNext()!=null){
                if(current.getNext().equals(node)){
                    current.setNext(current.getNext().getNext());
                    return true;
                } else{
                    current=current.getNext();
                }
            }
            return false;
        }
        return false;
    }

    // example linked list : 3->1->5
    // digit at the head is 1'
    // number = 513
    // each digit is saved in the linked list in reverse order
    public int getNumberFromLinkedList(){
        int number = 0;
        int temp = 1;
        Node current = head;
        if(current!=null && current.getNext()!=null){
            current=current.getNext();
            while (current!=null){
                number += (int)current.getData()*temp;
                current=current.getNext();
                temp *= 10;
            }
        }
        return number;
    }

    // create a reverseLinked list for a given number
    public static LinkedList createReverseLinkedList(int num){
        LinkedList reverseLinkedList = new LinkedList();
        while (num!=0){
            int digit = num%10;
            reverseLinkedList.add(digit);
            num = num/10;
        }
        return reverseLinkedList;
    }

}
