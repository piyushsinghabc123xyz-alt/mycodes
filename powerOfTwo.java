import java.util.*;
public class powerOfTwo {
    public static boolean isPowerofTwo(int a){
        if(a <= 0){
            return false;
        }
        int x = (int) (Math.log(a)/Math.log(2));

        return Math.pow(2,x)==a;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(isPowerofTwo(a)){
           System.out.println("Given no is power of two");
        }else{
           System.out.println("Given no is not power of two");
        }
    }
}
