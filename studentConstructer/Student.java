package studentConstructer;

public class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println("name = " + this.name);
        System.out.println("age = " + this.age);

    }
    //No-argument constructor this will be called at the creation of the object
    Student(){
        System.out.println("Constructor called");
    }
    //parameterized constructors
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    //Copy constructors
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

}
// constructor in Java is a special method that is used to initialize objects.
// The constructor is called when an object of a class is created. It can be used
// to set initial values for object attributes.

//Constructors must have the same name as the class within which it is defined while it is not
//necessary for the method in Java.
//Constructors do not return any type while method(s) have the return type or void if does not return any value.
//Constructors are called only once at the time of Object creation while method(s) can be called any number of times.
