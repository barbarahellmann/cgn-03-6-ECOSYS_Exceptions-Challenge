import java.util.Optional;

public class Main {

    public static void main(String[] args) throws noStudentException {
        StudentService studentService = new StudentService();

        Student newStudent = Student.builder()
                .id("12")
                .name("Florian")
                .subject("Geschichte")
                .build();

        Student savedStudent = studentService.addNewStudent(newStudent);

        System.out.println("Student saved: " + savedStudent);

        String id = savedStudent.id();
        Student foundStudent = studentService.findStudentById("123456");
        if (foundStudent != null) {
            System.out.println("Student found: " + foundStudent);


            // find a student by id
            String id = savedStudent.id();
            Student foundStudent = studentService.findStudentById("123456");
            if (foundStudent != null) {
                System.out.println("Student found: " + foundStudent);

//        public findByID(int id) {
//            try {
//                StudentId = findStudentById();
//            }
//            catch (Exception e) {
//                studentId = "Id nicht vorhanden";
//            }
//            System.out.println("Kein Student mit der Id vorhanden: " + studentId);
//
//        }
//
//
       // public static String findByID() throws{
          //  throw new noStudentException("Kein Student vorhanden");
//
//        }
                //public Optional<Student> findStudentById(String id) {
                //return Optional.ofNullable(students.get(id));
            }
        }
    }
}
