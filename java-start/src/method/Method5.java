package method;

public class Method5 {
    public static void main(String[] args) {
        checkAge(20);


    }

    public static void checkAge(int age) {
        if (age >= 18) {
            System.out.println("입장하세요");
        } else {
            System.out.println("미성년자는 입장이 불가합니다.");
        }
    }


}
