package DataStructures.ArraysAndStrings;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kreenamehta on 7/7/16.
 *
 * 1.6: Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate
 * the image by 90 degrees. Can you do this in place?
 *
 *
 * 1.7: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column is set to 0.
 */
public class RotateMatrix {

    static Scanner sc = new Scanner(System.in);

    // rotate matrix by 90 degrees
    public static int[][] rotateMatrix(int[][] matrix){

        int[][] rotatedMatrix = new int[matrix.length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix.length;j++){
                rotatedMatrix[j][matrix.length-1-i] = matrix[i][j];
            }
        }
        return rotatedMatrix;
    }

    public static int[][] rotateMatrixInPlace(int[][] matrix){

        for(int layer=0;layer<matrix.length/2;layer++){
            int first = layer;
            int last = matrix.length-1-layer;

            for(int i=first;i<last;i++){
                int offset=i-first;
                int top= matrix[first][i];

                matrix[first][i]=matrix[last-offset][first];
                matrix[last-offset][first]=matrix[last][last-offset];
                matrix[last][last-offset]=matrix[i][last];
                matrix[i][last]=top;
            }
        }
        return matrix;
    }

    // print the given matrix
    public static void printMatrix(int[][] matrix){

        for(int i = 0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    // create a NxN matrix of the given size
    public static int[][] createMatrix(int size){
        int[][] matrix = new int[size][size];
        for(int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                System.out.println("Give input for index: ["+i+"]["+j+"]");
                matrix[i][j]=sc.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] setZeroMatrix (int[][] matrix){
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix.length;j++){
                if(row.contains(i)||col.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }

        return matrix;
    }

    public static void main(String args[]){

        System.out.println("Input the matrix size.");
        int size = sc.nextInt();
        int[][] matrix = createMatrix(size);
        printMatrix(matrix);
//        System.out.println("--------------------------------");
//        int[][] rotatedMatrix = rotateMatrix(matrix);
//        printMatrix(rotatedMatrix);
//        System.out.println("--------------------------------");
//        int[][] x = rotateMatrixInPlace(matrix);
//        printMatrix(x);
        System.out.println("--------------------------------");
        int[][] y = setZeroMatrix(matrix);
        printMatrix(y);

    }
}
