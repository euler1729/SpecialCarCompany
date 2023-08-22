package car.tire;

import car.enumerators.TireVar;
import car.interfaces.Tire;

public class Spare implements Tire {
    @Override
    public TireVar getType() {
        return TireVar.SPARE;
    }

    @Override
    public int getPrice() {
        return 2;
    }
}
