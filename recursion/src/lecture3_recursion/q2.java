package lecture3_recursion;

public class q2 {
    public static void main(String[] args) {
    int[] arr = {11,2,221,15,1};
        System.out.println(pat(arr,0,1));
    }

     static boolean pat(int[] arr, int i,int target) {
        if (i>=arr.length){
            return false;
        }
        return (arr[i]==target) || pat(arr,i+1,target);
    }

}
