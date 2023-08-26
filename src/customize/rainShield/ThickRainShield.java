package customize.rainShield;

import customize.enumerators.RainShieldVar;
import customize.interfaces.RainShield;

public class ThickRainShield implements RainShield {
    @Override
    public RainShieldVar type() {
        return RainShieldVar.THICK;
    }

    @Override
    public int price() {
        return 3;
    }
}
