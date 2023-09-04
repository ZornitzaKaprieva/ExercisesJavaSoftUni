package loops.nestedloops.exercises;

import java.util.Scanner;

/*Да се напише програма, която прочита едно цяло число N и генерира всички възможни "щастливи"
и различни 4-цифрени числа(всяка цифра от числото е в интервала [1...9]).
Числото трябва да отговаря на следните условия:
Щастливо число е 4-цифрено число, на което сбора от първите две цифри е равен на сбора от последните две.
Числото N трябва да се дели без остатък от сбора на първите две цифри на "щастливото" число.
Вход
Входът се чете от конзолата и се състои от едно цяло число в интервала [2...10000]
Изход
На конзолата трябва да се отпечатат всички "щастливи" и различни 4-цифрени числа, разделени с интервал*/

public class P03LuckyNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        String luckyNumbers = "";
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    for (int l = 1; l <= 9; l++) {
                        if ((i + j == k + l) && (num % (i + j) == 0)){
                                luckyNumbers += "" + i + j + k + l + " ";
                        }
                    }
                }
            }
        }

        System.out.println(luckyNumbers);
    }
}
