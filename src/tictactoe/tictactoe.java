package tictactoe;
import java.util.Scanner;

public class tictactoe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cells: ");
        String input = scanner.nextLine();
        char[] inputArr = new char[]{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        for (int i = 0; i < input.length(); i++) {
            char temp = input.charAt(i);
            if (temp == 'O' || temp == 'X' || temp == '_') {
                inputArr[i] = input.charAt(i);
            }
        }
        String start = "| ";
        String end = " |";

        System.out.println("---------");
        System.out.println(start + inputArr[0] + " " + inputArr[1] + " " + inputArr[2] + end);
        System.out.println(start + inputArr[3] + " " + inputArr[4] + " " + inputArr[5] + end);
        System.out.println(start + inputArr[6] + " " + inputArr[7] + " " + inputArr[8] + end);
        System.out.print("---------");
    }
}