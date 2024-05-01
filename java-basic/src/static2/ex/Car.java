package static2.ex;

public class Car {
    private String car;
    private static int totalCar;

    public Car(String car) {
        this.car = car;
        totalCar++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 : " + totalCar);
    }
}
