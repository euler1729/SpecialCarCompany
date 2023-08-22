package car.factories;

import car.chesis.Backbone;
import car.chesis.LadderFrame;
import car.chesis.Tabular;
import car.enumerators.ChesisVar;
import car.interfaces.Chesis;

public class ChesisFactory {
    public Chesis getInstance(ChesisVar type){
        switch(type){
            case TABULAR:
                return new Tabular();
            case BACKBONE:
                return  new Backbone();
            case LADDER:
                return  new LadderFrame();
            default:
                return null;
        }
    }
}
