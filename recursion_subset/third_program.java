//all possible subsequence using subsets using approach of ignoring and considering once =>

public class third_program {
    public static void main(String[] args) {
        subs("","abc");
    }

     static void subs(String processed, String unprocessed) {
            if(unprocessed.isEmpty()){
                System.out.println(processed);
                return;
            }
            char ch = unprocessed.charAt(0);
            subs(processed+ch,unprocessed.substring(1));
            subs(processed,unprocessed.substring(1));

    }
}
