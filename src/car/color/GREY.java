package car.color;

import car.enumerators.ColorVar;
import car.interfaces.Color;

public class GREY implements Color {
    @Override
    public ColorVar getColor() {
        return ColorVar.GREY;
    }

    @Override
    public int getPrice() {
        return 3;
    }
}
