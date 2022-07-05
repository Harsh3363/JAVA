public class p3 {
    public static void main(String[] args) {
        pattern3(4);
    }

     static void pattern3(int i) {
        for (int row=1;row<=i;row++){
            for (int col =1;col<=(i-row+1);col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
