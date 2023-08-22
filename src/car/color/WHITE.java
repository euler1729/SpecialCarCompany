package car.color;

import car.enumerators.ColorVar;
import car.interfaces.Color;

public class WHITE implements Color {
    @Override
    public ColorVar getColor() {
        return ColorVar.WHITE;
    }

    @Override
    public int getPrice() {
        return 2;
    }
}
