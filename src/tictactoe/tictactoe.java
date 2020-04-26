package tictactoe;     //при сдаче добавить

import java.util.Scanner;

public class tictactoe { // При сдаче замеить на Main
    private static int SIZE = 3;
    private static char[][] map = new char[SIZE][SIZE];
    private static final char DOT_EMPTY = '_';  // Пустой символ
    private static final char DOT_X = 'X';      // Символ Х
    private static final char DOT_O = 'O';      // Символ О

    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Сама игра здесь
     *
     */

    public static void main(String[] args) {
        initMap();
        if(GameNotFinished() && !checkWinO() && !checkWinX() && !impossible()){
            System.out.println("Game not finished");
        }
        if(!GameNotFinished() && !checkWinO() && !checkWinX()) {
            System.out.println("Draw");
        }
        if(checkWinX() && !checkWinO()){
            System.out.println("X wins");
        }
        if(checkWinO() && !checkWinX()){
            System.out.println("O wins");
        }
        if( (GameNotFinished() && impossible()) || (checkWinO() && checkWinX())){
            System.out.println("Impossible");
        }


    }

    /**
     * Печатаем игровое поле
     */
    private static void initMap(){
        String cells;
        cells = scanner.next();
        char[] inputMap = cells.toCharArray();
        int inputMapCount = 0;
        for (int i = 0; i < SIZE; i++) {
            for(int j = 0; j < SIZE; j++) {
                map[i][j] = inputMap[inputMapCount];
                inputMapCount++;
            }
        }
        System.out.println("---------");
        for(int i = 0; i < SIZE; i++){
            System.out.print("| ");
            for (int j = 0; j < SIZE; j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    /**
     * Закончена ли игра
     *
     */
    private static boolean GameNotFinished() {
        boolean GameNotFinish = false;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    GameNotFinish = true;
                    return GameNotFinish;

                }
            }
        }
        return GameNotFinish;
    }

    /**
     * Проверим на выигрыш O
     *
     */
    private static boolean checkWinO(){
        boolean winO = false;
        // Создадим переменные контроля выигрыша по строкам, столбцам и двум диагоналям
        int stringWin = 0, rawWin = 0, diagOneWin = 0, diagTwoWin = 0;

        // Создаем двойной цикл обхода всех клеток нашего поля для контроля выигрышной ситуации
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                if(map[i][j] == DOT_O){ // Если в строке есть символ проверяемого игрока - счетчик контроля +1
                    stringWin++;
                }
                if (map[j][i] == DOT_O){ // Если в столбце есть символ проверяемого игрока - счетчик контроля +1
                    rawWin++;
                }
            }
            if (map[i][i] == DOT_O){ // Если в одной диагонали есть символ игрока - счетчик контроля +1
                diagOneWin++;
            }
            if (map[i][(SIZE-1) - i] == DOT_O){ // Если в другой диагонали есть символ игрока - счечик +1
                diagTwoWin++;
            }
            if (stringWin == SIZE || rawWin == SIZE){ // По строкам есть столько совпадений, сколько задан SIZE?
                winO = true;                        // Если да - то возвращаем true
                break;
            } else {                                  // Если нет - обнуляем переменные контроля и продолжаем цикл
                stringWin = 0;
                rawWin = 0;
            }
        }
        if (diagOneWin == SIZE || diagTwoWin == SIZE){ // По диагонали есть столько совпадений сколько задан SIZE?
            winO = true;                             // Если да - то возвращаем true
            return winO;
        }
        return winO;                                  // Если ничего в циклах не нашлось - возвращаем что было, false
    }

    /**
     * Проверим на выигрыш X
     */
    private static boolean checkWinX(){
        boolean winX = false;
        // Создадим переменные контроля выигрыша по строкам, столбцам и двум диагоналям
        int stringWin = 0, rawWin = 0, diagOneWin = 0, diagTwoWin = 0;

        // Создаем двойной цикл обхода всех клеток нашего поля для контроля выигрышной ситуации
        for(int i = 0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                if(map[i][j] == DOT_X){ // Если в строке есть символ проверяемого игрока - счетчик контроля +1
                    stringWin++;
                }
                if (map[j][i] == DOT_X){ // Если в столбце есть символ проверяемого игрока - счетчик контроля +1
                    rawWin++;
                }
            }
            if (map[i][i] == DOT_X){ // Если в одной диагонали есть символ игрока - счетчик контроля +1
                diagOneWin++;
            }
            if (map[i][(SIZE-1) - i] == DOT_X){ // Если в другой диагонали есть символ игрока - счечик +1
                diagTwoWin++;
            }
            if (stringWin == SIZE || rawWin == SIZE){ // По строкам есть столько совпадений, сколько задан SIZE?
                winX = true;                        // Если да - то возвращаем true
                break;
            } else {                                  // Если нет - обнуляем переменные контроля и продолжаем цикл
                stringWin = 0;
                rawWin = 0;
            }
        }
        if (diagOneWin == SIZE || diagTwoWin == SIZE){ // По диагонали есть столько совпадений сколько задан SIZE?
            winX = true;                             // Если да - то возвращаем true
            return winX;
        }
        return winX;                                  // Если ничего в циклах не нашлось - возвращаем что было, false
    }

    /**
     * Проверяем невозможности
     *
     */
    public static boolean impossible() {
        int countX = 0;
        int countO = 0;
        if (checkWinX() && checkWinO()) {
            return true;
        } else {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_X) {
                        countX++;
                    }
                    if (map[i][j] == DOT_O) {
                        countO++;
                    }
                }
            }
            return Math.abs(countO - countX) > 1;
        }

    }
}