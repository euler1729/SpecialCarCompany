package car.autoAi;

import car.enumerators.Region;
import car.interfaces.AutoAI;

public class USABasedAI implements AutoAI {
    @Override
    public void autoDrive() {
        System.out.println("Auto Drive is available for USA based cars");
    }

    @Override
    public Region getType() {
        return Region.USA;
    }

    @Override
    public int getPrice() {
        return 2;
    }
}
