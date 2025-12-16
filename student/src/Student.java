import java.util.ArrayList;
public class Student{
    private static ArrayList<String> studentIDs = new ArrayList<>();
    private static String[] scores;
    public static void initStudents() {
        studentIDs.add("1");
        studentIDs.add("2");
        studentIDs.add("3");
        scores = new String[]{"112", "117", "125"};
    }
    public static boolean checkStudentID(String studentID) {
        return studentIDs.contains(studentID);
    }
    public static String getScore(String studentID) {
        int index = studentIDs.indexOf(studentID);
        return index != -1 ? scores[index] : "该学生不存在";
    }
    // 返回值改为 ArrayList<String>
    public static ArrayList<String> getStudentIDs() {
        return studentIDs;
    }
    public static String[] getScores() {
        return scores;
    }}