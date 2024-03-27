import java.util.List;
import java.util.UUID;

public class StudentService {

    private final StudentRepo repo = new StudentRepo();

    public Student addNewStudent(Student newStudent) {
        Student studentToSave = newStudent.withId(UUID.randomUUID().toString());
        return repo.save(studentToSave);
    }

    public List<Student> getAllStudents() {
        return repo.getAllStudents();
    }

    public Student findStudentById(String id) throws noStudentException {
        return repo.findStudentById(id)
                .orElseThrow(() -> new noStudentException("Student with id " + id + " not found"));


//       public Student findStudentById(String id) {
//            try {
//                id = findStudentById();
//            }
//            catch (Exception e) {
//                id = "Id nicht vorhanden";
//            }
//            System.out.println("Kein Student mit der Id vorhanden: " + id);
//            return null;
//    }
    }
}
