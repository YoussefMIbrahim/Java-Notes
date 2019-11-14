package Objects.ITECCourses;

public class Main {

    public static void main(String[] args) {


        ITECCourse java =
                new ITECCourse("Java Programing", 2945,24);



        java.addStudent("Kanye Reeves");
        java.addStudent("other people");
        java.addStudent("Youssef");

        ITECCourse projects =
                new ITECCourse("Software Development Projects", 2903,24);

        projects.addStudent("Johnny Guitar");
        projects.addStudent("Erica");
        projects.addStudent("Molly");
        projects.addStudent("Alex");

        System.out.println(java.getNumberOfStudents());
        System.out.println(projects.getNumberOfStudents());

        java.removeStudents("me");
        java.removeStudents("Youssef");

        ITECCourse smallSize = new ITECCourse("small", 2134, 3);
        smallSize.addStudent("bob");
        smallSize.addStudent("bobert");
        smallSize.addStudent("boberto");
        smallSize.addStudent("not a bob");

        System.out.println("The class name is: "+ smallSize.getCourseName());

        System.out.println(smallSize.getNumberOfStudents());
    }
}
