package Algorithms;

/**
 * Created by kreenamehta on 6/30/16.
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.

 Example:
 Given a = 1 and b = 2, return 3.
 */
public class SumOfTwoIntegers {

    public static int getSum(int a, int b) {

        if (b == 0)
            return a;
        else
            return getSum( a ^ b, (a & b) << 1);
    }

    public static void main(String args[]){
        System.out.print(getSum(19,10));
    }
}
