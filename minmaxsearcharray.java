package Mycodes;
import java.util.*;

public class minmaxsearcharray {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array:");
        
        int size = sc.nextInt();
        int numbers[]= new int[size];

        System.out.println("Enter elements of array one by one :");       // Identifying the min and max no of an array
        
        for(int i=0;i<numbers.length;i++){
            numbers [i] = sc.nextInt();
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<min){
                min=numbers[i];
            }
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("Min of the array is: "+min);
        System.out.println("Max of the array is: "+max);
    }
}
