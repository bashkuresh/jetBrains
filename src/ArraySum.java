import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inter length");
        int arr  =s.nextInt();
        int [] arrlen = new int[arr];
        int sum = 0;
        for (int i=0;i<arr;i++){
            arrlen[i]=s.nextInt();
            sum +=arrlen[i];
        }
       System.out.println(Arrays.toString(arrlen));
        System.out.println(sum);
    }
}
