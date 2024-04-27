package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        // student1
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 29;
        student1.grade = 90;

        // student2
        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 26;
        student2.grade = 80;

        // student1, student2 참조값을 students[] 에 주입
        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        //  출력
        for (int i = 0; i < students.length; i++) {
            System.out.println("이름:" + students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);

        }
    }
}
