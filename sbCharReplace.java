import java.util.*;
public class sbCharReplace {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        StringBuilder str = new StringBuilder(st);

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'e'){
                str.setCharAt(i,'i');
            }
        }
        System.out.println(str);
    }
}    