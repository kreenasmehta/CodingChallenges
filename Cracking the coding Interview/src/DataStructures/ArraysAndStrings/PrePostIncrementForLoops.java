package DataStructures.ArraysAndStrings;

/**
 * Created by kreenamehta on 7/7/16.
 */
public class PrePostIncrementForLoops {

    public static void main(String args[]){

        for(int i=0 ;i<10;i++){
            System.out.print(i+"|");
        }

        System.out.println();

        for(int i =0;i<10;++i){
            System.out.print(i+"|");
        }
    }
}
