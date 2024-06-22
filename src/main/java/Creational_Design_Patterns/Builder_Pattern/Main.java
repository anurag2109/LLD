package Creational_Design_Patterns.Builder_Pattern;

public class Main {
    public static void main(String[] args) {
        Director director = new Director(new StudentBuilder());
        Student student = director.createStudent();
        System.out.println(student.toString());
    }
}
