import java.util.*;
public class onesInBinaryRep {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no for which you want to check ones :");
        int n = sc.nextInt();

        int logvalue = (int)(Math.log(n)/Math.log(2));
        int onesCount = 0;
        for(int i=0;i<=logvalue;i++){
            int bitMask = 1<<i;
            if((bitMask & n) !=0){
                onesCount +=1;
            }
        }
        System.out.println("No of ones = "+onesCount);
    }
}