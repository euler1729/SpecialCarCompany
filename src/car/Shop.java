package car;

import car.enumerators.CarVar;
import car.enumerators.GroupVar;
import car.enumerators.Region;

import java.util.ArrayList;
import java.util.HashMap;

public class Shop {
    Region region;
    Car car;
    GroupVar group;
    HashMap<CarVar, ArrayList<Car>> carMap = new HashMap<CarVar, ArrayList<Car>>();

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public GroupVar getGroup() {
        return group;
    }

    public void setGroup(GroupVar group) {
        this.group = group;
    }

    public void addCar(CarVar carVar, Car car){
        carMap.get(carVar).add(car);
    }
    public Car getCar(CarVar carVar){
        return carMap.get(carVar).get(0);
    }
    public Car popCar(CarVar carVar){
        return carMap.get(carVar).remove(0);
    }
}
