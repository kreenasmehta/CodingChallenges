package DataStructures;

/**
 * Created by kreenamehta on 7/2/16.
 *
 * Design a Stack data structure
 */
public class Stack {

    int[] elements;
    int top;
    int min = Integer.MAX_VALUE;

    public Stack(int stackSize){
        elements = new int[stackSize];
        top = -1;

    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(top == elements.length - 1){
            return true;
        }
        return false;
    }

    public void push(int newElement){
        if(isFull()){
            System.out.println("Stack is full");
            System.exit(0);
        }
        elements[top+1] = newElement;
        top++;
        if(newElement < min){
            min = newElement;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            System.exit(0);
        }
        int poppedElement = elements[top];
        top--;
        return poppedElement;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            System.exit(0);
        }
        return elements[top];
    }

    public int getMin(){
        return min;
    }

    public static void main(String args[]){
        Stack s = new Stack(6);
        s.push(10);
        s.push(24);
        s.push(100);
        s.push(7);
        s.push(19);
//        System.out.println(s.peek());
//        System.out.println(s.pop());
//        System.out.println(s.peek());
        System.out.println(s.getMin());
    }
}
