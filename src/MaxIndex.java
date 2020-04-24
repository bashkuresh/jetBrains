
import java.util.Arrays;
import java.util.Scanner;

public class MaxIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[scanner.nextInt()];
        int maxIndex=array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if(maxIndex<array[i]){
                maxIndex=array[i];
                index = i;

            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(index);


    }

}
