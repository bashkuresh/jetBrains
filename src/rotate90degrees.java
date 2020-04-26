import java.util.Scanner;

public class rotate90degrees {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[][] matrix = new int[scanner.nextInt()][scanner.nextInt()];
            for (int i = 0; i < matrix.length; ++i) {
                for (int j = 0; j < matrix[i].length; ++j) {
                    matrix[i][j] = scanner.nextInt();
                }
            }

            for (int i = 0; i < matrix[0].length; ++i) {
                for (int j = 0; j < matrix.length; ++j) {
                    System.out.print(matrix[matrix.length - j - 1][i] + " ");
                }
                System.out.println();
            }
        }
    }
//Given a rectangle array n×m in size. Rotate it by 90 degrees clockwise, by recording the result into the new array m×n in size.
//
//Input data format
//
//Input the two numbers n and m, not exceeding 100, and then an array n×m in size.
