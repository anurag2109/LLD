package Creational_Design_Patterns.Builder_Pattern;

public class Director {
    StudentBuilder studentBuilder;

    Director(StudentBuilder studentBuilder){
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent(){
        return studentBuilder.setRoll(101).setStudentName("Anurag").setFatherName("Abhikant").setMotherName("Veena").build();
    }
}
