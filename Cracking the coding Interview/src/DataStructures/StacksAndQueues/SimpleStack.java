package DataStructures.StacksAndQueues;

/**
 * Created by kreenamehta on 7/9/16.
 *
 */
public class SimpleStack {

    int[] stack;
    int top;
    int min;

    // constructor
    public SimpleStack(int size){
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
