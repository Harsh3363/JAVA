package recursion2;

public class r4 {
    public static void main(String[] args) {
    int res =  rec4(12829);
        System.out.println(res);
    }

    static int rec4(int n) {
    if (n%10==n){
//        System.out.println(n/10);
//        5455 % 10 = 5 then 5 then 4 then 5
        return n;
    }else{
        return   rec4(n/10)+(n%10);
    }
    }
}
