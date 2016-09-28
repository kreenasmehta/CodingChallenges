package Algorithms;

/**
 * Created by kreenamehta on 7/1/16.
 * A strobogrammatic number is a number that looks the same when rotated 180 degrees (looked at upside down).

 Write a function to determine if a number is strobogrammatic. The number is represented as a string.

 For example, the numbers "69", "88", and "818" are all strobogrammatic.
 */
public class StrobogrammaticNumber {

    public static boolean isStrobogrammatic(String num) {
        char[] numArray = num.toCharArray();
        int i = 0;
        int j = num.length()-1;
        char expectedString;
        while(i<=j){
            expectedString = expectedString(numArray[i]);
            if(expectedString == numArray[j]){
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static char expectedString(char c){
        char expectedString;
        switch (c){
            case '1':
                expectedString = '1';
                break;
            case '6':
                expectedString = '9';
                break;
            case '8':
                expectedString = '8';
                break;
            case '9':
                expectedString = '6';
                break;
            case '0':
                expectedString = '0';
                break;
            default:
                expectedString = '\0';
                break;
        }
        return expectedString;
    }

    public static void main(String args[]){
        System.out.println(isStrobogrammatic("18181"));

    }
}
