package Algorithms;

/**
 * Created by kreenamehta on 7/5/16.
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>target && nums[j]>target){
                    continue;
                }
                if(nums[i]+nums[j]==target && i!=j){
                    result[0]=j;
                    result[1]=i;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String args[]){
        int[] a = {21,19,11,20,2};
        int[] r = twoSum(a,13);
    }
}
