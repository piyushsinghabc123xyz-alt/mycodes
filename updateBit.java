import java.util.*;
public class updateBit {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = 5; // = 0101
        System.out.println("Enter bit to update :");
        int bit = sc.nextInt();

        int bitmask = 1<<bit-1;
        System.out.println("Enter which digit you want to update into:");
        int change = sc.nextInt();

        if(change == 1){     //set
            System.out.println(bitmask | n);
        }else{                  //clear
            System.out.println(~(bitmask)&n);
        }
    }
}
