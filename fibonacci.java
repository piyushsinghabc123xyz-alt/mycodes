package Mycodes;
import java.util.*;
public class fibonacci {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                             // Fibonacci series upto n terms (n is taken input by the user)
        int a = 0,b = 1;
        System.out.print(a+" ");
        if(n>1){
            for(int i=2;i<=n;i++){
                System.out.print(b+" ");
                int temporary = b;
                b = a+b;
                a = temporary;
            }
            System.out.println();

        }
    }
}
