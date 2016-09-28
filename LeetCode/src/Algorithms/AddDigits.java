package Algorithms;

/**
 * Created by kreenamehta on 6/29/16.
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

 For example:

 Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

 Follow up:
 Could you do it without any loop/recursion in O(1) runtime?
 */
public class AddDigits {

    public static int addDigits(int num) {
        // length of a number
        final int numLength = String.valueOf(num).length();
        // if length of the number is 1, return the number
        if (numLength == 1){
            return num;
        }
        // else put each digit of the number into an array and add all the elements of the array
        else {
            int[] numArray = new int[numLength];
            int sum = 0;
            for(int i=0; i<numLength; i++){
                numArray[i] = num % 10;
                num /= 10;
            }
            for(int i=0; i<numLength; i++){
                sum+=numArray[i];
            }
            return addDigits(sum);
        }
    }

    public static int digitalRoot(int num){
        int value1 = num -1;
        int value2 = value1 % 9;
        int value3 = value2+1;
        return value3;
    }

    public static void main(String args[]){
        System.out.println(digitalRoot(39));
    }
}
