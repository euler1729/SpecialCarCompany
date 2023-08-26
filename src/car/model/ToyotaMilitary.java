package car.model;

import car.carGroups.Toyota;
import car.enumerators.CarVar;
import car.factories.SeatFactory;

public class ToyotaMilitary extends Toyota{
    public ToyotaMilitary() {
        super();
        setSeat(new SeatFactory().getInstance(this.model()));
    }
    @Override
    public CarVar model() {
        return CarVar.MILITARY;
    }

}
