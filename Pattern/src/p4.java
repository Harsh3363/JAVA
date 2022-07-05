public class p4 {
    public static void main(String[] args) {
        pat4(5);
    }

     static void pat4(int i) {
        for (int row=1;row<=i;row++){
            for (int col=1;col<=row;col++){
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }
}
