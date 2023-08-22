package car.tire;

import car.enumerators.TireVar;
import car.interfaces.Tire;

public class Snow implements Tire {
    @Override
    public TireVar getType() {
        return TireVar.SNOW;
    }

    @Override
    public int getPrice() {
        return 1;
    }
}
