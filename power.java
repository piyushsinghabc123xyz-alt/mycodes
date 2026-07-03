package Mycodes;
import java.util.*;
public class power{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base no:");
        int base = sc.nextInt();
        System.out.println("Enter the power no:");
        int power = sc.nextInt();
        int x = 1;
        for(int i=1;i<=power;i++){
            x = x*base;
        }
        System.out.println("Answer "+x);
    }
}