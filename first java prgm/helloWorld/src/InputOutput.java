import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your roll number: ");
        int rollNo = input.nextInt();
        System.out.println("Your roll number is  " + rollNo);
    }
}
