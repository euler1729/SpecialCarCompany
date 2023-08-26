package car.model;

import car.Car;
import car.enumerators.CarVar;
import car.factories.SeatFactory;

public class FordPrivate extends Car{
    public FordPrivate() {
        super();
        setSeat(new SeatFactory().getInstance(this.model()));
    }
    @Override
    public CarVar model() {
        return CarVar.PRIVATE;
    }
}
