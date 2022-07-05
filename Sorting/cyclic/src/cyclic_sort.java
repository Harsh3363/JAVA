import java.util.Arrays;

public class cyclic_sort {
    public static void main(String[] args) {
        int[] arr = {6,8,9,10,4,2,3,5,7,1};
        cycle(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void cycle(int[] arr) {
    int i = 0;
    while (i<arr.length){
        int correct_index = arr[i]-1;
        if (arr[i]!=arr[correct_index]){
            swapp(arr,i,correct_index);
        }else{
        i++;}
    }
    };


    static void swapp(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    };
}
