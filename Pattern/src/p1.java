public class p1 {
    public static void main(String[] args) {
        pat(11);
    }

     static void pat(int i) {
        for (int row = 1;row<=i;row++){
            for (int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
