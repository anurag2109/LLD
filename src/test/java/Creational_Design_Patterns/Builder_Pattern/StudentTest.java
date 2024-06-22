package Creational_Design_Patterns.Builder_Pattern;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void studentTest(){
        Student student = new StudentBuilder()
                .setRoll(103)
                .setStudentName("Baba")
                .setMotherName("Anu")
                .setFatherName("Pita ji")
                .build();

        String actual = student.toString();
        String expected  = "roll number: 103 \nStudent Name: Baba \nFather's Name: Pita ji \nMother's Name: Anu";

        assertEquals(expected, actual);

    }
}
