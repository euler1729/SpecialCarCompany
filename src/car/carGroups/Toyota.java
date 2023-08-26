package car.carGroups;

import car.Car;
import car.enumerators.CarVar;
import car.enumerators.GroupVar;
import car.enumerators.Region;
import car.interfaces.AutoAI;

public abstract class Toyota extends Car {
    GroupVar groupVar;
    CarVar carVar;
    AutoAI autoAI;
    Region region;
    public Toyota() {
        super();
        groupVar = GroupVar.TOYOTA;
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
