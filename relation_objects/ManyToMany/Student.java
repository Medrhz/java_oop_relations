package relation_objects.ManyToMany;

import java.util.ArrayList;

public class Student {
   private String studentId;
   private String name;
   private ArrayList<Course> couseList;
   private String lastName = "fahd";

   public Student(String studentId, String name){

      this.couseList = new ArrayList<Course>();
      this.studentId = studentId;
      this.name = name;
   }

   public String getLastName () {
      return lastName;
   }
   public void setLastName(String lastName){
      this.lastName = lastName;
   }

   public String getStudentId () {
      return studentId;
   }

   public void setStudentId (String studentId) {
      studentId = studentId;
   }

   public String getName () {
      return name;
   }

   public void setName (String name) {
      this.name = name;
   }

   private String getCouseList () {
        String afficher = "";
        int counter = 0;
        for (Course c: this.couseList){
           counter++;
            afficher += counter+"- "+c.getName()+"\n";
      }
      return afficher;
   }

   public void addCourse(Course course){
      this.couseList.add(course);
   }


   @Override
   public String toString () {
      System.out.println("=====================================================");
      return "Student{" + "StudentId='" + studentId
              + '\'' + "\nname='" +
              name + '\'' +
              "\ncouseList :\n" + this.getCouseList() + '}';
   }
}
