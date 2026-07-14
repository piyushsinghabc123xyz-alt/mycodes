public class sumOfNaturalNos {
    public static void printSum(int n,int sum,int i){
        if(i==n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(n, sum, i+1);
        
    }
    public static void main(String[]args){
        int n = 5 ;
        printSum(n, 0, 1);
    }
}
