package relation_objects.oneToOne;

public class Car {
    private String id;
    private Motor motor;



    public Car(){}
    public Car(String id){
        this.id = id;
    }

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

    @Override
    public String toString () {
        return "Car{" + "id='" + id + '\'' + "manufacture  motor=" + motor.getManufactureYear()+ '}';
    }
}
