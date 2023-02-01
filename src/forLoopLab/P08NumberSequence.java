package forLoopLab;

import java.util.Scanner;

/*Напишете програма, която чете n на брой цели числа.
Принтирайте най-голямото и най-малкото число сред въведените.*/
public class P08NumberSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); //1. задаваме колко числа ще приема програмата.

        int maxNumber = Integer.MIN_VALUE; //3.  Ако работим и с отрицателни числа, ще използваме това:
                                            //Така сме сигурни, че първото сравнение на първата итерация ще е с възможно най-малкото число.
                                            // int maxNumber = 0; //това ще сработи, ако работим само с положителни числа.
        int minNumber = Integer.MAX_VALUE; // 4. защо не обратмо мин и макс? todo

        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine()); //2. Въвеждаме толкова числа, колкото ни иска програмата

            if (currentNum > maxNumber) { //3. извеждаме логика за най-голямо число
                maxNumber = currentNum;
            }

            if (currentNum < minNumber) { //4. извеждаме логика за най-малко число
                minNumber = currentNum;
            }
        }

        //принтираме след фор цикъла:
        System.out.printf("Max number: %d\n", maxNumber); // %n = \n
        System.out.printf("Min number: %d\n", minNumber);

    }
}
