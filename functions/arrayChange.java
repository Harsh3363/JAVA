//value of array can be changed ->
import  java.util.Arrays;
public class arrayChange {
    public static void main(String[] args) {
        int[] arr = {11,26,51,3};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void change(int[] num) {
         num[2] = 858;
    }
}
