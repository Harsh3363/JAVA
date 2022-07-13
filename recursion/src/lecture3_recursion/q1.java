// array is sorted or not ->
package lecture3_recursion;

public class q1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(sortt(arr,0));
    }

     static boolean sortt(int[] arr,int index) {
//        base condition:
         if (index == arr.length-1){
             return true;
         }
         return (arr[index]<arr[index+1])&&(sortt(arr,index+1));
    }
}
