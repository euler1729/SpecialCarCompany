package customize.gate;

import customize.enumerators.GateVar;
import customize.interfaces.GateControl;

public class RemoteGate implements GateControl {
    @Override
    public GateVar type() {
        return GateVar.REMOTE;
    }

    @Override
    public int price() {
        return 3;
    }
}
