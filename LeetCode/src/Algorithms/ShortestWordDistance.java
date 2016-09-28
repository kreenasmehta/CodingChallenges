package Algorithms;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kreenamehta on 6/29/16.
 * Given a list of words and two words word1 and word2, return the shortest distance between these two words in the
 * list.

 For example,
 Assume that words = ["practice", "makes", "perfect", "coding", "makes"].

 Given word1 = “coding”, word2 = “practice”, return 3.
 Given word1 = "makes", word2 = "coding", return 1.

 Note:
 You may assume that word1 does not equal to word2, and word1 and word2 are both in the list.
 */
public class ShortestWordDistance {

    public static int shortestDistance(String[] words, String word1, String word2) {
        List<Integer> word1Positions = new ArrayList<>();
        List<Integer> word2Positions = new ArrayList<>();
        for(int i=0; i< words.length; i++){
            if(words[i]==word1){
                word1Positions.add(i);
            } else if(words[i] == word2){
                word2Positions.add(i);
            }
        }
        int shortestDistance=99999;
        for(Integer word1Position : word1Positions){
            for(Integer word2Position : word2Positions){
                int temp;
                if(word1Position>word2Position){
                    temp = word1Position-word2Position;
                } else {
                    temp = word2Position-word1Position;
                }
                if(temp<shortestDistance){
                    shortestDistance=temp;
                }
            }
        }
        return shortestDistance;
    }

    public static void main(String args[]){
        String[] words1 = {"d","x","a","b","c","d","e"};
        String[] words2 = {"a","b"};
        String word1 = "a";
        String word2 = "d";
        System.out.println(shortestDistance(words2,word1,word2));

    }
}
