package extends1.access.parent;

public class Parent {

    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    private void privateMethod() {
        System.out.println("privateMethod");
    }

    void defaultMethod() {
        System.out.println("defaultMethod");
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod");
    }

    public void publicMethod() {
        System.out.println("publicMethod");
    }

    public void printParent() {
        System.out.println("==Parent 메서드 안==");
        System.out.println(publicValue);
        System.out.println(protectedValue);
        System.out.println(defaultValue);
        System.out.println(privateValue);

        // 부모 메서드 안에서 호출
        defaultMethod();
        privateMethod();
    }
} 
