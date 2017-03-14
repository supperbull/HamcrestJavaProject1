package introductionHamcrest;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class KolkoKrzyzyk {

     //   private static char table[][] = {{' ', ' ', ' '},
     //           {' ', ' ', ' '},
     //           {' ', ' ', ' '}};
        public static boolean user_one = true;

       // private static Scanner input = new Scanner(System.in);

        /**
         * 1 dla wygranej pierwszego O
         * 2 dla wygranej drugiego X
         * 0 dla remisu
         * 3 błąd
         */
        public static int checkResult(char table[][]) {
                int zmienna=3;
                if ((table[0][0] == table[1][0] && table[1][0] == table[2][0] && table[2][0] != ' ') ||
                        (table[0][1] == table[1][1] && table[1][1] == table[2][1] && table[2][1] != ' ') ||
                        (table[0][2] == table[1][2] && table[1][2] == table[2][2] && table[2][2] != ' ') ||
                        (table[0][0] == table[0][1] && table[0][1] == table[0][2] && table[0][2] != ' ') ||
                        (table[1][0] == table[1][1] && table[1][1] == table[1][2] && table[1][2] != ' ') ||
                        (table[2][0] == table[2][1] && table[2][1] == table[2][2] && table[2][2] != ' ') ||
                        (table[0][0] == table[1][1] && table[1][1] == table[2][2] && table[2][2] != ' ') ||
                        (table[0][2] == table[1][1] && table[1][1] == table[2][0] && table[2][0] != ' ')) {
                        if (user_one) {
                                zmienna=1;
                        } else {
                                zmienna=2;
                        }
                        return zmienna;
                }
                if (table[0][0] != ' ' && table[1][0] != ' ' && table[2][0] != ' ' &&
                        table[0][1] != ' ' && table[1][1] != ' ' && table[2][1] != ' ' &&
                        table[0][2] != ' ' && table[1][2] != ' ' && table[2][2] != ' ') {
                        zmienna=0;
                        return zmienna;
                }
                return zmienna;
        }

        public static boolean user_oneMove(char table[][],String coord) {
                        if (coord.length() != 2) {
                                return false;
                        } else if (coord.charAt(0) != 'a' &&
                                coord.charAt(0) != 'b' &&
                                coord.charAt(0) != 'c') {
                                return false;
                        }  else if (coord.charAt(1) != '1' &&
                                coord.charAt(1) != '2' &&
                                coord.charAt(1) != '3') {
                                return false;
                        } else {
                                int a, b;
                                if (coord.charAt(0) == 'a') {
                                        a = 0;
                                } else if (coord.charAt(0) == 'b') {
                                        a = 1;
                                } else {
                                        a = 2;
                                }
                                if (coord.charAt(1) == '1') {
                                        b = 0;
                                } else if (coord.charAt(1) == '2') {
                                        b = 1;
                                } else {
                                        b = 2;
                                }
                                if (table[a][b] != ' ') {
                                        return false;
                                } else {
                                        table[a][b] = 'O';
                                        return true;
                                }
                        }
                }



        public static boolean user_twoMove(char table[][],String coord) {
                if (coord.length() != 2) {
                        return false;
                } else if (coord.charAt(0) != 'a' &&
                        coord.charAt(0) != 'b' &&
                        coord.charAt(0) != 'c') {
                        return false;
                }  else if (coord.charAt(1) != '1' &&
                        coord.charAt(1) != '2' &&
                        coord.charAt(1) != '3') {
                        return false;
                } else {
                        int a, b;
                        if (coord.charAt(0) == 'a') {
                                a = 0;
                        } else if (coord.charAt(0) == 'b') {
                                a = 1;
                        } else {
                                a = 2;
                        }
                        if (coord.charAt(1) == '1') {
                                b = 0;
                        } else if (coord.charAt(1) == '2') {
                                b = 1;
                        } else {
                                b = 2;
                        }
                        if (table[a][b] != ' ') {
                                return false;
                        } else {
                                table[a][b] = 'X';
                                return true;
                        }
                }
        }

/*
        private static void printTable() {
                System.out.println();
                System.out.println();
                System.out.println("    1 2 3");
                System.out.println("a   " + table[0][0]+ "|" + table[0][1]+ "|" + table[0][2]);
                System.out.println("b   " + table[1][0]+ "|" + table[1][1]+ "|" + table[1][2]);
                System.out.println("c   " + table[2][0]+ "|" + table[2][1]+ "|" + table[2][2]);

        }
        */
/*
        public static void main(String[] args) {

                while (!checkResult()) {
                        printTable();
                        if (user_one) {
                                user_oneMove();
                        } else {
                                user_twoMove();
                        }
                }
                printTable();
        }
*/

}
