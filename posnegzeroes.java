import java.util.*;
public class posnegzeroes {
    public static void main(String[]args){
        int positive=0,negative=0,zeroes=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1 to take input or 0 to stop");       // Code to take input till user want and return how many inputs were +ve,-ve and 0
        int input = sc.nextInt();
        while(input==1){
            System.out.println("Enter your no:");
            int no = sc.nextInt();
            if(no>0){
                positive++;
            }else if(no<0){
                negative++;
            }else{
                zeroes++;
            }
            System.out.println("Enter 1 to take input or 0 to stop");
            input = sc.nextInt();
        }
        System.out.println("Positive Nos: "+positive );
        System.out.println("Negative Nos: "+negative);
        System.out.println("Zeroes: "+zeroes);
    }
}
