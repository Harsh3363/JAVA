public class changeString {
    public static void main(String[] args) {
        String name = "Harsh Kanodiya";
        changename(name);
        //can't modify strings ->
        System.out.println(name);
    }

     static void changename(String name) {
        name = "harsh";
    }

}
