import java.util.*;
public class stringInReverse {
    public static String revers(int n,int i, String AA, String AB){
        if(i==n-1){
            AB += AA.charAt(i);
            return AB;
        }
        String AAm1 = revers(n,i+1, AA, AB);
        AB = AAm1 + AA.charAt(i);
        return AB;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String inputt = sc.next();
        int n = inputt.length();
        String ABC = revers(n, 0, inputt,"");
        System.out.println(ABC);
    }
}
