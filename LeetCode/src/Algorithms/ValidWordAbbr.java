package Algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by kreenamehta on 6/30/16.
 *
 * An abbreviation of a word follows the form <first letter><number><last letter>.
 * <number>It is the number is characters between first and last letter</number>
 */
public class ValidWordAbbr {

    ArrayList<String> wordList = new ArrayList<>();
    ArrayList<String> abbrList = new ArrayList<>();

    public ValidWordAbbr(String[] dictionary) {
        for(int i=0;i<dictionary.length;i++){
            wordList.add(dictionary[i]);
            abbrList.add(createValidWordAbbr(dictionary[i]));
        }
    }

    private static String createValidWordAbbr(String word){
        int length = word.length();
        if(length<2){
            return word;
        }
        String iLength = String.valueOf(word.length()-2);
        return word.charAt(0)+iLength+word.charAt(word.length()-1);
    }

    public boolean isUnique(String word) {
        String wordAbbr = createValidWordAbbr(word);
        int wordCount = 0;
        int abbrCount = 0;
        // If given word is present in the wordList
        // increment teh wordCount
        for(String w : wordList){
            if(w.equals(word)){
                wordCount++;
            }
        }
        // If the wordAbbr is present in the abbrList
        // Increment the abbrCount
        for(String a : abbrList){
            if(a.equals(wordAbbr)){
                abbrCount++;
            }
        }
        /*
        If the given word is already present in the wordList (original dictionary),
        and if the number of occurrences of word match the number of occurrences of the abbrs,
        then the given word is unique.
        */
        if(wordCount>0){
            if(wordCount==abbrCount){
                return true;
            }
        }
        /*
        If the word is not present in the wordList but still the abbrCount > 0, then the given word is not unique.
         */
        else if(abbrCount > 0){
            return false;
        }
        /*
        If the word is not present in the wordList and even the abbrCount == 0, then the given word is unique.
         */
        else if (wordCount==0 && abbrCount == 0){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        String[] dict = {};
        ValidWordAbbr v = new ValidWordAbbr(dict);
        System.out.println(v.isUnique("cat"));
    }
}
