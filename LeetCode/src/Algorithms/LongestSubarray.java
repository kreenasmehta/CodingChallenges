package Algorithms;

/**
 * Created by kreenamehta on 9/24/16.
 */
public class LongestSubarray {

    static int maxLength(int[] a, int k) {

        int maxLengthValue = 0;
        int currentLength;
        int currentSum;

        for(int i=0;i<a.length;i++){
            currentLength = 0;
            currentSum =0;
            for(int j=i;j<a.length;j++){
                if(currentSum + a[j] <= k){
                    currentSum += a[j];
                    currentLength++;
                } else{
                    break;
                }
                }
            if(currentLength>maxLengthValue){
                maxLengthValue = currentLength;
            }

        }
        return maxLengthValue;


    }

    public static void main(String args[]){
        int[] a = {3,1,2,1};
        int x = maxLength(a,4);
    }
}
