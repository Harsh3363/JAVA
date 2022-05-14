public class objects {
    public static void main(String[] args) {
        //will return true as object is one and both vars are pointing to same object ->
//        String a = "Harsh";
//        String b = "Harsh";
//        System.out.println(a==b);
//        a == b can also be written as if we only want to check the values ->
//        System.out.println(a.equals(b));

        //will return false as both are having individual objects ->
        String a = new String("harsh");
        String b = new String("harsh");
//        -> will give false
        System.out.println(a==b);
//        System.out.println(a.equals(b)); -> will give true as it only checks the value
    }
}
