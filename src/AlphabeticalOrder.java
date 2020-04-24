import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticalOrder {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //System.out.println("add");
            String[] arr = scanner.nextLine().split(" ");
            String[] temp = arr.clone();
            Arrays.sort(arr);
            System.out.println(Arrays.equals(arr, temp));
        }
    }


