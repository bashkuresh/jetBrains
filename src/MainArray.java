import java.util.*;

public class MainArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numbers = new int[n];

        int count = 0;

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int check = scanner.nextInt();

        for (int num:numbers) {
            if (num == check) {
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }
        System.out.println(count);
    }
}
