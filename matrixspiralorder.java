package Mycodes;
import java.util.*;
public class matrixspiralorder{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int rows = sc.nextInt();
        System.out.println("Enetr no of columns");
        int columns = sc.nextInt();
        
        int[][]matrix = new int[rows][columns];
        System.out.println("Enter elements of matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("The Matrix is :::");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("The spiral order matrix is:");
        int rowstart = 0;
        int rowend = rows-1;
        int colstart = 0;
        int colend = columns-1;

        while(rowstart<=rowend && colstart<=colend){
            for(int i=colstart;i<=colend;i++){
                System.out.print(matrix[rowstart][i] + " ");
            }
            rowstart++;
            for(int i=rowstart;i<=rowend;i++){
                System.out.print(matrix[i][colend] + " ");
            }
            colend--;
            for(int i=colend;i>=colstart;i--){
                System.out.print(matrix[rowend][i]+ " ");
            }
            rowend--;
            for(int i=rowend;i>=rowstart;i--){
                System.out.print(matrix[i][colstart] + " ");
            }
            colstart++;
        }
        System.out.println();
    }
}
