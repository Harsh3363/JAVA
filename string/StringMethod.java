import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {
        String name = "Harsh kanodoiya";
        System.out.println(Arrays.toString(name.toCharArray()));
        //will create new object as TSrings as immutable ->
        System.out.println(name.toLowerCase());
        //name remains as it was ->
        System.out.println(name);
        System.out.println("  harsh   ".strip());
        // will cut name into 2 array elements between " " as specified ->
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
