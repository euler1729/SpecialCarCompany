package customize.bumper;

import customize.enumerators.BumperVar;
import customize.interfaces.Bumper;

public class BigBumper implements Bumper {
    @Override
    public BumperVar type() {
        return BumperVar.BIG;
    }

    @Override
    public int price() {
        return 2;
    }
}
