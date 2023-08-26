package car.model;

import car.Car;
import car.enumerators.CarVar;
import car.factories.SeatFactory;

public class FordRacing extends Car{
    public FordRacing() {
        super();
        setSeat(new SeatFactory().getInstance(this.model()));
    }
    @Override
    public CarVar model() {
        return CarVar.RACING;
    }
}
