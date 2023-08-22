package car.ac;

import car.enumerators.AcVar;
import car.interfaces.AC;

public class High implements AC {
    @Override
    public AcVar getType() {
        return AcVar.HIGH;
    }

    @Override
    public int getPrice() {
        return 2;
    }
}
