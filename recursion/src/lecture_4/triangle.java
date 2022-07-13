package lecture_4;

public class triangle {
    public static void main(String[] args) {
        tri(0,4);
    }
    static void tri(int col,int row){
//        base condition ->
        if (row==0){
            return;
        }
        if (col<row){
            System.out.print("*" + " ");
            tri(col+1,row);
        }
        else{
//            for new line after finishing one row ->
            System.out.println();
            tri(0,row-1);
        }
    }

}
