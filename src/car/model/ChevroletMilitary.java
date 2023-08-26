package car.model;

import car.Car;
import car.enumerators.CarVar;
import car.factories.SeatFactory;

public class ChevroletMilitary extends Car{
    public ChevroletMilitary() {
        super();
        setSeat(new SeatFactory().getInstance(this.model()));
    }
    @Override
    public CarVar model() {
        return CarVar.MILITARY;
    }
}
