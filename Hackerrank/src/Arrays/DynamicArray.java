package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by kreenamehta on 5/9/16.
 * https://www.hackerrank.com/challenges/dynamic-array?h_r=next-challenge&h_v=zen
 */
public class DynamicArray {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // n = number of sequences
        int n = sc.nextInt();
        // numQueries = number of queries
        int numQueries = sc.nextInt();
        // lastAns
        int lastAns = 0;
        // creating a list of n arrays with size n
        List<ArrayList<Integer>> seqList = new ArrayList<>();
        for(int i = 0; i<n; i++) {
            seqList.add(new ArrayList<Integer>());
        }
        // take input of queries
        for (int i=0; i<numQueries; i++){
            int queryNum = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (queryNum == 1) {
                int xor_result = x ^ lastAns;
                int index = xor_result%n;
                ArrayList<Integer> seq = seqList.get(index);
                seq.add(y);

            }
            else if (queryNum == 2){
                int xor_result = x ^ lastAns;
                int index = xor_result%n;
                ArrayList<Integer> seq = seqList.get(index);
                int size = seq.size();
                int element = y % size;
                int value = seq.get(element);
                lastAns = value;
                System.out.println(lastAns);
            }
        }
    }
}
