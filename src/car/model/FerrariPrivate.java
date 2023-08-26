package car.model;

import car.carGroups.Ferrari;
import car.enumerators.CarVar;
import car.factories.SeatFactory;

public class FerrariPrivate extends Ferrari{
    public FerrariPrivate() {
        super();
        setSeat(new SeatFactory().getInstance(this.model()));
    }
    @Override
    public CarVar model() {
        return CarVar.PRIVATE;
    }
}
