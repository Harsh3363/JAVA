import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        System.out.println(Arrays.toString(merge_Sort(arr)));
    }

//    int[] is used as the function is returning array ->
     static int[] merge_Sort(int[] arr) {
//        base condition when arr length is 1 return that array as it is ->
        if (arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
//        using copyOfRange to copy array of certain range ->
        int[] left = merge_Sort(Arrays.copyOfRange(arr,0,mid));
        int[] right = merge_Sort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge_s(left,right);
    }

//    this function is taking two arrays as input the first half and the other half ->
     static int[] merge_s(int[] first, int[] second) {

//    below one to store the new merged array ->
         int[] mix = new int[first.length+second.length];

//         these are the pointer pointing each element of the first and second array and after comapring
//         will add to the new array having pointer k
         int i =0;
         int j =0;
         int k =0; //pointer of the new array created

//         this for
         while (i<first.length && j<second.length){
             if (first[i]<second[j]){
                 mix[k] = first[i];
                 i++;
             }else{
                 mix[k] = second[j];
                 j++;
             }k++;
         }
//         this in case the first array is more in length as compared to second simply put all element of
//         first in the new array
         while (i<first.length){
             mix[k]=first[i];
             i++;
             k++;
         }
//         this in case the second array is more in length as compared to first simply put all element of
//         second in the new array
         while (j<second.length){
             mix[k]=second[j];
             j++;
             k++;
         }
        return mix;
    }
}
