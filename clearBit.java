import java.util.*;
public class clearBit {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = 5; //=0101
        System.out.println("Enter pos to clear :");
        int pos = sc.nextInt();

        int bitmask = 1<<pos-1;

        int clearResult = n & ~(bitmask);
        System.out.println(clearResult);
    }
}
