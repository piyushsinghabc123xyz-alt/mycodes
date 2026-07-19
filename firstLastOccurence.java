public class firstLastOccurence {
    public static int first = -1;
    public static int last = -1;
    
    public static void occurence(int i, String AB, char charr){
        if(i==AB.length()){
            System.out.println("first = "+first);
            System.out.println("last = "+last);
            return;
        }
        char current = AB.charAt(i);
        if(current==charr){
            if(first == -1){
                first = i;
            }else{
                last = i;
            }
        }
        occurence(i+1, AB, charr);
    }
    public static void main(String[]args){
        String ss = "abahhkdsahaahhjk";
        occurence(0, ss, 'a');
    }
}
