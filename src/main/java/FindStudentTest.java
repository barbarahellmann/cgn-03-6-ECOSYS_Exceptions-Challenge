import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FindStudentTest {

    @Test
    void findStudentById_shouldReturnTrue_WhenGiven12() {
        // GIVEN
        int StudentId = 12;
        // WHEN
        boolean actual = Main.findStudentById(student.id);
        // THEN
        assertTrue(actual);
    }


    @Test
    void findStudentById_shouldReturnFalse_WhenGiven0() {
        // GIVEN
        int StudentId = 0;
        // WHEN
        boolean actual = Main.findStudentById(student.id);
        // THEN
        Assertions.assertFalse(actual);
    }

    @Test
    void findStudentById_shouldGiveException_WhenGiven0() {
        try {
            int actual =  Main.findStudentById(student.id);
            Assertions.fail();
        } catch (Exception e) {
            assertTrue(true);
        }
    }
}

