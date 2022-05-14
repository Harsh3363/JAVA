import java.util.ArrayList;

public class plusOperator {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a"+1);
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));
        System.out.println("harsh" + new ArrayList<>());
//        System.out.println(56 + new ArrayList<>()); ---> can't use + operator as no string is present
        System.out.println(56 +" " +new ArrayList<>());


    }
}
