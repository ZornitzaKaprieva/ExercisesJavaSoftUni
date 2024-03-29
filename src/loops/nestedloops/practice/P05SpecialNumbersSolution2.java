package loops.nestedloops.practice;

import java.util.Scanner;

/*Да се напише програма, която чете едно цяло число N, въведено от потребителя,
и генерира всички възможни "специални" числа от 1111 до 9999. За да бъде "специално" едно число,
то трябва да отговаря на следното условие:
•	N да се дели на всяка една от неговите цифри без остатък.
Пример: при N = 16, 2418 е специално число:
•	16 / 2 = 8 без остатък
•	16 / 4 = 4 без остатък
•	16 / 1 = 16 без остатък
•	16 / 8 = 2 без остатък
Вход
Входът се чете от конзолата и се състои от едно цяло число в интервала [1…600000]
Изход
На конзолата трябва да се отпечатат всички "специални" числа, разделени с интервал
Примерен вход1: 3
Примерен изход1: 1111 1113 1131 1133 1311 1313 1331 1333 3111 3113 3131 3133 3311 3313 3331 3333
Примерен вход2: 11
Примерен изход2: 1111*/

public class P05SpecialNumbersSolution2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        //слагаме 4 цикъла, защото по условие числата са ни 4-цифрени
        for (int i = 1; i <= 9; i++) { //проверяваме първата цифра от числото
            for (int j = 1; j <= 9 ; j++) { //проверяваме втората цифра от числото
                for (int k = 1; k <= 9 ; k++) { //проверяваме третата цифра от числото
                    for (int l = 1; l <= 9; l++) { //проверяваме четвъртата цифра от числото
                        if (number % i == 0 && number % j == 0 &&  number % k == 0 && number % l == 0){
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }
                    }
                }
            }
        }
    }
}
