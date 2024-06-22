package Creational_Design_Patterns.Builder_Pattern;

import java.util.List;

public class StudentBuilder {
    int roll;
    String studentName;
    String fatherName;
    String motherName;


    public StudentBuilder setRoll(int roll) {
        this.roll = roll;
        return this;
    }


    public StudentBuilder setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }


    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public Student build(){
        return new Student(this);
    }
}
