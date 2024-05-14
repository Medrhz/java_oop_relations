package relation_objects.oneToOne;


public class Motor {
    int manufactureYear;
    Car car ;

    public Motor(){}

    public Motor(int manufactureYear){
        this.manufactureYear = manufactureYear;

    }

    public int getManufactureYear () {
        return manufactureYear;
    }

    public void setManufactureYear (int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public Car getCar () {
        return car;
    }

    public void setCar (Car car) {
        this.car = car;
    }

    @Override
    public String toString () {
        return "Motor{" + "manufactureYear=" + manufactureYear + "in car '" + car.getId()+ "'}";
    }
}
