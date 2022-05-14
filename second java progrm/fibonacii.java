import java.util.Scanner;

//nth fibonacci number ->
public class fibonacii {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = 0;
    int c = 1;
    int count = 2;

    while(count<=a){
        int temp = c;
        c = c + b;
        b = temp;
        count++;
    }
    System.out.println(c);
    }

}
