package Mycodes;
import java.util.*;

public class circumference {
    public static double circumferenceCircle(double r){
        return 2*3.14*r;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double r = sc.nextDouble();
        double circumference = circumferenceCircle(r);
        System.out.println("The circumference of the circle is: "+circumference);
    }
}
