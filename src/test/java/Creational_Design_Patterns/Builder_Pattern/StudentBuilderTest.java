package Creational_Design_Patterns.Builder_Pattern;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentBuilderTest {
    @Test
    public void studentBuilderTest(){
        Student student = new StudentBuilder()
                .setRoll(101)
                .setStudentName("Anurag")
                .setFatherName("Abhikant Lal Karn")
                .setMotherName("Veena Devi")
                .build();

        assertEquals(101, student.roll);
        assertEquals("Anurag", student.studentName);
        assertEquals("Abhikant Lal Karn", student.fatherName);
        assertEquals("Veena Devi", student.motherName);
    }
}
