/*import java.util.Scanner;

public class ArrOccurAnyOrder {

        public static void main(String[] args) {
            // put your code here
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int array[] = new int[n];

            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            boolean hasA = false;
            boolean hasB = false;

            for (int i : array) {
                if (i == a) {
                    hasA = true;
                }
                if (i == b) {
                    hasB = true;
                }
            }

            System.out.println(hasA && hasB);
        }
    }

*/
import java.util.Scanner;


public class ArrOccurAnyOrder {
    public static void main(String args[]) {
        final Scanner scanner = new Scanner(System.in);
        final int len = scanner.nextInt();

        final int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        final int n = scanner.nextInt();
        final int m = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == n && array[i + 1] == m) {
                found = true;
                break;
            }
            if (array[i] == m && array[i + 1] == n) {
                found = true;
                break;
            }
        }

        System.out.println(found);
    }
}