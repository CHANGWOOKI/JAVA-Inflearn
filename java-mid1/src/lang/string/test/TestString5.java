package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        // str에서 ext가 어디서 시작되는지
        int extIndex = str.indexOf(ext);
        // str에서 0번 인덱스 부터 extIndex 까지 잘라내기
        String filename = str.substring(0, extIndex);
        // extIndex 부터 끝까지 잘라내기
        String extname = str.substring(extIndex);

        System.out.println(filename);
        System.out.println(extname);
    }
}
