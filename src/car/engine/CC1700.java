package car.engine;

import car.enumerators.EngineVar;
import car.interfaces.Engine;

public class CC1700 implements Engine {
    @Override
    public EngineVar getType() {
        return EngineVar.CC1700;
    }

    @Override
    public int getPrice() {
        return 2;
    }
}
