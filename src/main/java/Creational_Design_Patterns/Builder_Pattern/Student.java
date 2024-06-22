package Creational_Design_Patterns.Builder_Pattern;

public class Student {
    int roll;
    String studentName;
    String fatherName;
    String motherName;

    public Student(StudentBuilder studentBuilder){
        this.roll  = studentBuilder.roll;
        this.studentName = studentBuilder.studentName;
        this.fatherName = studentBuilder.fatherName;
        this.motherName = studentBuilder.motherName;
    }
    public String toString(){
        return ""+"roll number: "+this.roll
                +" \nStudent Name: "+this.studentName
                +" \nFather's Name: "+this.fatherName
                +" \nMother's Name: "+this.motherName;
    }
}
