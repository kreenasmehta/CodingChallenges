package DataStructures.LinkedList;

/**
 * Created by kreenamehta on 7/7/16.
 *
 * Node class
 */
public class Node {

    private Object data;
    private Node next;

    public Node(Object data){
        this.data=data;
        next=null;
    }

    public void setData(Object data){
        this.data = data;
    }

    public Object getData(){
        return data;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public Node getNext(){
        return next;
    }
}
