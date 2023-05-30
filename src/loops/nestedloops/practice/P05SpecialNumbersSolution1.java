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
*/
public class P05SpecialNumbersSolution1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int currentNum = 1111; currentNum <= 9999; currentNum++) {

            int firstDigit = currentNum / 1000;
            int secondDigit = currentNum / 100 % 10;
            int thirdDigit = currentNum / 10 % 10;
            int fourthDigit = currentNum % 10;

            boolean checkFirstDigit = number % firstDigit == 0; //освен първото число, всички останали могат да бъдат 0
            boolean checkSecondDigit = secondDigit != 0 && number % secondDigit == 0;//тази проверка гарантира, че въведените числа не са равни на 0
            boolean checkThirdDigit = thirdDigit != 0 && number % thirdDigit == 0; //ноте! не можем да делим на 0
            boolean checkFourthDigit = fourthDigit != 0 && number % fourthDigit == 0;

        if (checkFirstDigit && checkSecondDigit && checkThirdDigit && checkFourthDigit){ //ако тази проверка е вярна, ние трябва да отпечатаме нашето число
            System.out.printf("%d ", currentNum);
        }
        }
    }
}
