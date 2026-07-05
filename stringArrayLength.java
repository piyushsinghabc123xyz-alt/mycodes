import java.util.*;

public class stringArrayLength {
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       String array[] = new String[Size];

       for(int i=0;i<size;i++){
            array[i] = sc.next();
       }
        System.out.println(array.length());
    }
}
