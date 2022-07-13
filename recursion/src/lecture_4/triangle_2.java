package lecture_4;

public class triangle_2 {
    public static void main(String[] args) {
        tri(0,4);
    }
    static void tri(int col,int row){
//        base condition ->
        if (row==0){
            return;
        }
        if (col<row){

            tri(col+1,row);
            System.out.print("*" + " ");

        }
        else{
//            for new line after finishing one row ->

            tri(0,row-1);
            System.out.println();
        }
    }
}
