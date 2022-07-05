public class num_ex_recursion {
    public static void main(String[] args) {
        int n = 1;
        prnt1(n);
    }

     static void prnt1(int n) {
    if (n==5){
        System.out.println(n);
        return;
    }
         System.out.println(n);
    prnt1(n+1);

    }
}
