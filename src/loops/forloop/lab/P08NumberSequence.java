package loops.forloop.lab;

import java.util.Scanner;

/*Напишете програма, която чете n на брой цели числа.
Принтирайте най-голямото и най-малкото число сред въведените.*/

public class P08NumberSequence {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int maxNumber = Integer.MIN_VALUE; //int maxNumber = 0; //това ще сработи, ако работим само с положителни числа.
                                            //С Integer.MIN_VALUE сме сигурни, че първото сравнение на първата итерация ще е с възможно най-малкото число.
        int minNumber = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine()); //Въвеждаме толкова числа, колкото ни иска програмата

            if (currentNum > maxNumber) { //извеждаме логика за най-голямо число
                    maxNumber = currentNum;
            }

            if (currentNum < minNumber) { //извеждаме логика за най-малко число
                    minNumber = currentNum;
            }
        }

        //принтираме след фор цикъла:
        System.out.printf("Max number: %d\n", maxNumber); // %n = \n
        System.out.printf("Min number: %d\n", minNumber);
    }
}
