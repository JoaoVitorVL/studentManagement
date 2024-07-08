import java.util.ArrayList;

public class Student {
    private String id;
    private String name;
    private ArrayList<String> coursesEnroled;

    public Student(String name, String id){
        this.name = name;
        this.id = id;
        coursesEnroled = new ArrayList<>();
    }

    @Override
    public String toString() {
        return String.format("NAME: %s\n" +
                "ID: %s\n" +
                "-----------------------------", name, id);
    }
}
