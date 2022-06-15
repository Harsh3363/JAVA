public class order_agnostic {
    public static void main(String[] args) {
//        int[] arr = {-8, -5, -2, 0, 5, 31, 65, 125, 955};
        int[] arr1 = {955, 254, 151, 24, 15, -1};
        int target = 24;
        int ans = agnostic(arr1, target);

        System.out.println(ans);
    }

    static int agnostic(int[] arr, int target) {
        int start = 0;
        int end = (arr.length - 1);
        boolean isAsc = (arr[start] < arr[end]);
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
        return -1;
    }
}
