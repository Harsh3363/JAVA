//StringBuilder ->
public class SB {
    public static void main(String[] args) {
        StringBuilder bld = new StringBuilder();
        for (int i =0;i<26;i++){
            char ch = 'a';
            ch = (char) (ch + i);
            bld.append(ch);
        }
        System.out.println(bld.toString());
    }
}
