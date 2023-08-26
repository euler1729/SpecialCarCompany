package car.model;

import car.carGroups.Ferrari;
import car.enumerators.CarVar;
import car.factories.SeatFactory;

public class FerrariMilitary extends Ferrari{
    public FerrariMilitary() {
        super();
        setSeat(new SeatFactory().getInstance(this.model()));
    }
    @Override
    public CarVar model() {
        return CarVar.MILITARY;
    }
}
