package car.model;

import car.carGroups.Toyota;
import car.enumerators.CarVar;
import car.factories.SeatFactory;

public class ToyotaSUV extends Toyota{
    public ToyotaSUV() {
        super();
        setSeat(new SeatFactory().getInstance(this.model()));
    }
    @Override
    public CarVar model() {
        return CarVar.SUV;
    }
}
