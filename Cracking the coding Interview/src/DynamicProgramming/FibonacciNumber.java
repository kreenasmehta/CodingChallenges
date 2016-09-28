package DynamicProgramming;

/**
 * Created by kreenamehta on 7/19/16.
 */
public class FibonacciNumber {

    public static int fibonacci(int i){
        return fibonacci(i,new int[i+1]);
    }

    public static int fibonacci(int i, int[] memo){
        if(i==0 || i==1){
            return i;
        }
        if(memo[i]==0){
            memo[i]= fibonacci(i-1,memo)+ fibonacci(i-2,memo);
        }
        return memo[i];
    }
}

class FibonaccinNumberTest{
    public static void main(String args[]){
        boolean[][] temp = new boolean[4][3];
        int f = FibonacciNumber.fibonacci(5);
    }
}
