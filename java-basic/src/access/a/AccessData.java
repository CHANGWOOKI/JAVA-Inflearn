package access.a;

public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod");
    }

    void defaultField() {
        System.out.println("defaultField");
    }

    private void privateField() {
        System.out.println("privateField");
    }

    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 100;
        privateField = 100;
        publicMethod();
        defaultField();
        privateField();
    }
}
