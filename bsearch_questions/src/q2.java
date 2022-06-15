// floor of any number ->
//floor is largest number smaller then equal to the target
public class q2 {
    public static void main(String[] args) {
        int[] arr = {-8, -5, -2, 0, 5, 31, 65, 125, 955};
        int[] arr1 = {955,564,152,15,1,-1,-8};
        int target = -10;
        int ans = agnostic(arr, target);

        System.out.println(ans);
    }

    static int agnostic(int[] arr, int target) {
        int start = 0;
        int end = (arr.length - 1);
//        isAsc checks for the ascending order of the array ->
        boolean isAsc = (arr[start] < arr[end]);

//        case when target is smaller than the smallest number i.e., the first element in the array ->
        if (isAsc){
            if (target<arr[start]){
                return -1;
            }}else{if(target<arr[end]){
            return -1;
        }}


        while (start <= end) {


            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        if (isAsc){
        return arr[end];
        }else{
            return arr[start];
        }
    }
}
