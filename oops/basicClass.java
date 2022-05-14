import java.util.Scanner;

public class basicClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int h = in.nextInt();
        if (b>=0 && h>=0){
            System.out.println(b*h);
        }else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
