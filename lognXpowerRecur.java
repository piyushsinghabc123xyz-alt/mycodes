public class lognXpowerRecur {
    public static int printXpow(int x,int n){
        if(n==0){
            return 1;
        }
        if(n % 2 == 0){
            return printXpow(x, n/2) * printXpow(x, n/2);
        }
        else{
            return printXpow(x, n/2) * printXpow(x, n/2)*x;
        }
    }
    public static void main(String[]args){
        int x = 5,n = 3;
        int ans = printXpow(x, n);
        System.out.println(ans);
    }
}
