package Algorithms;

/**
 * Created by kreenamehta on 7/3/16.
 *
 * Given a column title as appear in an Excel sheet, return its corresponding column number.

 For example:

 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28
 */
public class ExcelSheetColumnNumber {

    public static int titleToNumber(String s) {

        int result = 0;
        for(int i=0;i<s.length();i++){
            result *= 26;
            result += (s.charAt(i)-'A') + 1;
        }
        return result;

    }

    public static void main(String args[]){
        System.out.println(titleToNumber("AZ"));
    }
}
