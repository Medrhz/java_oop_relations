package relation_objects.oneToOne;

public class Main {
    public static void main (String[] args) {

        Car c1 = new Car("ZER34RF");
        Motor m1 = new Motor(2020);

        c1.setMotor(m1);
        m1.setCar(c1);

        System.out.println(c1);
        System.out.println(m1);

//        ArrayList<String> names = new ArrayList<>();
//        names.add("yassine");
//        names.add("youness");
//        names.add("khawla");
//        names.add("ahmed");
//
//        System.out.println(names);

    }
}
