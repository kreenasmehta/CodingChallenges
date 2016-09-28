package DataStructures.StacksAndQueues;

/**
 * Created by kreenamehta on 7/9/16.
 * How would you design a stack which, in addition to push and pop, also has a function min which returns the minimum
 * element? Push, pop and min should all operate in O(1) time.
 */
public class MinStack {

    StackNode[] array;
    int top;

    public MinStack(int size){
        array=new StackNode[size];
        top =-1;
    }

    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(top==array.length-1){
            return true;
        }
        return false;
    }

    public void push(int value){
        if(isFull()){
            System.out.println("Stack is full.");
        } else{
            int min = Math.min(value,getMin());
            StackNode stackNode = new StackNode(value,min);
            array[++top]=stackNode;
        }

    }

    public StackNode pop(){
        if(isEmpty()){
            return new StackNode('\0','\0');
        } else{
            return array[top--];
        }
    }

    public StackNode peek(){
        if(isEmpty()){
            return new StackNode('\0','\0');
        } else{
            return array[top];
        }
    }

    public int getMin(){
        if(isEmpty()){
            return Integer.MAX_VALUE;
        }
        return peek().min;
    }

}

class StackNode{
    int value;
    int min;

    public StackNode(int value, int min){
        this.value=value;
        this.min=min;
    }
}

class MinStackTest{
    public static void main(String args[]){
        MinStack minStack = new MinStack(6);
        minStack.push(3);
        minStack.push(5);
        minStack.push(1);
        minStack.push(7);
        StackNode s1 = minStack.pop();
        StackNode s2 = minStack.pop();
        int min = minStack.getMin();
        System.out.println(min);
        minStack.push(0);
        minStack.push(71);
        System.out.println(minStack.getMin());
        StackNode s3 = minStack.pop();
        StackNode s4 = minStack.pop();
        System.out.println(minStack.getMin());
    }
}
