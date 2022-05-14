//the time complexity will be O(n*n) and each time a new object will be created.
public class Performance {
    public static void main(String[] args) {


    String str = "";
    char ch = 'a';
    for(int i=0;i<26; i++){
        ch = (char)('a' + i);
        str = str +  ch;
    }
    System.out.println(str);
    }
}
