import java.util.Scanner;

public class spiralArray {


        public static void main(String[] args) {

            int n = new Scanner(System.in).nextInt();
            int currRow = 0;
            int currCol = 0;
            double directionAngle = 0;
            int rowDirection = 0;
            int colDirection = 1;
            int stepsCount = n;
            int stepsRemain = stepsCount;
            int changeStepsCount = 0;
            int currNum = 0;
            int[][] spiral = new int[n][n];

            while (stepsCount > 0) {
                currNum++;
                spiral[currRow][currCol] = currNum;
                stepsRemain--;
                if (0 == stepsRemain) {
                    directionAngle += Math.PI / 2;
                    rowDirection = (int) Math.round(Math.sin(directionAngle));
                    colDirection = (int) Math.round(Math.cos(directionAngle));
                    changeStepsCount = 1 - changeStepsCount;
                    if (1 == changeStepsCount) {
                        stepsCount--;
                    }
                    stepsRemain = stepsCount;
                }
                currRow += rowDirection;
                currCol += colDirection;
            }

            for (int[] row : spiral) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }
    }


