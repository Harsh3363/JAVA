// Q3. find smallest letter greater than the target ->
//solution not completed ->
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];
        for (int i=0;i<3;i++){
            arr[i] = (int) sc.next().charAt(0);
        };
        char ch = sc.next().charAt(0);
        int res = ceilchar(arr, (int) ch);
        char ans = (char) res;
        System.out.println(ans);
    }
    static int ceilchar(int[] arr,int tar){
        int start = 0;
        int end = arr.length;
        int mid = 0;
        while(start<=end){
             mid = start + (end-start)/2;
            if (tar>arr[mid]){
                start = mid + 1;
            }else if (tar<arr[mid]){
                end = mid - 1;
            } else{
                if (arr[start]==arr[end]){
                return arr[0];
                }
               return arr[start];
            }
        }
        return arr[start];
    }
}
