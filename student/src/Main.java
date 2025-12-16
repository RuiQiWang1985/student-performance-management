import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Teacher.initTeachers();
        Student.initStudents();
        System.out.println("Please choose your identity");
        System.out.println("1. Teacher");
        System.out.println("2. Student");
        Scanner input = new Scanner(System.in);
        String choice = input.next();

        if ("2".equals(choice)) {
            System.out.println("Welcome to check your scores");
            System.out.println("Please load in your ID");
            String studentID = input.next();
            if (Student.checkStudentID(studentID)) {
                System.out.println("Hello!Here are your scores");
                System.out.println(Student.getScore(studentID));
            } else {
                System.out.println("Sorry, student is not found");
            }
        } else if ("1".equals(choice)) {
            System.out.println("Welcome to check your students");
            System.out.println("Please load in your ID");
            String teacherID = input.next();
            if (Teacher.checkTeacherID(teacherID)) {
                System.out.println("Hello!Here are your students' scores");
                System.out.println("1. Any student's scores");
                System.out.println("2. All student's scores");
                String Choice = input.next();
                if ("1".equals(Choice)) {
                    System.out.println("please load in Student's ID");
                    Teacher.showSingleStudentScore(input.next());
                } else if ("2".equals(Choice)) {
                    Teacher.showAllStudentScores();
                } else {
                    System.out.println("Invalid query choice");
                }
            } else {
                System.out.println("Sorry, teacher is not found");
            }
        } else {
            System.out.println("Invalid identity choice");
        }
        input.close();
    }}