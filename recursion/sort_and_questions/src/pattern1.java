public class pattern1 {
    public static void main(String[] args) {
        star(4,0);
    }

     static void star(int row, int col) {
        if (row<col){
            return;
        }
        if (row>col){
            System.out.print("*");
            star(row,col+1);
        }else{
        System.out.println();
        star(row-1,0);
        }
    }
}
