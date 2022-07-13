// number of steps leetcode question ->
//given -> tell number of steps req to make number 0 if num is even divide by 2 if odd subtract 1 from it
package recursion2;

public class r9 {
    public static void main(String[] args) {
        System.out.println(recc(123,0));
    }

     static int recc(int n,int c) {
        return helperf(n,0);
    }

     static int helperf(int n, int i) {
        if (n==0){
            return i;
        }
        int rem = n%2;
        if (rem==0){
        return  helperf(n/2,i+1);
        }
        return helperf(n-1,i+1);
    }
}
