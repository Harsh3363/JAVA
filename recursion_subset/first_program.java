//java program to remove any particular character from a string

public class first_program {
    public static void main(String[] args) {
        skip("","harsh");
    }

     static void skip(String filltered, String unfilltered) {
        if(unfilltered.isEmpty()){
            System.out.println(filltered);
            return;
        }
        char ch = unfilltered.charAt(0);
        if (ch=='h'){
            skip(filltered,unfilltered.substring(1));
        }else{
            skip(filltered+ch,unfilltered.substring(1));
        }
    }
}
