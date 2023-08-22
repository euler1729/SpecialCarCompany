package car.engine;

import car.enumerators.EngineVar;
import car.interfaces.Engine;

public class CC1300 implements Engine {
    @Override
    public EngineVar getType() {
        return EngineVar.CC1300;
    }

    @Override
    public int getPrice() {
        return 1;
    }
}
