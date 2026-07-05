import java.util.*;

public class GreaterNo {
    public static void greaterNo(int a,int b){                //Function to identify the greater no out of two numbers
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }
        else if(b>a){
            System.out.println(b+" is greater than "+a);
        }
        else{
            System.out.println("Both nos are equal");
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        greaterNo(a,b);
    }
}
