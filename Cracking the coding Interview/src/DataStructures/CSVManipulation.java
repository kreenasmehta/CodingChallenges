package DataStructures;

/**
 * Created by kreenamehta on 8/17/16.
 */
public class CSVManipulation {

    public static void main(String args[]){

        // create an array that will hold the counts for 256 record (when pixels == 0)
        int[] countZero = new int[256];

        // read each record and save it in an array of size 256
        for(int record = 1; record <= 50000; record++){
            // read the file record form the CSV file and store it in an array
            int[] recordArr = new int[256];
            // match this record against 256 rule generated
            for(int i=0;i<=255;i++){
                if (recordArr[i]==0){
                    countZero[i]++;
                }
            }
        }
    }
}
