import java.util.Arrays;

public class search_in_2d {
    public static void main(String[] args) {
        int[][] arr = {
                {21,22,23},
                {31,32,33,502 },
                {41,52,963,478}
        };
        int tar=22;
//      below one to get the index of the element of the 2D array ->
        int[] ans = Search_TwoD(arr,tar);
        System.out.println(Arrays.toString(ans));
//      below one to get the element ->
//      System.out.println(Search_TwoD(arr,tar));
    }
    static int[] Search_TwoD(int[][] arr,int tar){
        if (arr.length==0){
//            using new int[]{index,index} for printing the index of an 2D array
            return new int[]{-1,-1};
        }
        for (int row=0; row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                if (tar==arr[row][col]){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
