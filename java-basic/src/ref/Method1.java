package ref;

public class Method1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        initStudent(s1, "김창욱", 29, 90);

        Student s2 = new Student();
        initStudent(s2, "신수빈", 26, 80);

        printStudent(s1);
        printStudent(s2);
    }

    public static void initStudent(Student s, String name, int age, int grade) {
        s.name = name;
        s.age = age;
        s.grade = grade;
    }

    // 학생 출력 메서드
    public static void printStudent(Student s) {
        System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적" + s.grade);
    }
}