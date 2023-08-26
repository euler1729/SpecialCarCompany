package car.model;
import car.carGroups.BMW;
import car.enumerators.*;
import car.factories.SeatFactory;

public class BMWMilitary extends BMW {
    public BMWMilitary() {
        super();
        setSeat(new SeatFactory().getInstance(this.model()));
    }
    public BMWMilitary(AcVar ac,
                       ChesisVar chesis,
                       ColorVar color,
                       EngineVar engine,
                       CarVar model,
                       Region region,
                       TireVar tire) {
        super(ac, chesis, color, engine, model, region, tire);
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
                +getTire().getPrice();
    }
    @Override
    public CarVar model() {
        return CarVar.MILITARY;
    }
}

