package Sorting;

import static Sorting.MergeSort.mergeSort;

/**
 * Created by kreenamehta on 7/23/16.
 * Merge sort
 */
public class MergeSort {

    public static void mergeSort(int[] a){
        int[] helper = new int[a.length-1];
        mergeSort(a, helper, 0, a.length-1);
    }

    public static void mergeSort(int[] a, int[] helper, int low, int high){
        if(low<high){
            int mid = (low+high)/2;
            // left half
            mergeSort(a, helper, low, mid);
            // right half
            mergeSort(a, helper, mid+1, high);
            // merge
            merge(a, helper, low, mid, high);
        }

    }

    public static void merge(int[] a, int[] helper, int low, int mid, int high){
        for(int i=low;i<=high;i++){
            helper[i]=a[i];
        }
         int helperLeft = low;
        int helperRight=mid+1;
        int current = low;

        while (helperLeft<=mid && helperRight<=high){
            if(helper[helperLeft]<=helper[helperRight]){
                a[current]=helper[helperLeft];
                helperLeft++;
            } else{
                a[current]=helper[helperRight];
                helperRight++;
            }
            current++;
        }

        int remaining = mid-helperLeft;
        for(int i =0;i<=remaining;i++){
            a[current+i]=helper[helperLeft+i];
        }

    }
}

class MergeSortTest{
    public static void main(String args[]){
        int[] a = {38,27,43,3,9,82,10};
        mergeSort(a);
    }
}
