package car.chesis;

import car.enumerators.ChesisVar;
import car.interfaces.Chesis;

public class Backbone implements Chesis {
    @Override
    public ChesisVar getType() {
        return ChesisVar.BACKBONE;
    }

    @Override
    public int getPrice() {
        return 2;
    }
}
