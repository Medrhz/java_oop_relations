package relation_objects.oneToMany;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {

        Tire t1 = new Tire(2.5f,"china");
        Tire t2 = new Tire(2.5f,"china");
        Tire t3 = new Tire(2.5f,"china");
        Tire t4 = new Tire(2.5f,"china");

        ArrayList<Tire> tier = new ArrayList<>();

        tier.add(t1);
        tier.add(t2);
        tier.add(t3);
        tier.add(t4);



        Car c1 = new Car("deft45");
        Motor m1 = new Motor(2020);


        c1.setMotor(m1);
        m1.setCar(c1);

        c1.addTire(t1);
        t1.setCar(c1);

        c1.addTire(t2);
        t2.setCar(c1);

        c1.addTire(t3);
        t3.setCar(c1);

        c1.addTire(t4);
        t4.setCar(c1);

        System.out.println(c1);
        System.out.println(m1);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        c1.setTires(tier);



    }
}
