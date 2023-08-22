package car.tire;

import car.enumerators.TireVar;
import car.interfaces.Tire;

public class Whitewall implements Tire {
    @Override
    public TireVar getType() {
        return TireVar.WHITEWALL;
    }

    @Override
    public int getPrice() {
        return 3;
    }
}
