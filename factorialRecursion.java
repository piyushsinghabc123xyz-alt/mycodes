public class factorialRecursion {
    public static int printFactorial(int n){
        if(n==1 ||n==0){
            return 1;
        }
        int fact_nm1 = printFactorial(n-1);
        int fact_n = fact_nm1*n;
        return fact_n;
    }
    public static void main(String[]args){
        int n = 5;
        int factorial = printFactorial(n);
        System.out.println(factorial);
    }
}
