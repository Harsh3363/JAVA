package static_example;

public class p2 {
    int age;
    String name;
    int salary;
    static boolean eye_present;
    static int num_of_people;

    public p2(int age,String name,int salary){
        this.age = age;
        this.name= name;
        this.salary = salary;
        p2.eye_present = true;
        p2.num_of_people +=1;
    }
}
