import java.util.Scanner;

public class multidArray {
    public static void main(String[] args) {
        int[][] mularr = new int[3][3];
        Scanner in = new Scanner(System.in);
//        System.out.println(mularr.length);
        //for loop for taking the input
        for (int row =0;row<mularr.length;row++){
        for (int col = 0;col<mularr[row].length;col++) {
            mularr[row][col] = in.nextInt();
        };
        };
        //for loop for output ->
//        for (int row =0;row<mularr.length;row++){
//        for (int col = 0;col<mularr[row].length;col++){
//          System.out.print( mularr[row][col] + " ") ;
//        };
//        System.out.println("");
//        };
        //enhanced for loop ->
        for (int[] ints : mularr) {
            for (int col = 0; col < ints.length; col++) {
                System.out.print(ints[col] + " ");
            }
            ;
            System.out.println("");
        }
        //can be replaced by ->
//        for.........
//        System.out.println(Arrays.toString(arr[row));
        ;
    }
}