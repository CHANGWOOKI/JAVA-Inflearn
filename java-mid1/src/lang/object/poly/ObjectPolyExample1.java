package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object object) {
        // 부모 객체는 인스턴스할 때 자식 클래스의 정보를 담고있지않음
        // 컴파일 오류
        // object.sound();
        // object.move();

        // 다운 캐스팅 하면 가능하다
        // object 에 instanceof 하면 Dog dog로 다운 캐스팅
        if (object instanceof Dog dog) {
            dog.sound();
        } else if (object instanceof Car car) {
            car.move();
        }
    }
}
