package relation_objects.ManyToMany;

public class Main {

    public static void main (String[] args) {

        Student s1 = new Student("poly45va","ayoub");
        Student s2 = new Student("poly46va","yassine");
        Student s3 = new Student("poly47va","khalid");
        Student s4 = new Student("poly48va","salwa");
        Student s5 = new Student("poly49va","fadwa");

        Course c1 = new Course("mode1","Object Oriented Programming");
        Course c2 = new Course("mode2","client serveur");
        Course c3 = new Course("mode3","security and networking");
        Course c4 = new Course("mode4","development Mobile");

        s1.addCourse(c1);
        s1.addCourse(c2);
        s1.addCourse(c3);
        s1.addCourse(c4);
        c1.addStudent(s1);
        c1.addStudent(s2);
        c1.addStudent(s3);
        c1.addStudent(s4);
        c1.addStudent(s5);

        s2.addCourse(c1);
        s2.addCourse(c2);
        s2.addCourse(c3);
        s2.addCourse(c4);
        c2.addStudent(s1);
        c2.addStudent(s2);
        c2.addStudent(s3);
        c2.addStudent(s4);

        s3.addCourse(c1);
        s3.addCourse(c2);
        s3.addCourse(c3);
        s3.addCourse(c4);
        c3.addStudent(s1);
        c3.addStudent(s2);
        c3.addStudent(s3);
        c3.addStudent(s4);

        s4.addCourse(c1);
        s4.addCourse(c2);
        s4.addCourse(c3);
        s4.addCourse(c4);
        c4.addStudent(s1);
        c4.addStudent(s2);
        c4.addStudent(s3);
        c4.addStudent(s4);

       System.out.println(c1);
//       System.out.println(c2);
//       System.out.println(c3);
//       System.out.println(c4);
//
//       System.out.println(s2);
//       System.out.println(s2);
//       System.out.println(s3);
//       System.out.println(s4);

    }
}
