//Swapping ->
import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        swap(arr,0,3);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr , int i1 ,int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
