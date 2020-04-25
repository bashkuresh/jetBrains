import java.util.Scanner;

public class twooDimentArr1 {


        public static void main(String[] args) {
            final Scanner scanner = new Scanner(System.in);

            final int n = scanner.nextInt();
            final int m = scanner.nextInt();
            final int[][] matrix = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            final int firstColumn = scanner.nextInt();
            final int secondColumn = scanner.nextInt();

            for (int i = 0; i < matrix.length; i++) {
                final int tmp = matrix[i][firstColumn];
                matrix[i][firstColumn] = matrix[i][secondColumn];
                matrix[i][secondColumn] = tmp;
            }

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
}
//Given a two-dimensional array (matrix) and the two numbers: i and j. Swap the columns with indexes i and j within the matrix.
//
//Input contains matrix dimensions n and m, not exceeding 100, then the elements of the matrix, then the indexes i and j.