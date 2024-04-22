package cond.ex;

public class ScoreEx {
    public static void main(String[] args) {
        int grade = 85;

        if (grade >= 90) {
            System.out.println("A학점 입니다");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("B학점 입니다.");
        } else if (grade >= 80 && grade < 90) {
            System.out.println("B학점 입니다.");
        } else if (grade >= 70 && grade < 80) {
            System.out.println("C학점 입니다.");
        } else if (grade >= 60 && grade < 70) {
            System.out.println("D학점 입니다.");
        } else if (grade < 60) {
            System.out.println("F학점 입니다.");
        }
    }
}
