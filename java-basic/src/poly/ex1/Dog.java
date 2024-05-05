package poly.ex1;

public class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("동물 테스트 소리 시작");
        System.out.println("멍멍");
        System.out.println("동물 테스트 소리 종료");
    }
}
