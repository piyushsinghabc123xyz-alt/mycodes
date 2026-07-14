public class factorialRecursion {
    public static void printFactorial(int n,int mult,int i){
        if(n==0){
            System.out.println("1");
            return;
        }
        else if(i==n){
            mult= mult*i;
            System.out.println(mult);
            return;
        }
        mult = mult*i;
        printFactorial(n, mult, i+1);
    }
    public static void main(String[]main){
        int n = 0;
        printFactorial(n,1,1);
    }
}
