package car.seat;

import car.enumerators.CarVar;
import car.interfaces.Seat;

public class SeatPrivate implements Seat {
    @Override
    public CarVar getType() {
        return CarVar.PRIVATE;
    }

    @Override
    public int getSeat() {
        return 5;
    }

    @Override
    public int getPrice() {
        return 5;
    }
}
