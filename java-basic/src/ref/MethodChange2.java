package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.value = 10;
        System.out.println("메서드 호출 전 d1.value : " + d1.value);
        changeReference(d1);
        System.out.println("메서드 호출 후 d1.value : " + d1.value);
    }

    public static void changeReference(Data dx) {
        dx.value = 20;
    }
}
