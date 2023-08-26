package customize.gate;

import customize.enumerators.GateVar;
import customize.interfaces.GateControl;

public class MobileGate implements GateControl {
    @Override
    public GateVar type() {
        return GateVar.MOBILE;
    }
    @Override
    public int price() {
        return 2;
    }
}