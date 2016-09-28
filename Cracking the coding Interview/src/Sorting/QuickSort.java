package Sorting;

import static Sorting.QuickSort.quickSort;

/**
 * Created by kreenamehta on 7/24/16.
 * QuickSort
 */
public class QuickSort {

    public static int[] quickSort(int a[]){
        int initWall = -1;
        a=quickSort(a,a[a.length-1],initWall);
        return a;
    }

    public static int[] quickSort(int[] a, int pivot, int wall){
        if (wall<a.length-2) {
            for(int i=wall+1; i<a.length-1;i++){
                if(a[i]<=pivot){
                    int temp=a[wall+1];
                    a[wall+1]=a[i];
                    a[i]=temp;
                    wall++;
                }
            }
            int temp = a[wall+1];
            a[wall+1]=pivot;
            a[a.length-1]=temp;
            pivot=a[a.length-1];
            wall++;
            return quickSort(a,pivot,wall);
        } else{
            return a;
        }

    }
}

class QuickSortTest{
    public static void main(String args[]){
        int[] a={6,5,1,3,8,4,7,9,2};
        a = quickSort(a);
    }
}
