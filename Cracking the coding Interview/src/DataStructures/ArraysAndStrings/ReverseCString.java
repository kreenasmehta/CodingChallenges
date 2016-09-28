package DataStructures.ArraysAndStrings;

import java.util.Scanner;

/**
 * Created by kreenamehta on 6/19/16.
 *
 * Write code to reverse a C-Style String (C-String means that “abcd” is represented as five characters, including the
 * null character )
 */
public class ReverseCString {

    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a C-style string");
        String string = sc.next();
        String nullChar = "\0";
        System.out.println(reverseString(string+nullChar));
        System.out.println(reverseString(string).length());
    }

    private static String reverseString(String inputString){
        char[] a = inputString.toCharArray();
        int i = 0;
        int j = a.length -1 ;
        char temp;

        while (i<j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i ++;
            j --;
        }

        String reverse = new String(a);
        return reverse;
    }
}
