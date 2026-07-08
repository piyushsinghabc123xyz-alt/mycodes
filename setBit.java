import java.util.*;

public class setBit {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = 5; //=0101
        System.out.println("Enter pos to be set :");
        int pos = sc.nextInt();

        int bitmask = 1<<pos-1;

        int setResult = bitmask | n;
        System.out.println(setResult);
    }
}
