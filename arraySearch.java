package Mycodes;
import java.util.*;

public class arraySearch {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array:");
        int size = sc.nextInt();        
        int numbers[]= new int[size];

        System.out.println("Enter elements of array one by one :");       // **** LINEAR SEARCH ****  (Searching a given element in array)
        for(int i=0;i<numbers.length;i++){
            numbers [i] = sc.nextInt();
        }
        System.out.println("Enter element whose location to find:");
        int x = sc.nextInt();

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==x){
                System.out.println(x+" is present at index "+i);
            }
        }
    }
}
