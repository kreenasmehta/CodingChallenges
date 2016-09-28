package Algorithms;

/**
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.
 */
public class FirstUniqueCharInString {

    public static int firstUniqChar(String s) {
        int[] indices = new int[26];
        char[] s_char = s.toCharArray();
        for(int i =0;i<s.length();i++){
            if(indices[s_char[i]-'a'] == 0){
                indices[s_char[i]-'a'] = i+1;
            } else {
                indices[s_char[i]-'a'] = -1;
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<indices.length;i++){
            if(indices[i] != -1 && indices[i] != -0 && indices[i]<min){
                min=indices[i];
            }
        }
        if(min == Integer.MAX_VALUE){
            return -1;
        }
        return min-1;
    }

    public static void main(String args[]){
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
}
