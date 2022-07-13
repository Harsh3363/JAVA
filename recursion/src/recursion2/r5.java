//method 1 for reverse of a numbe ->

package recursion2;

public class r5 {

    static int sum = 0;
    static void rec5(int n) {
        if (n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        rec5(n/10);
    }

    public static void main(String[] args) {
        rec5(54321);
        System.out.println(sum);
    }


}
