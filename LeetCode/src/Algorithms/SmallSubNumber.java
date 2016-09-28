package Algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kreenamehta on 7/3/16.
 *
 * Eg: input: 2345
 *
 * iterations: (compare two adjacent numbers and select the greater number and append to the rest if the digits)
 * 1: 345
 * 2: 245
 * 3: 235
 *
 */
public class SmallSubNumber {

    public static int solution(int X){
        // write your code in Java SE 8

        // if the number is single digit, return the input number
        if(X <= 9){
            return X;
        }

        // number of digits in the given number
        int numberLength = Integer.toString(X).length();
        // array
        int[] numberArray = new int[numberLength];
        for(int i=0;i<numberLength;i++){
            numberArray[i]=X%10;
            X=X/10;
        }
        //each digit of the number is represent into each index of an array
        for(int i=0,j=numberLength-1;i<numberLength/2;i++,j--){
            int temp = numberArray[i];
            numberArray[i]=numberArray[j];
            numberArray[j]=temp;
        }

        // newList of the numbers generated after selecting the greater of the adjacent numbers in each iteration
        List<Integer> newList = new ArrayList<>();

        // j and k are indices of the two numbers between whom the larger number is selected
        for(int j=0,k=j+1;k<=numberArray.length-1;j++,k++){
            int[] newNumberArray = new int[numberArray.length-1];
            int l = 0;
            for(int i=0;i<numberArray.length;i++){
                // if i==j, select the number at j or k whichever is greater
                if(i==j){
                    if(numberArray[j]>numberArray[k]){
                        newNumberArray[l]=numberArray[j];
                        i++;
                    } else {
                        newNumberArray[l]=numberArray[k];
                        i++;
                    }
                }
                // else select the number at i as it is
                else{
                    newNumberArray[l]=numberArray[i];
                }
                l++;
            }
            // converting an array of digits into an Integer number
            int newNum = 0;
            for(int n=0;n<newNumberArray.length;n++){
                int a = newNumberArray[n];
                int b = ((newNumberArray.length-1)-n);
                int c = (int)Math.pow(10,b);
                newNum += a*c;
            }
            // adding a new number to the list
            newList.add(newNum);
        }

        // set min to the maximum integer value
        int min = Integer.MAX_VALUE;
        for(Integer i : newList){
            if(i<min){
                min=i;
            }
        }
        // return minimum of all the integers added to the list
        return min;

    }

    public static void main(String args[]){
        int x = solution(233614);
        System.out.println(x);
    }
}
