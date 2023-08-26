package customize.rainShield;

import customize.enumerators.RainShieldVar;
import customize.interfaces.RainShield;

public class CurvedRainShield implements RainShield {
    @Override
    public RainShieldVar type() {
        return RainShieldVar.CURVED;
    }

    @Override
    public int price() {
        return 2;
    }
}
