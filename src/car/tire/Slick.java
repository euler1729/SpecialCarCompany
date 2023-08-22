package car.tire;

import car.enumerators.TireVar;
import car.interfaces.Tire;

public class Slick implements Tire {
    @Override
    public TireVar getType() {
        return TireVar.SLICK;
    }

    @Override
    public int getPrice() {
        return 4;
    }
}
