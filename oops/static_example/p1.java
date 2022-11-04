package static_example;

//though we are using p2.java's class in this still we dont need to import that as both are present in the same package


public class p1 {
    public static void main(String[] args) {
        p2 harsh = new p2(21,"harsh",100);
        p2 vani = new p2(12,"vani",10000);
        p2 raghav = new p2(12,"raghav",10000);

        System.out.println(vani.name);
        System.out.println(vani.num_of_people);
    }

}
