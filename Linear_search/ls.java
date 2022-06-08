import java.util.Scanner;
public class ls {
    public static void main(String[] args) {
    int[] arr = {11,152,541,15};
    int tar = 105;
    boolean res = lsearch(arr,tar);
        System.out.println(res);
    }

    static boolean lsearch(int[] arr, int tar) {
        if (arr.length == 0) {
            return false;
        }
//        enhanced for-loop :
        for (int j : arr) {
            if (j == tar) {
                return true;
            }
//            below is normal for-loop
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] == tar) {
//                    return arr[i];
//                }
        }
        return false;
    }
}
