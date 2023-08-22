package car.engine;

import car.enumerators.EngineVar;
import car.interfaces.Engine;

public class CC1800 implements Engine {
    @Override
    public EngineVar getType() {
        return EngineVar.CC1800;
    }

    @Override
    public int getPrice() {
        return 3;
    }
}
