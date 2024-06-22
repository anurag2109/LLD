package Creational_Design_Patterns.Builder_Pattern;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DirectorTest {
    @Test
    public void directorTest(){
        Student student = new Director(new StudentBuilder()).createStudent();
        String actual = student.toString();
        String expected  = "roll number: 101 \nStudent Name: Anurag \nFather's Name: Abhikant \nMother's Name: Veena";

        assertEquals(expected, actual);
    }

}
