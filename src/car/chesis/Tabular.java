package car.chesis;

import car.enumerators.ChesisVar;
import car.interfaces.Chesis;

public class Tabular implements Chesis {
    @Override
    public ChesisVar getType() {
        return ChesisVar.TABULAR;
    }

    @Override
    public int getPrice() {
        return 1;
    }
}
