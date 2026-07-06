import java.util.*;
public class getBit {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = 6;  //=0110
        System.out.println("Enter bit to check:");
        int bit = sc.nextInt();

        int bitMask = 1 << bit-1;

        if((bitMask & n) == 0){
            System.out.println("0 is at "+ bit+" bit");
        }else{
            System.out.println("1 is present at "+bit+" bit");
        }
    }
}
