package array.ex;

public class ex1 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};
        int total = 0;
        double average = 0;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
            total += students[i];
        }

        average = (double) total / students.length;
        System.out.println(total);
        System.out.println(average);

    }
}
