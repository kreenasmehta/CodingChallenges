package DataStructures;

/**
 * Created by kreenamehta on 7/2/16.
 *
 * Design a Queue data structure
 */
public class Queue {

    int[] queue;
    int front;
    int rear;

    public Queue(int queueSize){
        queue = new int[queueSize];
        front = 0;
        rear = -1;
    }

    public boolean isEmpty(){
        if(front == queue.length){
            front = 0;
            rear = -1;
        }
        if(rear == -1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(front == queue.length-1){
            return true;
        }
        return false;
    }

    public void enQueue(int newElement){
        if(isFull()){
            System.out.println("Queue is full");
            System.exit(0);
        }
        queue[rear+1] = newElement;
        rear++;
    }

    public int deQueue(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            System.exit(0);
        }
        int deQueueElement = queue[front];
        front++;
        return deQueueElement;
    }

    public static void main(String args[]){
        Queue q = new Queue(4);
        q.enQueue(10);
        q.enQueue(20);
        System.out.println(q.deQueue());
        q.enQueue(30);
        q.enQueue(40);
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        q.enQueue(50);
        System.out.println(q.deQueue());
    }
}
