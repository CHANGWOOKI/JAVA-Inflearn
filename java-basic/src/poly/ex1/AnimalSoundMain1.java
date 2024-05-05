package poly.ex1;

public class AnimalSoundMain1 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        // 배열로도 어려움
        // Caw[] cawArr= [dog, cat, caw];

        dog.sound();
        System.out.println("동물 테스트 시작 종료");
        System.out.println();

        System.out.println("동물 테스트 소리 시작");
        cat.sound();
        System.out.println("동물 테스트 시작 종료");
        System.out.println();

        System.out.println("동물 테스트 소리 시작");
        caw.sound();
        System.out.println("동물 테스트 시작 종료");
        System.out.println();

        soundCaw(caw);
    }
    
    // 메서드로 해결도 어려움
    private static void soundCaw(Caw caw) {
        System.out.println("동물 테스트 소리 시작");
        caw.sound();
        System.out.println("동물 테스트 시작 종료");
    }
}
