package car.color;

import car.enumerators.ColorVar;
import car.interfaces.Color;

public class RED implements Color {
    @Override
    public ColorVar getColor() {
        return ColorVar.RED;
    }

    @Override
    public int getPrice() {
        return 1;
    }
}
