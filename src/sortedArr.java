import java.util.Scanner;

public class sortedArr {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int numValues = scanner.nextInt();
            boolean isSorted = true;
            int prev = scanner.nextInt();

            for (int i = 1; i < numValues; i++) {
                int value = scanner.nextInt();
                if (value < prev) {
                    isSorted = false;
                    break;
                }
                prev = value;
            }
            System.out.println(isSorted);
        }
    }
