package car.model;

import car.Car;
import car.enumerators.CarVar;
import car.factories.SeatFactory;

public class ChevroletPrivate extends Car{
    public ChevroletPrivate() {
        super();
        setSeat(new SeatFactory().getInstance(this.model()));
    }
    @Override
    public CarVar model() {
        return CarVar.PRIVATE;
    }
}
