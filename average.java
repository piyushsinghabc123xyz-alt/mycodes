package Mycodes;
import java.util.*;

public class average {                                       // Function for average of three integers
    public static double calcAverage(int a,int b,int c){
        return (a+b+c)/3;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(calcAverage(a,b,c));
    }
}
