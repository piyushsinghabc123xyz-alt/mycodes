import java.util.*;

public class matrixSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter no of columns");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];                    // Searching an element in matrix and returning its index

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter element to search :");
        int x = sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==x){
                    i=i+1;
                    j=j+1;
                    System.out.println("The given element is present at: " + i + " row and " + j + " column");
                }
            }
        }
    }
}
