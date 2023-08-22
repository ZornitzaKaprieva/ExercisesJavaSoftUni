package loops.forloop.exercises;

import java.util.Scanner;

/*Иванчо е на 18 години и получава наследство, което се състои от X сума пари и машина на времето.
Той решава да се върне до 1800 година, но не знае дали парите ще са достатъчни, за да живее без да работи.
Напишете програма, която пресмята, дали Иванчо ще има достатъчно пари, за да не се налага да работи до дадена година включително.
Като приемем, че за всяка четна (1800, 1802 и т.н.) година ще харчи 12 000 лева.
За всяка нечетна (1801, 1803  и т.н.) ще харчи 12 000 + 50 * [годините, които е навършил през дадената година].
Вход
Входът се чете от конзолата и съдържа точно 2 реда:
•	Наследените пари – реално число в интервала [1.00 ... 1 000 000.00]
•	Годината, до която трябва да живее (включително) – цяло число в интервала [1801 ... 1900]
Изход
Да се отпечата на конзолата 1 ред. Сумата трябва да е форматирана до два знака след десетичната запетая:
•	Ако парите са достатъчно:
o	"Yes! He will live a carefree life and will have {N} dollars left." – където N са парите, които ще му останат.
•	Ако парите НЕ са достатъчно:
o	"He will need {М} dollars to survive." – където M е сумата, която НЕ достига.*/

public class P01BackToThePast {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double inheritedMoney = Double.parseDouble(scanner.nextLine());
        int year = Integer.parseInt(scanner.nextLine());

        double spentMoney = 0;
        double age = 18;

        for (int i = 1800; i <= year; i++){

            if (i % 2 == 0){
                spentMoney += 12000;
            } else {
                spentMoney += 12000 + 50 * age;
            }

            age++;
        }

        double diff = Math.abs(inheritedMoney - spentMoney);

        if(inheritedMoney >= spentMoney){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", diff);
        }else{
            System.out.printf("He will need %.2f dollars to survive.", diff);
        }
    }
}
