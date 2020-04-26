import java.util.Scanner;

public class starFigure {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            String[][] matrix = new String[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = ".";
                }
            }
            for (int i = 0, j = 0; i < n; i++, j++) {
                matrix[i][j] = "*";
            }
            for (int i = 0, j = n - 1; i < n; i++, j--) {
                matrix[i][j] = "*";
            }
            for (int i = 0, j = n / 2; i < n; i++) {
                matrix[i][j] = "*";
            }
            for (int i = n / 2, j = 0; j < n; j++) {
                matrix[i][j] = "*";
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
//Given an odd number n, not exceeding 15. Create a two-dimensional array (matrix) from n×n elements,
// by filling it with "." symbols (each element of the matrix is a string containing a single symbol).
// Then fill the middle row of the matrix, the middle column, and the main and the secondary diagonals with the "*" symbols.
// As a result, all "*"s in the array must form the star figure. Output this matrix; elements of the array should be space separated.
