import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
//        if (salary>=10){
//            System.out.println(salary + 5);
//        }else{
//            System.out.println(salary + 2);
//        }
        if (num%2==0){
            System.out.println("Weird");
        }else{
            System.out.println("Not Weird");
        }
    }
}
