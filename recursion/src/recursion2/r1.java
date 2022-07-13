// printing n to 1
package recursion2;

public class r1 {
    public static void main(String[] args) {
    rec(5);
    }

     static void rec(int i) {
        if (i==1){
            System.out.println(i);
        }else{
            System.out.println(i);
            rec(i-1);

        }
         }


}
