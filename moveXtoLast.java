public class moveXtoLast {
    public static void moveX(int i, int count,String str, String newstr){
        if(i==str.length()){
            for(int j=0;j<count;j++){
                newstr+='x';
            }
            System.out.println(newstr);
            return;
        }
        char current=str.charAt(i);
        if(current!='x'){
            newstr += current;
            moveX(i+1, count, str, newstr);
        }else{
            count++;
            moveX(i+1, count, str, newstr);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        moveX(0, 0, str, "");    
    }
}
