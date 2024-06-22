package Creational_Design_Patterns.Prototype_Pattern;

public class Main {
    public static void main(String[] args) {
        Student originalObj = new Student(20, 75, "Ram");
        Student cloneObj = (Student) originalObj.clone();
        System.out.println(originalObj.age);
        System.out.println(cloneObj.age);
    }

}
