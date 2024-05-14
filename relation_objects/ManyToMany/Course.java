package relation_objects.ManyToMany;

import java.util.ArrayList;

public class Course {
    private  String courseId;
    private  String name;
    private ArrayList<Student> studentsList;


    public Course(String courseId,String name){
        this.courseId = courseId;
        this.name = name;
        studentsList = new ArrayList<>();
    }

    public String getCourseId () {
        return courseId;
    }

    public void setCourseId (String courseId) {
        this.courseId = courseId;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getStudentsList () {
        String afficher = "";
        int counter = 0;
        for (Student s: this.studentsList){
            counter++;
            afficher += counter+"- "+s.getName()+"\n";
        }
        return afficher;
    }

    public void addStudent (Student student) {
        this.studentsList.add(student);
    }

    @Override
    public String toString () {
        System.out.println("=====================================================");
        return "Course{" + "courseId='" + courseId + '\'' + "\nname='" + name + '\'' + "\nstudentsList : \n" + this.getStudentsList() + '}';
    }
}
