import java.util.*;


public class shiftingToRight {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int arrlng = scanner.nextInt();
        final int[] A = new int[arrlng];
        for (int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
        }

        int a;
        for (int i = A.length - 1; i > 0; i--) {
            a = A[i];
            A[i] = A[i - 1];
            A[i - 1] = a;
        }

        for (int i : A) {
            System.out.print(i + " ");
        }
    }
}
