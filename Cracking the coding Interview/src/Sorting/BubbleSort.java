package Sorting;

import static Sorting.BubbleSort.bubbleSort;

/**
 * Created by kreenamehta on 7/23/16.
 * Bubble sort
 */
public class BubbleSort {

    public static int[] bubbleSort(int[] a){
        boolean swap = true;
        int j = a.length-1;
        while(swap){
            swap=false;
            for(int i=0;i<j;i++){
                if(a[i]>a[i+1]){
                    int temp = a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                    swap=true;
                }
            }
            j--;
        }
        return a;
    }
}

class BubbleSortTest{
    public static void main(String args[]){
        int[] a = {10, 15, 1, 7, 3, 9, 6};
        a = bubbleSort(a);
    }
}
