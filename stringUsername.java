import java.util.*;
public class stringUsername {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Email : ");
        String email = sc.next();                           // string email to username by removing the part after '@'
        String username = "";
        for(int i=0;i<email.length();i++){
            if(email.charAt(i) == '@'){
                break;
            }else{
                username += email.charAt(i);
            }
        }
        System.out.println(username);
    }
}
