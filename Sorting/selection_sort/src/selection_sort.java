import java.util.Arrays;

public class selection_sort {
//   having the array to sort and printing statement ->
    public static void main(String[] args) {
        int[] arr = {10,5,0,2263,212};
//    selction is the function build for the sort ->
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
// this function goes through the whole array and pick the last item in the array
    public static void selection(int[] arr) {
        for (int i =0;i<arr.length;i++){
            int last = arr.length - i - 1;
//      in this it call the getMaxindex function ot get to now the maximum value element present inside the array ->
        int maxItem = getMaxindex(arr,0,last);
//      this swap function swaps the maximum element found using above function and swaps its position ->
        swap(arr,maxItem,last);
        }
    }

     static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
     }

     static int getMaxindex(int[] arr, int start, int last) {
    int max = start;
    for (int i = start;i<=last;i++){
            if (arr[max]<arr[i]){
                max = i;
            }
    }
    return max;
    }
}
