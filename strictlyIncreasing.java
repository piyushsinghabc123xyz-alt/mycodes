public class strictlyIncreasing {
    public static boolean increase(int i,int[]arr){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]<arr[i+1]){
            return increase(i+1, arr);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        System.out.println(increase(0, arr));
    }
}
