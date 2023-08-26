package central_online_system;

import car.Car;
import car.enumerators.CarVar;
import customize.DecoratedCar;

public class CentralSystem implements Repository{

    @Override
    public Car query() {
        return new Car() {
            @Override
            public int getPrice() {
                return 0;
            }

            @Override
            public CarVar model() {
                return null;
            }
        };
    }

    @Override
    public DecoratedCar query(Car car) {
        return new DecoratedCar(car);
    }
}
