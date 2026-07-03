package Mycodes;
import java.util.*;

public class ArrayAssending {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int nos[] = new int[size];

        for(int i=0;i<nos.length;i++){
            nos[i] = sc.nextInt();
        }
        boolean isAscending = true;

        for(int i=0;i<nos.length-1;i++){
            if(nos[i]>nos[i+1]){
                isAscending = false;
            }
        }
        if(isAscending){
            System.out.println("The array is in Ascending order");
        }
        else{
            System.out.println("The array is NOT !!! in Ascending order");
        }
    }
}
