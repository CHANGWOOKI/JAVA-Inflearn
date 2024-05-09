package lang.object.poly;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object();   // Object 인스턴스도 만들 수 있다.
        // Object 객체를 생성해 모든 클래스를 담을 수 있다.
        Object[] objects = {dog, car, object};

        size(objects);
    }
    // 매게 변수가 Object 이므로 어떤 프로그램에도 사용가능하다.
    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수 : " + objects.length);
    }
}