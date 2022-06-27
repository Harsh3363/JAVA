import java.sql.Array;
import java.util.*;
public class bub_sort {
    public static void main(String[] args) {
        int[] arr = {1,2,3,400,50,61};
        boolean swapped = false;
        for (int i =0;i<arr.length;i++){
            for (int j=1;j<(arr.length-i);j++){
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
//            this is to check in case the array is already sorted then there won't be any swapping when the
//            i=0 so then no point of checking when i=1 so it will break.
//            this sout is for checking how manny time that i loop ran ->
            System.out.println(i);
            if(!swapped){
                break;
            };
        }

            System.out.print(Arrays.toString(arr));

    }
}
