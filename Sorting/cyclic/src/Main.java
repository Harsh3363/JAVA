import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        String sl="";
        String str="";
            for(int j=0;j<3;j++){
        sl= sc.nextLine();
        int x=sc.nextInt();
        int Scount = 0;
        //Complete this lines2
        for(int i = 0; i < sl.length(); i++) {
            if(sl.charAt(i) != ' ')
                Scount++;
        }
        if(Scount>10){
            sl = sl.substring(0,9);
        };
        int count = 0;
        while(x!=0){
            x = x/10;
            count++;
        }
        if(count<=2){
            str = String.format("%03d", x);
        }else{
            str = Integer.toString(x);
        }

            }
        System.out.println("================================");
        System.out.print(sl + " ");
        System.out.print(str);
    }
}



