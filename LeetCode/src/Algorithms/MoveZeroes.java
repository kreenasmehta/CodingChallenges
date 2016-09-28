package Algorithms;

/**
 * Created by kreenamehta on 6/30/16.
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the
 * non-zero elements.

 For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

 Note:
 You must do this in-place without making a copy of the array.
 Minimize the total number of operations.
 */
public class MoveZeroes {

    public static void moveZeroes(int[] nums) {

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == 0){
                    if(nums[j] == 0) {
                        continue;
                    } else {
                        int temp = nums[i];
                        nums[i] = nums [j];
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" | ");
        }
    }

    public static void main(String args[]){
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
}
