package poly.ex4;

public class Cat extends AbstractAnimal {
    @Override
    public void move() {
        System.out.println("고양이처럼 이동");
    }

    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
