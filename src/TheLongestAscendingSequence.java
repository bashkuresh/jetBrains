//Write a program that reads an array of ints and outputs the length of the longest sequence in strictly ascending order.
// Elements of the sequence must go one after another. If the input consists of one number, the sequence is assumed to be ordered
// and its maximum length is 1.
//
//The first line contains the size of an array.
//The second line contains elements of the array separated by spaces.

import java.util.Scanner;

public class TheLongestAscendingSequence {
    public static void main ( String[] args ) {
            Scanner scanner = new Scanner (System.in);

            int a = scanner.nextInt ( ); // Кол-во символов в массиве
            int[] b = new int[a];
            int c = 0; // вспомогательное число для сравнения
            int d = 0; // cчетчик последовательности


            for (int i = 0; i < a; i++) {    // ввод данных в массив
                b[i] = scanner.nextInt ( );
            }

            for (int i1 : b) { // main loop

                if (i1 > c) {  // само сравнение чисел в массиве , сравниваемое число должно быть больше , чем вспомогательное
                    //
                    c = i1;
                    d++;


                }


            }
            System.out.println (d);
        }
    }


