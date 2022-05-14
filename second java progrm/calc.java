import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int res = 0;
        while (true){
            char ch = inp.next().trim().charAt(0);

            if(ch=='+' || ch=='-' || ch=='*' || ch=='/' || ch=='%'){
                int num1 = inp.nextInt();
                int num2 = inp.nextInt();
                if(ch=='+'){
                    res = num1+num2;
                }if(ch=='-'){
                    res = num1-num2;
                }if(ch=='*'){
                    res = num1*num2;
                }if(ch=='/'){
                    if (num2 != '0')
                    res = num1 / num2;
                }if(ch=='%'){
                    res = num1 % num2;
                }
            } else if (ch=='x' || ch=='X') {
                break;
            }else{
                System.out.println("invalid input");
            }
        }
        System.out.println(res);
    }
}
