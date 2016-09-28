package DataStructures.StacksAndQueues;

import DataStructures.LinkedList.LinkedList;
import DataStructures.LinkedList.Node;

/**
 * Created by kreenamehta on 7/10/16.
 *
 * Simple queue data structure using linked list
 *
 */
public class SimpleQueue {

    LinkedList queue;
    public SimpleQueue(){
        queue=new LinkedList();
    }

    public void enqueue(int value){
        queue.add(value);
    }

    public void enqueu(Object element){
        queue.add(element);
    }

    public boolean isEmpty(){
        if(queue.getHead().getNext()==null){
            return true;
        }
        return false;
    }


    public int dequeue(){
        Node removedNode = queue.getAndRemove(1);
        return (int)removedNode.getData();
    }
}

class SimpleQueueTest{
    public static void main(String args[]){
        SimpleQueue simpleQueue = new SimpleQueue();
        simpleQueue.enqueue(1100);
        simpleQueue.enqueue(1);
        simpleQueue.enqueue(2);
        simpleQueue.enqueue(3);
        System.out.println(simpleQueue.dequeue());
        System.out.println(simpleQueue.dequeue());
        simpleQueue.enqueue(4);
        System.out.println(simpleQueue.dequeue());
    }
}
