public class selectionSort {
    public static int[] selSort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;

                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
    public static void main(String[]args){
        int []arr={7,9,3,6,1};
        selSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
