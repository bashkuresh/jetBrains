import java.util.Scanner;

public class fillTheArrNumeric {

        public static void main(String[] args) {
            // put your code here
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(Math.abs(i - j) + " ");
                }
                System.out.println();
            }
        }
    }
    //Given the number n, not greater than 100. Create the matrix of size n×n and fill it by the following rule.
// Numbers 0 should be stored on the primary diagonal. The two diagonals, adjacent to the primary one, should contain numbers 1.
// The next two diagonals - numbers 2, etc.