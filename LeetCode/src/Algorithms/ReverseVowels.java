package Algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kreenamehta on 7/1/16.
 * Write a function that takes a string as input and reverse only the vowels of a string.

 Example 1:
 Given s = "hello", return "holle".

 Example 2:
 Given s = "leetcode", return "leotcede".
 */
public class ReverseVowels {

    public static String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        boolean isIaVowel = false;
        boolean isJaVowel = false;
        List<Character> validVowels = new ArrayList<>();
        validVowels.add('a');
        validVowels.add('e');
        validVowels.add('i');
        validVowels.add('o');
        validVowels.add('u');
        char[] sArray = s.toCharArray();


        while(i<=j){
            if(validVowels.contains(Character.toLowerCase(sArray[i]))){
                isIaVowel = true;
            } else {
                i++;
            }
            if(validVowels.contains(Character.toLowerCase(sArray[j]))){
                isJaVowel = true;
            } else {
                j--;
            }
            if(isIaVowel == true && isJaVowel == true){
                char temp = sArray[i];
                sArray[i] = sArray[j];
                sArray[j] =  temp;
                i++;
                j--;
                isIaVowel=false;
                isJaVowel=false;
            }
        }

        String reversedVowels = new String(sArray);
        return reversedVowels;
    }

    public static void main(String args[]){
        System.out.println(reverseVowels("Aa"));
    }
}
