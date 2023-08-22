package car.engine;

import car.enumerators.EngineVar;
import car.interfaces.Engine;

public class CC2100 implements Engine {
    @Override
    public EngineVar getType() {
        return EngineVar.CC2100;
    }

    @Override
    public int getPrice() {
        return 4;
    }
}
