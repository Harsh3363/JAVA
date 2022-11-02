public class p1{
    public static void main(String[] args) {

        class Student{ int roll; float marks; String name;

            Student(){}
            Student( int roll, float marks, String name){
                this.roll = roll;
                this.marks = marks;
                this.name = name;
            }

            Student( int roll,float markssssss){
               this.roll = roll;
                marks = markssssss;
            }

            Student( Student other){
               this.roll = other.roll;
                this.marks = other.marks;
            }
        }

        Student harsh = new Student();
        System.out.println(harsh.roll);
        System.out.println(harsh.marks);
        System.out.println(harsh.name);

        Student VANI = new Student(15,20.5f,"vani");
        System.out.println(VANI.roll);
        System.out.println(VANI.marks);
        System.out.println(VANI.name);

        Student raghav = new Student(15,20.5f);
        System.out.println(raghav.roll);
        System.out.println(raghav.marks);
        System.out.println(raghav.name);

        Student piyus = new Student(raghav);
        System.out.println(piyus.roll);
        System.out.println(piyus.marks);
        System.out.println(piyus.name);

    }
}