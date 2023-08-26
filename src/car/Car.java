package car;

import car.enumerators.*;
import car.factories.*;
import car.interfaces.*;
import car.model.Military;
import car.model.Private;
import car.model.Racing;
import car.model.SUV;

import java.util.Random;

public abstract class Car implements Military, Private, SUV, Racing {

    AC ac;
    AcFactory acFactory = new AcFactory();

    Chesis chesis;
    ChesisFactory chesisFactory = new ChesisFactory();

    Color color;
    ColorFactory colorFactory = new ColorFactory();

    Engine engine;
    EngineFactory engineFactory = new EngineFactory();

    Tire tire;
    TireFactory tireFactory = new TireFactory();

    Seat seat;
    SeatFactory seatFactory = new SeatFactory();

    AutoAI autoAI;
    AutoAiFactory autoAiFactory = new AutoAiFactory();

    Region region;

    BodyDesign bodyDesign;

    public Car(){

    }
    public Car(AcVar ac,
               ChesisVar chesis,
               ColorVar color,
               EngineVar engine,
               CarVar model,
               Region region,
               TireVar tire){
        this.ac = acFactory.getInstance(ac);
        this.chesis = chesisFactory.getInstance(chesis);
        this.color = colorFactory.getInstance(color);
        this.engine = engineFactory.getInstance(engine);
        this.tire = tireFactory.getInstance(tire);
        this.seat = seatFactory.getInstance(model);
        this.autoAI = autoAiFactory.getInstance(region);
        bodyDesign = new BodyDesign() {
            @Override
            public void bodyDesign() {
                System.out.println("Body Design"+ new Random());
            }
        };
        this.region = region;
    }

    public void bodyDesign(){
        bodyDesign.bodyDesign();
    }

    public AC getAc() {
        return ac;
    }
    public void setAc(AC ac) {
        this.ac = ac;
    }

    public Chesis getChesis() {
        return chesis;
    }
    public void setChesis(Chesis chesis) {
        this.chesis = chesis;
    }

    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tire getTire() {
        return tire;
    }
    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public void setSeat(Seat seat){
        this.seat = seat;
    }
    public Seat getSeat(){
        return seat;
    }

    public AutoAI getAutoAI() {
        return autoAI;
    }
    public void setAutoAI(AutoAI autoAI) {
        this.autoAI = autoAI;
    }

    public abstract int getPrice();
    public abstract CarVar model();
}