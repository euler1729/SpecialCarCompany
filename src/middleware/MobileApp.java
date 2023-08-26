package middleware;

import car.Car;
import car.enumerators.CarVar;
import central_online_system.CentralSystem;
import customize.DecoratedCar;

public class MobileApp implements Adapter{
    CentralSystem centralSystem;
    public MobileApp(CentralSystem centralSystem) {
        this.centralSystem = centralSystem;
    }
    @Override
    public Car getCar() {
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
    public void getDecoratedCar() {

    }
    @Override
    public DecoratedCar getDecoratedCar(Car car) {
        return new DecoratedCar(car);
    }
}
