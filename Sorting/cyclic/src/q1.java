import java.util.Arrays;

//Approach -> sort the array and as soon as u find a number not at the index then that will be your answer
// in {0,2,3,4} 1 is missing here so sorted array -> {0,2,3,4} now while going through the array you fund
// i = 1 is not having i = 1 as value hence answer is 1.

//leetcode -> missing number
 class q1 {

    public static void main(String[] args) {
        int[] arr = {0,2,3,4};
        System.out.println(cycle(arr));
    }
         public static int cycle(int[] arr) {
//        sorting the array ->
            int i = 0;
            while(i<arr.length){
                int val = arr[i];
                if (arr[i]<arr.length && arr[i]!=arr[val]){
                    swapp(arr,i,val);
                }else{
                    i++;
                }
            }
//            searching for the element ->
            for (int j=0;j<arr.length;j++){
                if (arr[j] != j){
                    return  j;
                }
        };
            return arr.length;
    }


    static void swapp(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    };
}
