package poly.car1;

public class NewCar implements Car {
    public void startEngine() {
        System.out.println("NewCar.startEngine");
    }

    @Override
    public void endEngine() {
        System.out.println("NewCar.endEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("NewCar.pressAccelerator");
    }
}
