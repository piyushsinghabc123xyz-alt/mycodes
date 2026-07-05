import java.util.*;

public class stringArrayLength {
    public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       String array[] = new String[size];                   // Combined length of all strings in a string array
       int actualLength = 0;
       for(int i=0;i<size;i++){
            array[i] = sc.next();

            actualLength += array[i].length();
       }
        System.out.println(actualLength);
    }
}
