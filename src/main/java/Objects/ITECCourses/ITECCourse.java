package Objects.ITECCourses;

import java.util.ArrayList;
import java.util.List;

public class ITECCourse {

    private String courseName;
    private int code;
    private List<String> students;
    private int maxStudents;


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    // Constructor
    public ITECCourse(String courseName, int code, int maxStudents){
        this.courseName = courseName;
        this.code = code;
        this.maxStudents = maxStudents;
        this.students  = new ArrayList<>();
    }

    public void addStudent(String studentName){
        if (students.size() < maxStudents) {
            students.add(studentName);
            //System.out.println(studentName+" was added to the class.");
        }else {
            System.out.println("Can't add, class is full.");
        }
    }

    public int getNumberOfStudents(){

            return students.size();

    }

    public void removeStudents(String studentName){
        if (students.contains(studentName)){
            students.remove(studentName);
            System.out.println(studentName+" was removed.");
        }else{
            System.out.println(studentName+" is not in the list.");
        }
    }


}
