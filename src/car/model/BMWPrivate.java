package car.model;

import car.carGroups.BMW;
import car.enumerators.CarVar;
import car.factories.SeatFactory;

public class BMWPrivate extends BMW{
    public BMWPrivate() {
        super();
        setSeat(new SeatFactory().getInstance(this.model()));
    }

    @Override
    public int getPrice() {
        return getAc().getPrice()
                + getAutoAI().getPrice()
                +getChesis().getPrice()
                +getChesis().getPrice()
                +getColor().getPrice()
                +getEngine().getPrice()
                +getSeat().getPrice()
                + getTire().getPrice();
    }
    @Override
    public CarVar model() {
        return CarVar.PRIVATE;
    }
}
