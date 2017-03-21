package Algorithms;

import java.util.Scanner;

/**
 * Created by kreenamehta on 3/21/17.
 *
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

 Given two integers x and y, calculate the Hamming distance.

 Note:
 0 ≤ x, y < 231.

 Example:
 Input: x = 1, y = 4

 Output: 2

 Explanation:
 1   (0 0 0 1)
 4   (0 1 0 0)
 ↑   ↑

 The above arrows point to positions where the corresponding bits are different.

 Refer: http://classroom.synonym.com/calculate-hamming-distance-2656.html
 */
public class HammingDistance {

    /**
     * get the binary string of the given number
     * @param x
     * @return
     */
    public static String getBinaryValue(int x){
        String binary = "";
        if(x==0){
            return "0";
        }
        while (x>0){
            binary = (x%2)+binary;
            x = x/2;
        }
        return binary;
    }

    /**
     * get the hamming distance
     * @param x
     * @param y
     * @return
     */
    public static int hammingDistance(int x, int y){
        int hammingDistance = 0;
        // Convert both the input numbers into binary string
        String binX = getBinaryValue(x);
        String binY = getBinaryValue(y);
        int lengthDelta = binX.length() - binY.length();
        // make both the string of equal lengths by appending extra 0s to the string with shorter length
        while (lengthDelta<0){
            binX = "0" + binX;
            lengthDelta++;
        }
        while (lengthDelta>0){
            binY = "0" + binY;
            lengthDelta--;
        }
        // if char at i of both strings is not equal then add 1 to the hamming distance, else nothing
        for(int i =0;i<binX.length();i++){
            if(binX.charAt(i)!=binY.charAt(i)){
                hammingDistance++;
            }
        }

        return hammingDistance;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for x.");
        int x = sc.nextInt();
        System.out.println("Enter value for y.");
        int y = sc.nextInt();
        System.out.println(hammingDistance(x, y));
    }




}
