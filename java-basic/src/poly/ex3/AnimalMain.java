package poly.ex3;


public class AnimalMain {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.move();
        cat.sound();
        System.out.println();

        dog.move();
        dog.sound();
        System.out.println();

        caw.move();
        caw.sound();
        System.out.println();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
        System.out.println();
    }
}
