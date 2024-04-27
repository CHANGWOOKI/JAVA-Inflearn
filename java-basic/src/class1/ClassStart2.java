package class1;

public class ClassStart2 {
    public static void main(String[] args) {
        String[] studentsName = {"창욱", "수빈", "하늘"};
        int[] studentsAge = {29, 26, 14};
        int[] studentsGrade = {90, 80, 70};

        for (int i = 0; i < studentsName.length; i++) {
            System.out.println("이름 :" + studentsName[i] + " 나이 :" + studentsAge[i] + "  성적 :" + studentsGrade[i]);
        }
    }
}
