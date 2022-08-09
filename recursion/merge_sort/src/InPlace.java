import java.util.Arrays;

public class InPlace {
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
      mergeSortInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSortInPlace(int[] arr,int s,int e){
    if (e-s ==1 ){
        return;
    }
    int mid = (s+e)/2;
    mergeSortInPlace(arr,s,mid);
    mergeSortInPlace(arr,mid,e);
     mergeInPlace(arr,s,mid,e);
    }

    private static void mergeInPlace(int[] arr, int s, int mid, int e) {
        int[] mix= new int[e-s];
        int  i =s;
        int j = mid;
        int k = 0;
        while(i<mid && j<e){
            if (arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }k++;
        }
        while(i<mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        System.arraycopy(mix, 0, arr, s + 0, mix.length);
//        above arraycopy is just making modifications in the original array ->
//        for (int l = 0; l<mix.length; l++){
//            arr[s+l]=mix[l];
//        }
    }
}
