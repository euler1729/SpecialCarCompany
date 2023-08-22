package car.factories;

import car.engine.CC1300;
import car.engine.CC1700;
import car.engine.CC1800;
import car.engine.CC2100;
import car.enumerators.EngineVar;
import car.interfaces.Engine;

public class EngineFactory {
    public Engine getInstance(EngineVar type){
        switch(type){
            case CC1300 -> {
                return new CC1300();
            }
            case CC1700 -> {
                return new CC1700();
            }
            case CC1800 -> {
                return new CC1800();
            }
            case CC2100 -> {
                return new CC2100();
            }
            default -> {
                return null;
            }
        }
    }
}
