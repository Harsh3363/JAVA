// in this we are creating an arraylist in each function call ->
package lecture3_recursion;

import java.util.ArrayList;

public class q4 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5};
        System.out.println(rec2(arr,5,0));
    }

     static ArrayList rec2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index==arr.length){
            return list;
        }
        if (arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ans = rec2(arr,target,index+1);
        list.addAll(ans);
        return list;
    }
}
