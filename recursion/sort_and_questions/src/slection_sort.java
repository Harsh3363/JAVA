import java.util.Arrays;

public class slection_sort {
    public static void main(String[] args) {
    int[] arr = {4,3,2,7,8};
    slection(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }

     static void slection(int[] arr, int r, int c, int max) {
        if (r==0){
            return;
        }
        if (c<r){
            if (arr[c]>arr[max]){
                slection(arr,r,c+1,c);
            }else{
                slection(arr,r,c+1,max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1]=temp;
            slection(arr,r-1,0,0);
        }
    }

}
