//here the matrix is sorted in row and column manner ->
import java.util.Arrays;

public class sorted_array {
    public static void main(String[] args) {
        int[][] arr = {
                {11,22,33,44},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };
        System.out.println(Arrays.toString(search(arr,98)));
    }
    static int[] search(int[][] matrix,int target){
        int row = 0;
        int col = matrix.length - 1;
        while (row<matrix.length && col>=0){
            if (matrix[row][col]==target){
                return new int[]{row,col};
            }if (matrix[row][col]>target){
                col--;
            }else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
