package car.model;
import car.Car;
import car.enumerators.CarVar;
import car.factories.SeatFactory;

public class BMWSUV extends Car{
    public BMWSUV() {
        super();
        setSeat(new SeatFactory().getInstance(this.model()));
    }
    @Override
    public CarVar model() {
        return CarVar.SUV;
    }
}

