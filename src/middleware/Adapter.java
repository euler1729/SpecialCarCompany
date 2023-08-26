package middleware;

import car.Car;
import customize.DecoratedCar;

public interface Adapter {
    public Car getCar();
    public void getDecoratedCar();

    DecoratedCar getDecoratedCar(Car car);
}
