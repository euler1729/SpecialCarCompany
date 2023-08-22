package car.seat;

import car.enumerators.CarVar;
import car.interfaces.Seat;

public class SeatRacing implements Seat {
    @Override
    public CarVar getType() {
        return CarVar.RACING;
    }

    @Override
    public int getSeat() {
        return 1;
    }

    @Override
    public int getPrice() {
        return 1;
    }
}
