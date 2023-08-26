package customize;

import car.Car;
import customize.bumper.BigBumper;
import customize.bumper.SmallBumper;
import customize.enumerators.BumperVar;
import customize.enumerators.GateVar;
import customize.enumerators.RainShieldVar;
import customize.enumerators.RoofVar;
import customize.gate.MobileGate;
import customize.gate.RemoteGate;
import customize.interfaces.Bumper;
import customize.interfaces.GateControl;
import customize.interfaces.RainShield;
import customize.interfaces.Roof;
import customize.rainShield.CurvedRainShield;
import customize.rainShield.ThickRainShield;
import customize.rainShield.ThinRainShield;
import customize.roof.ClosedRoof;
import customize.roof.OpenRoof;

public class DecoratedCar {
    Car car;
    Bumper bumper;
    GateControl gateControl;
    RainShield rainShield;
    Roof roof;

    public DecoratedCar(Car car) {
        this.car = car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setBumper(BumperVar bumperVar) {
        switch (bumperVar) {
            case BIG:
                bumper = new BigBumper();
                break;
            case SMALL:
                bumper = new SmallBumper();
                break;
            default:
                bumper = null;
                break;
        }
    }
    public void setGateControl(GateVar gateVar) {
        switch (gateVar) {
            case REMOTE:
                gateControl = new RemoteGate();
                break;
            case MOBILE:
                gateControl = new MobileGate();
                break;
            default:
                gateControl = null;
                break;
        }
    }
    public void setRainShield(RainShieldVar rainShieldVar) {
        switch (rainShieldVar) {
            case THICK:
                rainShield = new ThickRainShield();
                break;
            case THIN:
                rainShield = new ThinRainShield();
                break;
            case CURVED:
                rainShield = new CurvedRainShield();
                break;
            default:
                rainShield = null;
                break;
        }
    }
    public void setRoof(RoofVar roof) {
        switch (roof) {
            case OPEN:
                this.roof = new OpenRoof();
                break;
            case CLOSED:
                this.roof = new ClosedRoof();
                break;
            default:
                this.roof = null;
                break;
        }
    }
}
