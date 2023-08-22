package car.autoAi;

import car.enumerators.Region;
import car.interfaces.AutoAI;

public class AsiaBasedAI implements AutoAI {
    @Override
    public void autoDrive() {
        System.out.println("Auto Drive is available for Asia based cars");
    }

    @Override
    public Region getType() {
        return Region.ASIA;
    }

    @Override
    public int getPrice() {
        return 1;
    }
}
