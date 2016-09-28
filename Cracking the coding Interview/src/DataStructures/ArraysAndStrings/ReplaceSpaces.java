package DataStructures.ArraysAndStrings;

/**
 * Created by kreenamehta on 7/7/16.
 */
public class ReplaceSpaces {

    public static String replaceSpaces (String inputString){

        if(inputString==null){
            return null;
        }

        StringBuilder s = new StringBuilder();

        for(int i=0;i<inputString.length();i++){
            if(inputString.charAt(i)==' '){
                s.append("%20");
            } else {
                s.append(inputString.charAt(i));
            }
        }

        return s.toString();
    }

    public static void main(String args[]){
        String x = replaceSpaces(" ");
    }
}
