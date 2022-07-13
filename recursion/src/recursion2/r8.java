// number of zeros in a number ->
package recursion2;

public class r8 {
    public static void main(String[] args) {
        System.out.println(cnt(302040,0));
    }

    private static int cnt(int n,int cont) {
       return helpr(n,0);
    }

     static int helpr(int n, int c) {
        if (n==0){
            return c;
        }
        int rem = n%10;
        if (rem==0){
        return helpr(n/10,c+1);
        }
        return helpr(n/10,c);
    }


}
