// check palindrome of a number ->
package recursion2;

public class r7 {
    public static void main(String[] args) {
        System.out.println(pal(1231));
    }

     static boolean pal(int i) {
    return  (i==rev(i));
    }

    static int rev(int i) {
        int digits = (int)(Math.log10(i))+1;
        return helper(i,digits);
    }

    static int helper(int i, int digits) {
        if (i%10==i){
            return i;
        }
        int rem = i % 10;
        return (int) ((rem*Math.pow(10,digits-1))+helper(i/10,digits-1));
    }
}
