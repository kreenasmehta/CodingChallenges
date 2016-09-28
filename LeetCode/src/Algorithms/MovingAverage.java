package Algorithms;

/**
 * Created by kreenamehta on 6/20/16.
 * Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.
 */
public class MovingAverage {

    Integer[] window;
    int front;
    int rear;
    int size;
    int pointer;

    public MovingAverage(int size){
        this.size = size;
        window = new Integer[size];
        front = 0;
        rear = window.length;
        pointer=front;
    }

    public double next(int value){
        if(pointer == rear){
            pointer = front;
        }
        window[pointer]=value;
        pointer++;
        double sum = 0;
        int elementsInWindow = 0;
        for(int i =0; i<rear; i++){
            if(window[i]!=null){
                sum+=window[i];
                elementsInWindow++;
            }
        }
        double average = sum/elementsInWindow;
        return average;
    }

    public static void main(String args[]){
        MovingAverage movingAverage = new MovingAverage(3);
        System.out.println(movingAverage.next(1));
        System.out.println(movingAverage.next(10));
        System.out.println(movingAverage.next(3));
        System.out.println(movingAverage.next(5));
    }
}

