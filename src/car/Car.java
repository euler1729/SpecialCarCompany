package car;

import car.interfaces.*;

public abstract class Car {
    AC ac;
    Chesis chesis;
    Color color;
    Engine engine;
    Tire tire;
    Seat seat;
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
}
