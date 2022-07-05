public class p2 {
    public static void main(String[] args) {
        pat2(4);
    }

     static void pat2(int i) {
        for (int row=0;row<i;row++){
            for (int col=0;col<=i;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
