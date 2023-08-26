package customize.bumper;

import customize.enumerators.BumperVar;
import customize.interfaces.Bumper;

public class SmallBumper implements Bumper {
    @Override
    public BumperVar type() {
        return BumperVar.SMALL;
    }

    @Override
    public int price() {
        return 1;
    }
}
