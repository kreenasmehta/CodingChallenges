package DataStructures;

/**
 * Created by kreenamehta on 7/2/16.
 */

public class LinkedListTest{

    public static void main(String args[]){
        LinkedList l = new LinkedList();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        l.add("E");
        l.print();
        System.out.println("--------------");
//        l.add("F",7);
//        l.print();
//        l.remove(2);
//        System.out.println("--------------");
//        l.print();
//        System.out.println("--------------");
        Node o = l.get(4);
        l.remove(o);
        System.out.println("--------------");
        l.print();


    }

}

class LinkedList {

    private Node head;
    private int countListElements;

    public LinkedList(){
        head = new Node(null);
        countListElements = 0;
    }

    public void add(Object data){
        Node newNode = new Node(data);
        Node current = head;
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(newNode);
        incrementCounter();
    }

    public int getCountListElements(){
        return countListElements;
    }

    public void incrementCounter(){
        countListElements++;
    }

    public void decrementCounter(){
        countListElements--;
    }

    public void add (Object data, int position){
        Node newNode = new Node(data);
        Node current = head;
        int currentCount = 1;
        if(position>getCountListElements()+1){
            System.out.println("The given position is over the current list size");
        } else{
            while (current.getNext() != null && currentCount < position){
                current = current.getNext();
                currentCount++;
            }
            Node temp = current.getNext();
            current.setNext(newNode);
            newNode.setNext(temp);
            incrementCounter();
        }

    }

    public Node get(int index){

        if(index<=0){
            return null;
        }
        if(getCountListElements() < index){
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

    public boolean remove(int index){
        if(index < 1 || index > getCountListElements()){
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

    public void print(){
        Node current = head;
        if(current!=null){
            current=current.getNext();
            while (current!=null){
                System.out.println(current.getData());
                current=current.getNext();
            }
        } else {
            System.out.println("Empty linked list");
        }
    }

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




}
class Node {

    Object data;
    Node next;

    public Node(Object value){
        data = value;
        next = null;
    }

    public Object getData(){
        return data;
    }

    public void setData(Object dataValue){
        data = dataValue;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node nextNode){
        next = nextNode;
    }
}
