//https://leetcode.com/problems/richest-customer-wealth/
public class max_wealth {
    public static void main(String[] args) {
        int[][] arr = {{2,8,7},
                {7,1,3},
                {1,9,115}};
        int len = arr.length;
        int s = 0;
        int[] sum = new int[len];
        for (int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                 s = s + arr[row][col];
            }
            sum[row] = s;
            s = 0;
        }
        int person = 0;
        int high = sum[0];
        for (int i =0;i<arr.length;i++){
            if (sum[i]>high){
                high = sum[i];
//                person = i+1;
            };
        }
        System.out.println(high);
    }
}
