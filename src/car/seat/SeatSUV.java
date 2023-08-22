package car.seat;

import car.enumerators.CarVar;
import car.interfaces.Seat;

public class SeatSUV implements Seat {
    @Override
    public CarVar getType() {
        return CarVar.SUV;
    }

    @Override
    public int getSeat() {
        return 15;
    }

    @Override
    public int getPrice() {
        return 15;
    }
}
