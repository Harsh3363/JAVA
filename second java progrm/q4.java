//reverse of an integer ->
public class q4 {
    public static void main(String[] args) {
        int num = 564548;
        int temp = 0;
        while(num>0){
            temp = num%10 + temp*10;
            num = num / 10;
        }
        System.out.println(temp);
    }
}
