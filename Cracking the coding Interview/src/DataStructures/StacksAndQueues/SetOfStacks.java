package DataStructures.StacksAndQueues;

import java.util.ArrayList;

/**
 * Created by kreenamehta on 7/9/16.
 *
 */
public class SetOfStacks {

    ArrayList<Stack> setOfStacks;
    int indexOfLastStack;
    int threshold;

    public SetOfStacks(int threshold){
        setOfStacks = new ArrayList<>();
        indexOfLastStack=-1;
        this.threshold = threshold;
    }

    public void push(int value){
        if(getIndexOfLastStack()<0){
            Stack stack = new Stack(threshold);
            setOfStacks.add(stack);
            indexOfLastStack++;
            stack.push(value);
        } else{
            Stack stack = getLastStack();
            if(stack.isFull()){
                Stack newStack = new Stack(threshold);
                setOfStacks.add(newStack);
                indexOfLastStack++;
                newStack.push(value);
            } else{
                stack.push(value);
            }
        }
    }

    public int pop(){
        if(getIndexOfLastStack()<0){
            return '\0';
        }
        Stack lastStack = getLastStack();
        if(lastStack.top==0){
            setOfStacks.remove(getIndexOfLastStack());
            indexOfLastStack--;
        }
        return lastStack.pop();
    }

    public int peek(){
        if(getIndexOfLastStack()<0){
            return '\0';
        }
        Stack lastStack = getLastStack();
        return lastStack.peek();
    }

    private int getIndexOfLastStack(){
        return indexOfLastStack;
    }

    private Stack getLastStack(){
        return setOfStacks.get(getIndexOfLastStack());
    }
}

class Stack{
    int[] stack;
    int top;
    int min;

    // constructor
    public Stack(int size){
        stack=new int[size];
        top=-1;
        min=Integer.MAX_VALUE;
    }

    // returns true if the stack is empty
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }

    // returns true if the stack is full
    public boolean isFull(){
        if(top==stack.length-1){
            return true;
        }
        return false;
    }

    // push an element to the stack
    public void push(int num){
        if(isFull()){
            System.out.println("The stack is full.");
        } else{
            stack[++top]=num;
        }
    }

    // pops the topmost element out of the stack
    public int pop(){
        if(isEmpty()){
            return '\0';
        }
        return stack[top--];
    }

    // peeks the topmost element of the stack
    public int peek(){
        if(isEmpty()){
            return '\0';
        }
        return stack[top];
    }

    public void print(){
        if(isEmpty()){
            System.out.println("The stack is empty");
        } else {
            for(int i=0;i<=top;i++){
                System.out.print(stack[i]+" ");
            }
        }
    }

}

class SetOfStacksTest{
    public static void main(String args[]){
        SetOfStacks setOfStacks = new SetOfStacks(5);
        setOfStacks.push(1);
        setOfStacks.push(2);
        setOfStacks.push(3);
        setOfStacks.push(4);
        setOfStacks.push(5);
        setOfStacks.push(6);
        setOfStacks.push(7);
        System.out.println(setOfStacks.pop());
        System.out.println(setOfStacks.pop());
        System.out.println(setOfStacks.pop());
        setOfStacks.push(8);
        System.out.println(setOfStacks.pop());
    }
}
