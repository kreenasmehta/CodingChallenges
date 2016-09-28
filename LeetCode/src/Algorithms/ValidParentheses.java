package Algorithms;

import java.util.ArrayList;

/**
 * Created by kreenamehta on 7/1/16.
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
public class ValidParentheses {

    public static boolean isValid(String s) {
        ArrayList<String> al = new ArrayList<>();
        int j = -1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                al.add(String.valueOf(s.charAt(i)));
                j++;
            } else if (j>-1){
                if (s.charAt(i) == ')') {
                    if (al.get(j).equals("(")) {
                        al.remove(j);
                        j--;
                    } else {
                        return false;
                    }
                } else if (s.charAt(i) == '}') {
                    if (al.get(j).equals("{")) {
                        al.remove(j);
                        j--;
                    } else {
                        return false;
                    }
                } else if (s.charAt(i) == ']') {
                    if (al.get(j).equals("[")) {
                        al.remove(j);
                        j--;
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        if(al.size()>0){
            return false;
        }
        return true;
    }

    public static void main(String args[]){
        boolean isValid = isValid("]");
        System.out.print(isValid);
    }
}
