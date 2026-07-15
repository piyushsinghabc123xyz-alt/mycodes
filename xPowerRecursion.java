public class xPowerRecursion {
    public static int printExpo(int n,int x){
        if(n==0){
            return 1;
        }
        int xpower_nm1 = printExpo(n-1,x);
        int xpower_n = xpower_nm1*x;
        return xpower_n;
    }
    public static void main(String[]args){
        int n = 3;
        int x = 5;
        int ans= printExpo(n, x);
        System.out.println(ans);
    }
}
