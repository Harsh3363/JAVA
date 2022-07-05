public class p5 {
    public static void main(String[] args) {
        pat5(5);
    }

     static void pat5(int i) {
    for (int row=0;row<2*i;row++){
        if (row<=i){
            for (int col=1;col<=row;col++){
                System.out.print("* ");
            }
        }else{
            for (int col =1;col<=(2*i-row-1);col++){
                System.out.print("* ");
            }}
        System.out.println();
    }
    }
}
