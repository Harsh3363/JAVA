import java.sql.Array;
import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
    int[] arr = {10,1100,-25,0,-6,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr){
        for (int i=0;i<arr.length - 1;i++){
            for (int j=i+1;j>0;j--){
                if (arr[j]<arr[j-1]){
                    swapp(arr,j);
                }else{
                    break;
                }
            }
        }
    }

     static void swapp(int[] arr, int j) {
        int temp  = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
    }

}
