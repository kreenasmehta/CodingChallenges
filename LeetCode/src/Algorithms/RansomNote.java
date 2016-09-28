package Algorithms;

/**
 * Created by kreenamehta on 8/30/16.
 */
public class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {

        int[] counter = new int[26];
        for(char m : magazine.toCharArray()){
            counter[m-'a']++;
        }

        for(char r : ransomNote.toCharArray()){
            if(--counter[r-'a']<0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote, magazine));
    }
}
