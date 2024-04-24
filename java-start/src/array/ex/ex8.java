package array.ex;

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentCount = 0;
        System.out.println("학생 수를 입력하세요.");
        studentCount = scanner.nextInt();

        int[][] scores = new int[studentCount][3];
        String[] subjects = {"국어", "영어", "수학"};


        for (int i = 0; i < studentCount; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요.");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(subjects[j] + "점수 : ");
                scores[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < studentCount; i++) {
            int sum = 0;
            double average = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            average = (double) sum / scores[i].length;
            System.out.println((i + 1) + "번 학생 총 점수 : " + sum + " , 평균 : " + average);
        }
    }
}
