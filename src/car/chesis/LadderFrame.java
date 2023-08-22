package car.chesis;

import car.enumerators.ChesisVar;
import car.interfaces.Chesis;

public class LadderFrame implements Chesis {
    @Override
    public ChesisVar getType() {
        return ChesisVar.LADDER;
    }

    @Override
    public int getPrice() {
        return 3;
    }
}
