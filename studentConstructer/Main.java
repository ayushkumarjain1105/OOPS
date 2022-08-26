package studentConstructer;

public class Main {
    public static void main(String[] args) {
        //No-argument constructor
//        Student s1 = new Student();
//
//        s1.name = "Aman";
//        s1.age = 24;
        ///parameterized constructors
        Student s1 = new Student();
        s1.name = "Ayush";
        s1.age = 24;
        Student s2 = new Student(s1);
        s2.printInfo();
    }
}
