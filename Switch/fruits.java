import java.util.Scanner;

public class fruits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inp = in.next();
        switch (inp) {
            case "Apple" -> System.out.println("bkws fruit");
            case "orange" -> System.out.println("thik thak fruit");
            case "grapes" -> System.out.println("bdhiya fruit");
            default -> System.out.println("enter valid fruit name");
        }
    }
}
