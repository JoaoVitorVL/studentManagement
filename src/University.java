import java.time.LocalDateTime;
import java.util.ArrayList;

public class University {
    private double coursePrices = 600.0;
    private ArrayList<Student> students;
    private LocalDateTime date = LocalDateTime.now();

    public University() {
        this.coursePrices = coursePrices;
        this.students = new ArrayList<>();
    }

    public void addNewStudent(String name, String gradeLevel, String courseCode){
        String newId = generateID(gradeLevel, courseCode);
        students.add(new Student(name, newId));
    }

    private String generateID(String gradeLevel, String courseCode){
        // the id is made with the first numbers being grade level and the last being the
        // code of the first course chosen and the year

        return gradeLevel + courseCode + date.getYear();
    }

    public void showStudents(){
        for (Student student: students){
            System.out.println(student.toString());
        }
    }
}
