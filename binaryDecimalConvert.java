import java.util.*;
public class binaryDecimalConvert {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no you to convert :");
        int n= sc.nextInt();

        System.out.println("For DEC to BIN type 1 || For BIN to DEC type 2");
        int p = sc.nextInt();
        String str = "";
        if(p==1){
            String binary = Integer.toBinaryString(n);
            System.out.println("Binary no is : "+ binary);
        }else{
            String st = Integer.toString(n);
            int decimal = Integer.parseInt(st,2);
            System.out.println("decimal no is :"+decimal);
        }
    }
}