package car.factories;

import car.enumerators.TireVar;
import car.interfaces.*;
import car.tire.Slick;
import car.tire.Snow;
import car.tire.Spare;
import car.tire.Whitewall;

public class TireFactory {
    public Tire getInstance(TireVar type){
        switch(type){
            case SNOW:
                return new Snow();
            case SPARE:
                return new Spare();
            case WHITEWALL:
                return new Whitewall();
            case SLICK:
                return new Slick();
            default:
                return null;
        }
    }
}
