package car.factories;

import car.autoAi.AsiaBasedAI;
import car.autoAi.USABasedAI;
import car.enumerators.Region;
import car.interfaces.AutoAI;

public class AutoAiFactory {
    public AutoAI getInstance(Region type){
        switch(type){
            case ASIA:
                return new AsiaBasedAI();
            case USA:
                return new USABasedAI();
            default:
                return null;
        }
    }
}
