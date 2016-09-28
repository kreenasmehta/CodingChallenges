package Algorithms;

/**
 * Created by kreenamehta on 7/1/16.
 * Given an integer, write a function to determine if it is a power of two.
 */
public class PowerOfTwo {

    public static boolean isPowerOfTwo(int n) {

        if(n==0){
            return false;
        }
        if(n==1){
            return true;
        } else if(n%3 != 0){
            return false;
        } else {
            return isPowerOfTwo(n/3);
        }
    }

    public static void main(String args[]){
        System.out.print(isPowerOfTwo(18));
    }
}
