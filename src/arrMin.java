import java.util.Arrays;
import java.util.Scanner;

public class arrMin {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int arr[] =new int [scanner.nextInt()];
            int min = 100000;
            for (int i=0;i<arr.length;i++){
                arr[i]=scanner.nextInt();
                if (min>arr[i]){
                    min=arr[i];

                }
            }
        System.out.println(Arrays.toString(arr));
            System.out.println(min);


        }
    }

