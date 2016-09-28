package Algorithms;

import java.util.*;

/**
 * Created by kreenamehta on 6/29/16.
 * Given a string, determine if a permutation of the string could form a palindrome.
 */
public class PalindromePermutation {

    public static boolean canPermutePalindrome(String s) {
        HashMap<Character,Integer> alphabetMap = new HashMap<>();
        for(int i =0; i< s.length(); i++){
            if(alphabetMap.containsKey(s.charAt(i))){
                alphabetMap.put(s.charAt(i), alphabetMap.get(s.charAt(i))+1);
            } else {
                alphabetMap.put(s.charAt(i), 1);
            }
        }
        List<Integer> valueList = new ArrayList<>(alphabetMap.values());
        int occurrenceOdd = 0;
        for(Integer value: valueList){
            if(value%2 != 0){
                occurrenceOdd++;
            }
        }
        if(s.length()%2 == 0 && occurrenceOdd == 0){
            return true;
        } else if (s.length()%2 != 0 && occurrenceOdd == 1){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        System.out.println(canPermutePalindrome("carerac"));
    }
}
