package car.factories;

import car.enumerators.CarVar;
import car.seat.*;
import car.interfaces.*;

public class SeatFactory {
    public Seat getInstance(CarVar type){
        switch(type){
            case RACING:
                return new SeatRacing();
            case PRIVATE:
                return new SeatPrivate();
            case SUV:
                return new SeatSUV();
            case MILITARY:
                return new SeatMilitary();
            default:
                return null;
        }
    }
}
