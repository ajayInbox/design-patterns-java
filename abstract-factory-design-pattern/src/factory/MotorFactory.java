package factory;

import product.Engine;
import product.Tire;
import product.MotorEngine;
import product.MotorTire;

public class MotorFactory extends VehicleFactory{
    @Override
    public Engine createEngine() {
        return new MotorEngine();
    }

    @Override
    public Tire createTire() {
        return new MotorTire();
    }
}
