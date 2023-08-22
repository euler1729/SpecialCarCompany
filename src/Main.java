import car.enumerators.AcVar;
import car.factories.AcFactory;
import car.interfaces.AC;

public class Main {
    public static void main(String[] args) {
        AC ac = new AcFactory().getInstance(AcVar.LOW);
        if(ac.getType()==AcVar.LOW){
            System.out.println("Low Ac");
        }
    }
}