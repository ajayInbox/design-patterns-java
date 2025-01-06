package factory;

import product.Engine;
import product.Tire;
import product.CarEngine;
import product.CarTire;

public class CarFactory extends VehicleFactory{
    @Override
    public Engine createEngine() {
        return new CarEngine();
    }

    @Override
    public Tire createTire() {
        return new CarTire();
    }
}
