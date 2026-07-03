package Mycodes;
import java.util.*;
public class greatestcommondivisor{
    public static int gcd(int a, int b){
        int i;
        
        if(a<b){
            i=a;
        }else{
            i=b;
        }

        for(i=i;i>=1;i--){
            if( a%i == 0 && b%i == 0)
                return i;
        }
        return i;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("GCD is :"+gcd(a, b));
    }
}