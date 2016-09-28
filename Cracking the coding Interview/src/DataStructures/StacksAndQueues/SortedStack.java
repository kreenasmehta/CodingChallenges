package DataStructures.StacksAndQueues;

import DataStructures.LinkedList.LinkedList;
import DataStructures.LinkedList.Node;

/**
 * Created by kreenamehta on 7/10/16.
 */
public class SortedStack {

    LinkedList sortedStack;
    LinkedList unsortedStack;

    public SortedStack(){
        sortedStack=new LinkedList();
        unsortedStack=new LinkedList();
    }

    public void push(int value){
        if(isEmpty(sortedStack)||value<=peek(sortedStack)){
            sortedStack.add(value);
        } else{
            while (isEmpty(sortedStack)){

            }
        }
    }

    public int pop(){

        // incomplete
        return 1;
    }

    public int peek(LinkedList stack){
        int totalElementsInStack = stack.getCount();
        int topElement = (int)stack.get(totalElementsInStack).getData();
        return topElement;
    }

    public boolean isEmpty(LinkedList stack){
        if(stack.getHead().getNext()==null){
            return true;
        }
        return false;
    }

}
