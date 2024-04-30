package access.a;

public class AccessMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출
        data.publicField = 100;
        data.publicMethod();

        // default 호출
        data.defaultField = 100;
        data.defaultField();

        // private 호출
        // data.privateField = 100;
        // data.privateField();

        data.innerAccess();
    }
}
