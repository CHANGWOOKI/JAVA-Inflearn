package class1;

public class ClassStart5 {
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
        Student[] students = {student1, student2};

        //  출력
       /*  방법 1
       or (int i = 0; i < students.length; i++) {
            System.out.println("이름:" + students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);

        }*/
       /*  방법 2
       for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);

        }*/

        for (Student s : students) {    // 단축키 iter
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
    }
}
