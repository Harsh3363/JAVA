// printing from 1 to n

package recursion2;

public class r2 {
    public static void main(String[] args) {
        p2(5);
    }

     static void p1(int i) {

        if (i==1){
            System.out.println(i);
        }else{
            p1(i-1);
            System.out.println(i);
        }
    }
    static  void p2(int i){
        if (i==0){
            return;
        }else {
            System.out.println(i);
            p2(i-1);
            System.out.println(i);
        }
    }
}
