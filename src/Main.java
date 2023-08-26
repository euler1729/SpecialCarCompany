import car.Car;
import car.model.BMWMilitary;

public class Main {
    public static void main(String[] args) {
        Car car = new BMWMilitary();
        System.out.println(car.getPrice());
    }
}