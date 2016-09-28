package Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by kreenamehta on 7/2/16.
 */
public class Solution {
    public static List<List<String>> groupStrings(String[] strings) {
        List<List<String>> ans = new ArrayList<>();

        //corner cases
        if (strings.length == 0) {
            return ans;
        }

        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : strings) {
            String key = getKey(str);
            if (map.containsKey(key)) {
                map.get(key).add(str);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            }
        }
        for (List<String> list : map.values()) {
            Collections.sort(list);
            ans.add(list);
        }
        return ans;
    }

    private static String getKey(String str) {
        if (str.length() == 0) {
            return "";
        }
        if (str.length() == 1) {
            return "z";
        }
        char[] chars = str.toCharArray();
        int offset = 'z' - chars[0];
        for (int i = 0; i < chars.length; i++) {
            chars[i] += offset;
            if (chars[i] > 'z') {
                chars[i] -= 26;
            }
        }
        return new String(chars);
    }

    public static void main(String args[]){
        String[] s = {"abc","xyz"};
        List a = groupStrings(s);
    }
}