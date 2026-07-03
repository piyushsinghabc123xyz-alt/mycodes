package Mycodes;
import java.util.*;
public class matrixTranspose {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter no of columns:");
        int columns = sc.nextInt();
        int[][]matrix = new int [rows][columns];
        System.out.println("Enter elements of matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j] = sc.nextInt();                       // Transpose of a Matrix
            }
        }
        System.out.println("Transpose of the matrix is :::");
        for(int j=0;j<columns;j++){
            for(int i=0;i<rows;i++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
