package customize.rainShield;

import customize.enumerators.RainShieldVar;
import customize.interfaces.RainShield;

public class ThinRainShield implements RainShield {
    @Override
    public RainShieldVar type() {
        return RainShieldVar.THIN;
    }

    @Override
    public int price() {
        return 2;
    }
}
