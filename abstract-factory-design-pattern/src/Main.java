import factory.CarFactory;
import factory.MotorFactory;
import factory.VehicleFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        VehicleFactory carFactoryfactory = new CarFactory();
        carFactoryfactory.createEngine().start();
        carFactoryfactory.createTire().roll();

        VehicleFactory motorFactory = new MotorFactory();
        motorFactory.createEngine().start();
        motorFactory.createTire().roll();
    }
}