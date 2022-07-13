package lecture3_recursion;

import java.util.ArrayList;

public class q3 {
    public static void main(String[] args) {
    int[] arr = {1,2,3,4,4,8};
   System.out.println(pat1(arr,9,0,new ArrayList<> ()));
    }

     static ArrayList<Integer> pat1(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index==arr.length){
           return list;
        }
        if (arr[index]==target){
            list.add(index);
        }return pat1(arr,target,index+1,list);

    }

}
