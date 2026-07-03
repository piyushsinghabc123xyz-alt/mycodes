package Mycodes;
import java.util.*;
public class factorial {
    public static void printFactorial(int n){
        if (n<0){
            System.out.println("invalid input");
            return;
        }
        int factorial = 1;
        for (int i=n;i>=1;i--){
            factorial = factorial * i;                  // Function for factorial of a no n taken input by the user
        }
        System.out.println(factorial);
    }
    public static void main(String[] args){    
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);
    }
}
