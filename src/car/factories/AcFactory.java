package car.factories;

import car.ac.High;
import car.ac.Low;
import car.enumerators.AcVar;
import car.interfaces.AC;


public class AcFactory {
    public AC getInstance(AcVar type){
        switch(type){
            case LOW:
                return new Low();
            case HIGH:
                return new High();
            default:
                return null;
        }
    }
}
