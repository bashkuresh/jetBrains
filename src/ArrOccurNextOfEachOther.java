import java.util.Scanner;

public class ArrOccurNextOfEachOther {
    public static void main(String args[]) {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("inter lenghth");
        final int len = scanner.nextInt();

        final int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            System.out.println("inter elements");
            array[i] = scanner.nextInt();
        }
        System.out.println("inter n&m");
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();

        boolean neverOccur = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == n && array[i + 1] == m) {
                neverOccur = false;
                break;
            }
            if (array[i] == m && array[i + 1] == n) {
                neverOccur = false;
                break;
            }
        }

        System.out.println(neverOccur);
    }
}
