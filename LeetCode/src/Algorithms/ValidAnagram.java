package Algorithms;

import java.util.HashMap;

/**
 * Created by kreenamehta on 7/3/16.
 *
 * Given two strings s and t, write a function to determine if t is an anagram of s.

 For example,
 s = "anagram", t = "nagaram", return true.
 s = "rat", t = "car", return false.
 */
public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> sMap = new HashMap<>();
        HashMap<Character,Integer> tMap = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i),sMap.get(s.charAt(i))+1);
            } else {
                sMap.put(s.charAt(i),1);
            }
        }

        for(int i=0;i<t.length();i++){
            if(tMap.containsKey(t.charAt(i))){
                tMap.put(t.charAt(i),tMap.get(t.charAt(i))+1);
            } else {
                tMap.put(t.charAt(i),1);
            }
        }

        if(sMap.size()==tMap.size()){
            if(sMap.size()==0){
                return true;
            }
            for(Character c : sMap.keySet()){
                int cValue = sMap.get(c);
                if(tMap.containsKey(c)){
                    int tValue = tMap.get(c);
                    if(cValue!=tValue){
                        return false;
                    }
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public static void main(String args[]){
        boolean s = isAnagram("rat","car");
        System.out.print(s);
    }
}

