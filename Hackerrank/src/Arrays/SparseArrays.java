package Arrays;

import java.util.Scanner;

/**
 * Created by kreenamehta on 5/9/16.
 * https://www.hackerrank.com/challenges/sparse-arrays
 */
public class SparseArrays {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // number of input streams
        int n = sc.nextInt();
        String inputStrings[] = new String[n];
        for (int i=0; i<n; i++){
            inputStrings[i] = sc.next();
        }
//        for (int i=0; i<n; i++){
//            System.out.println(inputStrings[i]);
//        }
        // number of queries
        int q = sc.nextInt();
        String queryStrings[] = new String[q];
        for (int i=0; i<q; i++){
            queryStrings[i] = sc.next();
        }
        // create a counter
        int count;
        // traverse through queryString
        for (int i=0; i<q; i++){
            String currentQueryString = queryStrings[i];
            // initialize the counter to 0
            count = 0;
            // for currentQueryString loop through the inputStrings
            for (int j=0; j<n; j++){
                String currentInputString = inputStrings[j];
                if (currentQueryString.equals(currentInputString)) {
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
