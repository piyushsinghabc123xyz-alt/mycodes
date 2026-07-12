public class insertionSort {
    public static int[] insertionSortAsc(int[]arrr){
        for(int i=1;i<arrr.length;i++){
            int current = arrr[i];
            int j;
            for(j=i-1;j>=0 && (arrr[j]>current);j--){
                arrr[j+1]=arrr[j];
            }
            arrr[j+1]=current;
        }
        return arrr;
    }
    public static void main(String[]args){
        int[]arrr={7,8,3,2,1};
        insertionSortAsc(arrr);
        for(int i=0;i<arrr.length;i++){
            System.out.print(arrr[i]+" ");
        }
        System.out.println();
    }
}