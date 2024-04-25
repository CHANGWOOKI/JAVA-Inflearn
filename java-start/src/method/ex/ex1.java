package method.ex;

public class ex1 {
    public static void main(String[] args) {
        printMessage("김창욱", 3);
    }


    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
