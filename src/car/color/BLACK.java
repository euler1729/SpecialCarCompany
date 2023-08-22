package car.color;

import car.enumerators.ColorVar;
import car.interfaces.Color;

public class BLACK implements Color {
    @Override
    public ColorVar getColor() {
        return ColorVar.BLACK;
    }

    @Override
    public int getPrice() {
        return 4;
    }
}
