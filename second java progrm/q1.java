import java.util.Scanner;

//find largest of three numbers ->
public class q1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        int b = inp.nextInt();
        int c = inp.nextInt();
//    if(a>b && a>c){
//        System.out.println("largest is: " + a);
//    }else if(b>a && b>c){
//        System.out.println("largest is: " + b);
//    }
//    else{
//        System.out.println("largest is: " + c);
        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
