package car.ac;

import car.enumerators.AcVar;
import car.interfaces.AC;

public class Low implements AC {
    @Override
    public AcVar getType() {
        return AcVar.LOW;
    }

    @Override
    public int getPrice() {
        return 1;
    }
}
