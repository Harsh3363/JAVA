import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {51,4,3,2,1};
        bub_sort( arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

     static void bub_sort(int[] arr, int row, int col) {
        if (row==0){
            return;
        }
        if (col<row){
            if (arr[col]>arr[col+1]){
                int temp = arr[col];
                arr[col] = arr[col+1];
                arr[col+1] = temp;
            }
            bub_sort(arr,row,col+1);
        }else{
            bub_sort(arr,row-1,0);
        }
    }
}
