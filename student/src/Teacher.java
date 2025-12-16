import java.util.ArrayList;
import java.util.List;
public class Teacher {
    private static List<String> teacherIDs = new ArrayList<>();
    public static void initTeachers() {
        teacherIDs.add("001");
        teacherIDs.add("002");
        teacherIDs.add("003");
    }
    public static boolean checkTeacherID(String teacherID) {
        return teacherIDs.contains(teacherID);
    }
    public static void showAllStudentScores() {
        List<String> studentIDs = Student.getStudentIDs();
        String[] scores = Student.getScores();
        if (studentIDs.isEmpty()) {
            System.out.println("no scores");
            return;
        }
        for (int i = 0; i < studentIDs.size(); i++) {
            System.out.println("ID: " + studentIDs.get(i) + "，score: " + scores[i]);
        }
    }
    public static void showSingleStudentScore(String studentID) {
        if (Student.checkStudentID(studentID)) {
            String score = Student.getScore(studentID);
            System.out.println("ID: " + studentID + "，score: " + score);
        } else {
            System.out.println("no ID");
        }
    }
}