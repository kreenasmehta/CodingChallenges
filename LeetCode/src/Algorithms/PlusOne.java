package Algorithms;

/**
 * Created by kreenamehta on 6/30/16.
 *
 * Given a non-negative number represented as an array of digits, plus one to the number.

 The digits are stored such that the most significant digit is at the head of the list.
 */
public class PlusOne {


    public static int[] plusOne(int[] digits) {
        int[] newDigits = new int[digits.length+1];
        for(int i=0 ; i<newDigits.length;i++){
            if(i==0){
                newDigits[i]=0;
            } else{
                newDigits[i]=digits[i-1];
            }
        }
        newDigits =  plusOneLogic(newDigits,newDigits.length-1);
        if(newDigits[0]==0){
            for(int i=0;i<digits.length;i++){
                int j = i+1;
                digits[i]=newDigits[j];
            }
            return digits;
        }
        return newDigits;
    }

    private static int[] plusOneLogic(int[] digits, int i){
        if(i>=0){
            if(digits[i]<9){
                digits[i] += 1;
                int[] temp =  digits;
                return temp;
            } else {
                digits[i]=0;
                int[] temp = plusOneLogic(digits,i-1);
                return temp;
            }
        } else{
            return digits;
        }
    }

    public static void main(String args[]){
        int[] digits = {1,0};
        int[] temp = plusOne(digits);
        System.out.println("kfbewkfbkwl");
    }
}
