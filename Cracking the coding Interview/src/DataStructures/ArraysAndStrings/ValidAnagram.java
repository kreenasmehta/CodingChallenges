package DataStructures.ArraysAndStrings;


import java.util.Arrays;

/**
 * Created by kreenamehta on 7/7/16.
 *
 * Thought process: Sort both the strings, if ther lengths are equal, check if each character is equal or not.
 *
 * If all chars are equal, return true else return false
 *
 * If the length is unequal, return false.
 */
public class ValidAnagram {

    public static boolean isAnagram(String a, String b){

        char[] a_char = a.toCharArray();
        Arrays.sort(a_char);
        char[] b_char = b.toCharArray();
        Arrays.sort(b_char);

        if(a_char.length == b_char.length){
            for(int i=0;i<a_char.length;i++){
                if(a_char[i]!=b_char[i]){
                    return false;
                }
            }
            return true;
        }

        return false;
    }

    public static void main(String args[]){
        boolean r = isAnagram("cninema","icemann");
    }
}
