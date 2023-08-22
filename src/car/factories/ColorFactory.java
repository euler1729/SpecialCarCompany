package car.factories;

import car.color.BLACK;
import car.color.GREY;
import car.color.RED;
import car.color.WHITE;
import car.enumerators.ColorVar;
import car.interfaces.*;

public class ColorFactory {
    public Color getInstance(ColorVar type){
        switch(type){
            case RED:
                return new RED();
            case WHITE:
                return new WHITE();
            case GREY:
                return new GREY();
            case BLACK:
                return new BLACK();
            default:
                return null;
        }
    }
}
