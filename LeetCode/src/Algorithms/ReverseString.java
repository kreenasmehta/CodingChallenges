package Algorithms;

/**
 * Created by kreenamehta on 6/22/16.
 * Write a function that takes a string as input and returns the string reversed.

 Example:
 Given s = "hello", return "olleh".
 */
public class ReverseString {

    public static String reverseString(String s) {
        if (s.length() >= 1) {
            char[] stringArray = s.toCharArray();
            int mid;
            char temp;
            if(stringArray.length%2 == 0){
                mid = stringArray.length/2;
            } else {
                mid = (stringArray.length-1)/2;
            }
            for(int front = 0, rear= stringArray.length-1; front<mid; front++, rear--){
                temp = stringArray[front];
                stringArray[front] = stringArray[rear];
                stringArray[rear] = temp;
            }
            String reverseString = new String(stringArray);
            return reverseString;
        }
        return s;

    }

    public static void main(String args[]){
        System.out.println(reverseString("Kreena"));
    }

}
