import java.util.Scanner;
//check whether the input is upper case or lower case ->
public class caseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        if (ch>='a' && ch<= 'z'){
            System.out.println("lower case");

        } else if (ch>='A' && ch<= 'Z') {
            System.out.println("Upper case");
        }else{
            System.out.println("invalid");
        }
    }
}
