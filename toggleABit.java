import java.util.*;
public class toggleABit {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = 5; // = 0101
        System.out.println("Enter bit to toggle :");
        int bit = sc.nextInt();

        int bitmask = 1<<bit-1;

        if((n&bitmask)==0){     //set
            System.out.println(bitmask | n);
        }else{                  //clear
            System.out.println(~(bitmask)&n);
        }
    }
}
