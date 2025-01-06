package factory;

import product.Engine;
import product.Tire;

public abstract class VehicleFactory {

    public abstract Engine createEngine();

    public abstract Tire createTire();
}
