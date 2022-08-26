package ploymorphism.runTimePolymorphsm;

public class Student {
    String name;
    int age;
    public void printInfo(String name){
        System.out.println("name = " + name);
    }

    public void printInfo(int age){
        System.out.println("age = " + age);
    }
    public void printInfo(String name, int age){
        System.out.println("name = " + name + " age " + age);
    }
}
