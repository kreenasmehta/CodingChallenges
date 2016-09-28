package Arrays;

import java.util.Scanner;

/**
 * Created by kreenamehta on 5/9/16.
 * https://www.hackerrank.com/challenges/2d-array?h_r=next-challenge&h_v=zen
 */
public class Hourglass {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int maxSum = -99999;
        //System.out.println("enter the length and width of the array (length = width)");
        int n = sc.nextInt();
        // create a 2D array of length and width = n
        int a[][]= new int[n][n];
        // create an array (input)
        for(int i =0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<n; i++) {
            for(int j=0; j<n; j++){
                if(i+2<n && j+2<n){
                    int sum;
                    sum = a[i][j] + a[i][j+1] + a[i] [j+2] + a[i+1][j+1] + a[i+2][j] + a[i+2][j+1] + a[i+2][j+2];
                    if (sum > maxSum){
                        maxSum = sum;
                    }
                }
            }
        }
        System.out.print(maxSum);

    }
}
