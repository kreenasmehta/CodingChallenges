package Algorithms;

import java.util.HashMap;

/**
 * Created by kreenamehta on 9/22/16.
 */
public class MajorityElement {

    public static int majorityElement(int[] nums) {
            int major = nums[0];
            int count = 1;
            for(int i=1;i<nums.length;i++){
                if(count==0){
                    count++;
                    major=nums[i];
                } else if (major==nums[i]){
                    count++;
                } else{
                    count--;
                }
            }
            return major;

    }

    public static void main(String args[]){
        int[] a = {1};
        int x = majorityElement(a);
    }
}
