package poly.car1;

public class Model3 implements Car {
    @Override
    public void startEngine() {
        System.out.println("Model3.startEngine");
    }

    @Override
    public void endEngine() {
        System.out.println("Model3.endEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Model3.pressAccelerator");
    }
}
