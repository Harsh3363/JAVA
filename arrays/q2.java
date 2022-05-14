//max item in an array;
public class q2 {
    public static void main(String[] args) {
        int[] arr = {1,157,2,36,151};
        int ans = latgest(arr);
        System.out.println(ans);
    }

    public static int latgest(int[] arr) {
        int temp = arr[0];
        for (int i=0;i<arr.length;i++){
            if (arr[i]>temp){
                temp = arr[i];

            }
        }
        return temp;
    }
}
