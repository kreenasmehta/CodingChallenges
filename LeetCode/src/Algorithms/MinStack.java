package Algorithms;

/**
 * Created by kreenamehta on 7/3/16.
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

 push(x) -- Push element x onto stack.
 pop() -- Removes the element on top of the stack.
 top() -- Get the top element.
 getMin() -- Retrieve the minimum element in the stack.
 */
public class MinStack {

    Node head;

    /** initialize your data structure here. */
    public MinStack() {
        head=new Node(0);
    }

    public void push(int x) {
        Node current = head;
        Node n = new Node(x);
        while (current.getNext()!=null){
            current=current.getNext();
        }
        current.setNext(n);
    }

    public void pop() {
        Node current=head;
        if(current!=null){
            while (current.getNext()!=null){
                if(current.getNext().getNext()==null){
                    current.setNext(null);
                } else{
                    current=current.getNext();
                }
            }
        }
    }

    public int top() {
        Node current = head;
        while(current!=null){
            if(current.getNext()==null){
                return current.getData();
            } else{
                current=current.getNext();
            }
        }
        return 0;
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        Node current = head;
        if(current!=null){
            current=current.getNext();
            while (current!=null){
                if(current.getData()<min){
                    min=current.getData();
                }
                current=current.getNext();
            }
        }
        return min;
    }
}

class Node{

    int data;
    Node next;

    public Node(int value){
        data = value;
        next = null;
    }

    public int getData(){
        return data;
    }

    public void setData(int dataValue){
        data = dataValue;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node nextNode){
        next = nextNode;
    }
}

class MinStackTest{
    public static void main(String args[]){
        MinStack m = new MinStack();
        m.push(-2);
        m.push(0);
        m.push(-3);
        int a = m.getMin();
    }
}