package relation_objects.oneToMany;

public class Tire {

    private  float pressure;
    private String manufacturer;
    private  Car car;


    public Tire(){}
    public Tire(float pressure,String manufacturer){
        this.pressure = pressure;
        this.manufacturer = manufacturer;
    }


    public float getPressure () {
        return pressure;
    }

    public void setPressure (float pressure) {
        this.pressure = pressure;
    }

    public String getManufacturer () {
        return manufacturer;
    }

    public void setManufacturer (String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Car getCar () {
        return car;
    }

    public void setCar (Car car) {
        this.car = car;
    }

    @Override
    public String toString () {
        return "Tire{" + "pressure=" + pressure + ", manufacturer='" + manufacturer + '\'' + ", car=" + car.getId() + '}';
    }
}
