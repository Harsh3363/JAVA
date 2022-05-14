import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        System.out.println(arm(n));
    }

     static boolean arm(int n) {
        int org = n;
         int sum = 0;
         while (n > 0) {
             int temp = n % 10;
             n = n / 10;
             sum = sum + temp*temp*temp;
         }

         return (sum == org);
     }
}
