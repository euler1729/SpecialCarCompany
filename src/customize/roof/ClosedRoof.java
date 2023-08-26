package customize.roof;

import customize.enumerators.RoofVar;
import customize.interfaces.Roof;

public class ClosedRoof implements Roof {
    @Override
    public RoofVar type() {
        return RoofVar.CLOSED;
    }

    @Override
    public int price() {
        return 2;
    }
}
