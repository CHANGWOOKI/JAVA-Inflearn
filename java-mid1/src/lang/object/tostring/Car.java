package lang.object.tostring;

public class Car {
    private String carName;

    public Car() {
    }

    public Car(String carName) {
        this.carName = carName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                '}';
    }
}