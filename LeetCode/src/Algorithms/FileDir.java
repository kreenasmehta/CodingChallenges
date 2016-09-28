package Algorithms;

/**
 * Created by kreenamehta on 7/4/16.
 */
public class FileDir {

    public static int solution(String S) {
        // write your code in Java SE 8

        StringBuilder result = new StringBuilder();
        StringBuilder extension = new StringBuilder();

        for(int i=0;i<S.length();i++){
            int countSpaces = 0;
            if(S.charAt(i)=='\n'){
                result.append('/');
            }else if(S.charAt(i)=='\t'){
                countSpaces++;
            } else{
                result.append(S.charAt(i));
            }


            System.out.println(result);
        }



        return 1;
    }

    public static void main(String args[]){
        String a = "dir1\n\tdir11\n\tdir12\n\t\tpicture.jpeg";
        StringBuilder b = new StringBuilder();
        b.append('d');
        b.append('r');
        b.append(a);
        //System.out.println(b);
        int x = solution(a);
    }
}
