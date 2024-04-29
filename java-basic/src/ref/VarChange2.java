package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.value = 20;
        Data d2 = d1;

        System.out.println("d1 참조값 : " + d1);
        System.out.println("d2 참조값 : " + d2);
        System.out.println("d1.value : " + d1.value);
        System.out.println("d2.value : " + d2.value);

        // d1 변경
        d1.value = 20;
        System.out.println("변경 된 d1.value : 20");
        System.out.println("d1.value : " + d1.value);
        System.out.println("d2.value : " + d2.value);

        // d2 변경
        d2.value = 30;
        System.out.println("변경 된 d1.value : 20");
        System.out.println("d1.value : " + d1.value);
        System.out.println("d2.value : " + d2.value);

    }
}
