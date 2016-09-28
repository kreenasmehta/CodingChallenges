package Arrays;

import java.util.Scanner;

/**
 * Created by kreenamehta on 5/9/16.
 * https://www.hackerrank.com/challenges/arrays-ds
 */
public class ReverseArray {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // length of the array
        int n = input.nextInt();
        // creating array of length n
        int a[] = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = input.nextInt();
        }
        int temp;
        for (int i=0, j=n-1; i<n/2; i++, j--) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
    }

}
