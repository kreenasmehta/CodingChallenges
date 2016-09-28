package Algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kreenamehta on 6/29/16.
 * You are playing the following Flip Game with your friend: Given a string that contains only these two characters:
 * + and -, you and your friend take turns to flip two consecutive "++" into "--".
 * The game ends when a person can no longer make a move and therefore the other person will be the winner.

 Write a function to compute all possible states of the string after one valid move.
 */
public class FlipGame {

    public static List<String> generatePossibleNextMoves(String s) {
        List<String> validStates = new ArrayList<>();
        char[] stringArray = s.toCharArray();
        for(int i=0; i<stringArray.length-1; i++){
            if(stringArray[i] == '+' && stringArray[i+1] == '+'){
                stringArray[i] = '-';
                stringArray[i+1] = '-';
                validStates.add(String.valueOf(stringArray));
                stringArray[i] = '+';
                stringArray[i+1] = '+';
            }
        }
        return validStates;
    }

    public static void main(String args[]){
        List<String> validStates = generatePossibleNextMoves("++++");
        for(String validState : validStates){
            System.out.println(validState);
        }
    }
}
