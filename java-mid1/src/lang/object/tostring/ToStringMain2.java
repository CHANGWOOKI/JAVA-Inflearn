package lang.object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("k3");
        Dog dog = new Dog("멍멍이1", 25);

        // 1. 단순 toString 호출
        System.out.println(car.toString());
        System.out.println(dog.toString());

        // 2. println 에서 toString 호출
        System.out.println(car);
        System.out.println(dog);

        // 3. Object 다형성 활용
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog);

        // 4. toString 오버라이딩 됐을 때 참조값 확인 방법
        String reValue = Integer.toHexString(System.identityHashCode(dog));
        System.out.println("reValue : " + reValue);
    }
}
