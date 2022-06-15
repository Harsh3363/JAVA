public class overflow_explain {
        public static void main(String[] args) {
            int m = (1000+Integer.MAX_VALUE)/2;
            System.out.println("normal "+m);
            int n = 1000 + (Integer.MAX_VALUE-1000)/2;
            System.out.println("optimized "+n);

        }
}
