package car;

import car.enumerators.CarVar;
import car.enumerators.GroupVar;
import car.enumerators.Region;

import java.util.HashMap;

public class Shop {
    Region region;
    Car car;
    GroupVar group;
    HashMap<CarVar, Car> carMap = new HashMap<CarVar, Car>();

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

    public HashMap<CarVar, Car> getCarMap() {
        return carMap;
    }

    public void setCarMap(HashMap<CarVar, Car> carMap) {
        this.carMap = carMap;
    }
}
