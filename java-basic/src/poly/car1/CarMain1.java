package poly.car1;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        // 차량 선택(k3)
        K3 k3 = new K3();
        driver.setCar(k3);
        driver.driver();

        // 차량 변경
        Model3 model3 = new Model3();
        driver.setCar(model3);
        driver.driver();

        // 차량 변경
        NewCar newCar = new NewCar();
        driver.setCar(newCar);
        driver.driver();

    }
}
