public class q1 {
    public static void main(String[] args) {
        int[] arr = {1,2,14,8,9,12};
        int i = 0;
        System.out.println(sorted(arr,i));
    }

    static boolean sorted(int[] arr, int index){
        if (index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }
}
