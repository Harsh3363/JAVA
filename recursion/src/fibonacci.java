public class fibonacci {
    public static void main(String[] args) {

       int res = fibb(7);
        System.out.println(res);
    }

     static int fibb(int n) {
         if (n < 2 ) {
             return n;
         }
         return  fibb(n - 1) + fibb(n - 2);

     }
}
