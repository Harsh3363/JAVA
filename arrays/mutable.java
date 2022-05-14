import java.util.Arrays;

public class mutable {
    public static void main(String[] args) {
        int[] arr = {10,15,26,32};
        System.out.println(Arrays.toString(arr));
        ChangeArr(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void ChangeArr(int[] arr) {
        arr[2] = 454;
    }
}
