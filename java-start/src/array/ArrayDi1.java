package array;

public class ArrayDi1 {
    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };  // 행2, 열3

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
