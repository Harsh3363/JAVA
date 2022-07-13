package lecture_4;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bub(arr,arr.length-1,0);
        System.out.print(Arrays.toString(arr));
    }

     static void bub(int[] arr, int r, int c) {
        if (r==0){
            return;
        }
        if (c<r){
            if (arr[c]>arr[c+1]){
//                swap ->
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bub(arr,r,c+1);
        }
        else {
            bub(arr,r-1,0);
        }
    }
}
