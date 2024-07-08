import java.util.Scanner;

public class AddingApp {
    public static void main(String[] args) {
        boolean onOff = true;
        University uni = new University();
        Scanner scanIn = new Scanner(System.in);

        do {
            try {
                System.out.println("Welcome to the adding system\n" +
                        "Choose one of the next options:\n" +
                        "1 - Add student\n" +
                        "2 - Add professor\n" +
                        "3 - Check students\n" +
                        "4 - exit");
                int chosenNum = scanIn.nextInt();

                switch (chosenNum) {
                    case 1: {
                        try {
                            System.out.println("How many students are going to be added?");
                            int totalAlumn = scanIn.nextInt();

                            for (int i = 0; i < totalAlumn; i++) {
                                System.out.println("Enter the name of the " + (i + 1) + "º student: ");
                                String name = scanIn.next();
                                System.out.println("Enter their grade level: ");
                                int gradeLevel = scanIn.nextInt();
                                String convertGrade = String.valueOf(gradeLevel);

                                System.out.println("Select the course: \n" +
                                        "1 - History (101)\n" +
                                        "2 - Geography (102)\n" +
                                        "3 - Mathematics (103)");

                                int stdFirstCourse = scanIn.nextInt();

                                String courseCode = "";
                                switch (stdFirstCourse) {
                                    case 1:
                                        courseCode = "101";
                                        break;
                                    case 2:
                                        courseCode = "102";
                                        break;
                                    case 3:
                                        courseCode = "103";
                                        break;
                                    default:
                                        System.out.println("Choose within the given options.");
                                }

                                uni.addNewStudent(name, convertGrade, courseCode);

                            }
                        } catch (Exception e) {
                            System.out.println("An error ocurred adding a new student, please, try again.");
                            e.printStackTrace();
                        }
                        break;
                    }

                    case 2:
                        System.out.println("Coming soon");
                        break;

                    case 3:
                        uni.showStudents();
                        break;

                    case 4:
                        onOff = false;

                    default:
                        System.out.println("Choose within the given options.");

                }
            } catch (Exception e){
                System.out.println("An error ocurred here.");
                scanIn.next();
                e.printStackTrace();
            }
        } while (onOff);
    }
}