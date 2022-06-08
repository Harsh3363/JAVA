//searching in a string
public class search_In_String {
    public static void main(String[] args) {
    String str = "Harsh";
    char tar = 'u';
    boolean res = search(str,tar);
        System.out.println(res);
    }
    static boolean search(String str,char tar){
//        in integer length is a variable while in string length() is a function ->
        if (str.length() == 0){
            return  false;
        }
//        ****************** normal for loop ->
//        for (int i = 0; i < str.length(); i++){
//            if (tar == str.charAt(i)) {
//                return true;
//            }
//        ******************  Using for each loop,for that we need an array so converted the string into a array ->
        for (char ch : str.toCharArray() ){
        if (ch == tar){
            return  true;
        }
        }
        return  false;
    }
}
