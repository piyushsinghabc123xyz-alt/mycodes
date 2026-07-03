package Mycodes;
import java.util.*;
public class voteeligibility{
    public static boolean isEligible(int age){
        if(age>=18){
            return true;
        }
        else if(0<age && age<18){
            return false;
        }
        else{
            System.out.println("Invalid age!!!");
            return false;
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        boolean eligible = isEligible(age);
        if(eligible){
            System.out.println("You are eligible to vote!!!");
        }
        else{
            System.out.println("You are not eligible for voting!!!");
        }
    }
}