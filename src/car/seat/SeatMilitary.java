package car.seat;

import car.enumerators.CarVar;
import car.interfaces.Seat;

public class SeatMilitary implements Seat {
    @Override
    public CarVar getType() {
        return CarVar.MILITARY;
    }

    @Override
    public int getSeat() {
        return 7;
    }

    @Override
    public int getPrice() {
        return 7;
    }
}
