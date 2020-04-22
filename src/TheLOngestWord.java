import java.util.Scanner;

class TheLOngestWord {
    public static void main(String[] args) {
        String[] str = new Scanner(System.in).nextLine().split(" ");
        int elem = 0;

        for (int i = 1; i < str.length; ++i) {
            if (str[i].length() > str[elem].length()) {
                elem = i;
            }
        }

        System.out.println(str[elem]);
    }
}
