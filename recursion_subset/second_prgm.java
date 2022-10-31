//removing any particular character from a string
//2nd approach =>

public class second_prgm {
    public static void main(String[] args) {
        System.out.println(skiiped("harsh"));
    }

     static String skiiped(String str) {
        if (str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if (ch=='h'){
            return skiiped(str.substring(1));
        }
        else{
            return ch+skiiped(str.substring(1));
        }
    }
}
