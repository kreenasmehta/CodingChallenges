package DataStructures.ArraysAndStrings;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by kreenamehta on 6/18/16.
 * Implement an algorithm to determine if a string has all unique characters What if you can not use additional data
 * structures?
 *
 * Thought process: Read each character in a string, one at a time.
 * Create a Hashmap. Each character is a key with value 1. If the key already exists in the hashmap, the string does
 * not have all the uniques characters. Else, it does.
 */
public class UniqueChars {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Take an input string
        System.out.println("Input a string");
        String inputString = sc.next();
        final boolean isUnique = hasUniqueChar(inputString);

        if (isUnique){
            System.out.println("The given string has all unique characters.");
        } else {
            System.out.println("The given string does not have all unique characters.");
        }
    }

    protected static boolean hasUniqueChar(String inputString){
        // Initialize a Hashmap
        HashMap<String, Integer> charMap = new HashMap<>();
        boolean isUnique = true;
        // Traverse through the string
        for(int i = 0; i<inputString.length(); i++) {
            if(!charMap.containsKey(String.valueOf(inputString.charAt(i)))) {
                //boolean temp = charMap.containsKey(String.valueOf(inputString.charAt(i)));
                charMap.put(String.valueOf(inputString.charAt(i)), 1);
            }
            else{
                isUnique = false;
                break;
            }
        }
        return isUnique;
    }
}
