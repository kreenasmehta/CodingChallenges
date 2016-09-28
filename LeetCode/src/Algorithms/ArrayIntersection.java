package Algorithms;


import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by kreenamehta on 6/30/16.
 *
 * Given two arrays, write a function to compute their intersection.

 Example:
 Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

 Note:
 Each element in the result must be unique.
 The result can be in any order.
 */
public class ArrayIntersection {

    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();

        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }

        for(int n : set1){
            if(set2.contains(n)){
                set3.add(n);
            }
        }

        int[] intersection = new int[set3.size()];
        int index = 0;
        for(int n : set3){
            while(index<intersection.length){
                intersection[index]=n;
                index++;
                break;
            }
        }
        return intersection;
    }


    public static void main(String args[]){
        int[] x = {1,4,7,3,2};
        int[] y = {1,2,0,5,3,9,6};
        int[] temp = intersection(x,y);
        System.out.print("nfkfnilrw");
    }
}
