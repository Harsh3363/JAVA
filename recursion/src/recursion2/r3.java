package recursion2;

public class r3 {
    public static void main(String[] args) {
       int res =  fac(5);
        System.out.println(res);
    }

     static int fac(int i) {
    if (i<=1){
        return 1;
    }else{
       return i*fac(i-1);
    }
    }
}
