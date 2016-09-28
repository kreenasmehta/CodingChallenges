package DataStructures.StacksAndQueues;

/**
 * Created by kreenamehta on 7/9/16.
 */
public class StackTest {

    public static void main(String args[]){
        SimpleStack simpleStack = new SimpleStack(5);
        simpleStack.push(1);
        simpleStack.push(2);
        simpleStack.push(3);
        simpleStack.print();
        System.out.println();
        System.out.println(simpleStack.peek());
        System.out.println(simpleStack.pop());
        simpleStack.push(4);
        simpleStack.print();
    }
}
