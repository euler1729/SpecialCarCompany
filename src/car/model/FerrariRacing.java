package car.model;

import car.carGroups.Ferrari;
import car.enumerators.CarVar;
import car.factories.SeatFactory;

public class FerrariRacing extends Ferrari{
    public FerrariRacing() {
        super();
        setSeat(new SeatFactory().getInstance(this.model()));
    }
    @Override
    public CarVar model() {
        return CarVar.RACING;
    }
}
