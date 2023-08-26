package car.carGroups;

import car.Car;
import car.enumerators.*;
import car.interfaces.AutoAI;

public abstract class BMW extends Car {
    GroupVar groupVar;
    CarVar carVar;
    AutoAI autoAI;
    Region region;

    public BMW() {
        super();
        groupVar = GroupVar.BMW;
    }

    public BMW(AcVar ac,
               ChesisVar chesis,
               ColorVar color,
               EngineVar engine,
               CarVar model,
               Region region,
               TireVar tire) {
        super(ac, chesis, color, engine, model, region, tire);
        groupVar = GroupVar.BMW;
    }

    public GroupVar getGroupVar() {
        return groupVar;
    }

    public void setGroupVar(GroupVar groupVar) {
        this.groupVar = groupVar;
    }

    public CarVar getCarVar() {
        return carVar;
    }

    public void setCarVar(CarVar carVar) {
        this.carVar = carVar;
    }

    public AutoAI getAutoAI() {
        return autoAI;
    }

    public void setAutoAI(AutoAI autoAI) {
        this.autoAI = autoAI;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
}
