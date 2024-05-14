package relation_objects.oneToMany;
import java.util.ArrayList;

public class Car {

    // attributes
    private String id;
    private Motor motor;
    private ArrayList<Tire> tires;


    //constructors
    public Car (){
        this.tires = new ArrayList<>();
    }
    public Car (String id){
        this();
//        this.tires = new ArrayList<>();
        this.id = id;
    }


    // getters and setters
    public String getId () {
        return id;
    }

    public void setId (String id) {
        this.id = id;
    }

    public Motor getMotor () {
        return motor;
    }

    public void setMotor (Motor motor) {
        this.motor = motor;
    }

    public ArrayList<Tire> getTires () {
        return tires;
    }

    public void setTires (ArrayList<Tire> tires) {
        this.tires = tires;
    }

    public void addTire(Tire tier){
           this.tires.add(tier);
    }

    private String tiresList(){
        String affiche = "";
        byte counter = 1;
              for(Tire t: this.tires){

                   affiche += "\n"+counter++ +" -> "+t.getManufacturer() +" pressure : "+t.getPressure();
        }
              return  affiche;
    }

    // toSring()

    @Override
    public String toString () {
        return "Car{" + "\n id='" + id + '\'' + "\n- motor=" + motor.getManufactureYear() + "\n- has " + tires.size() + " tiers its "+this.tiresList()+"\n}";
    }
}
