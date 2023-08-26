package central_online_system;

import car.Car;
import customize.DecoratedCar;

public interface Repository {
    public Car query();
    public DecoratedCar query(Car car);
}
