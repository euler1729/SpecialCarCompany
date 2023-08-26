package customize.roof;

import customize.enumerators.RoofVar;
import customize.interfaces.Roof;

public class OpenRoof implements Roof {
    @Override
    public RoofVar type() {
        return RoofVar.OPEN;
    }

    @Override
    public int price() {
        return 0;
    }
}
