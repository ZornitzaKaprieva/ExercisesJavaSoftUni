package loops.whileloop.exercises;

import java.util.Scanner;

/*Гошо работи в ресторант и отговаря за зареждането на съдомиялната накрая на деня.
Вашата задача е да напишете програма, която изчислява,
дали дадено закупено количество бутилки от препарат за съдомиялна е достатъчно, за да измие определено количество съдове.
Знае се, че всяка бутилка съдържа 750 мл. препарат, за 1 чиния са нужни 5 мл., а за тенджера 15 мл.  Приемете, че на всяко трето зареждане със съдове, съдомиялната се пълни само с тенджери, а останалите пъти с чинии. Докато не получите команда "End" ще продължите да получавате бройка съдове, които трябва да бъдат измити.
Вход
От конзолата се четат:
•	Брой бутилки от препарат, който ще бъде използван за миенето на чинии - цяло число в интервала [1…10]
На всеки следващ ред, до получаване на командата "End" или докато количеството препарат не се изчерпи, брой съдове,
които трябва да бъдат измити - цяло число в интервала [1…100]
Изход
В случай, че количеството препарат е било достатъчно за измиването на съдовете:
"Detergent was enough!"
"{брой чисти чинии} dishes and {брой чисти тенджери} pots were washed."
"Leftover detergent {количество останал препарат} ml."
В случай, че количеството препарат не е било достатъчно за измиването на съдовете:
"Not enough detergent, {количество не достигнал препарат} ml. more necessary!"*/

public class P01Dishwasher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int bottlesDetergentWillUsed = Integer.parseInt(scanner.nextLine());//Брой бутилки от препарат, който ще бъде използван за миенето на чинии - цяло число.
        double  amountDetergent = bottlesDetergentWillUsed * 750.0; //препарат в мл.

        String numberDishes = scanner.nextLine();

        int counterPlate = 0;
        int counterPot = 0;
        int charge  = 1;
        double detergentUsed = 0;
        boolean isFinish = false;

        while (!numberDishes.equals("End")) {
            int currentNumberDishes =  Integer.parseInt(numberDishes);

            if (charge % 3 == 0) {
                counterPot += currentNumberDishes;
                detergentUsed += currentNumberDishes * 15;

            } else {
                counterPlate += currentNumberDishes;
                detergentUsed += currentNumberDishes * 5;
            }

            if (amountDetergent < detergentUsed) {
                isFinish = true;
                break;
            }

            charge++;
            numberDishes = scanner.nextLine();
        }

        double diff = Math.abs(amountDetergent - detergentUsed);
        if (!isFinish) {
            System.out.printf("Detergent was enough!\n" +
                    "%d dishes and %d pots were washed.\n" +
                    "Leftover detergent %.0f ml.\n", counterPlate, counterPot, diff);
        } else {
            System.out.printf("Not enough detergent, %.0f ml. more necessary!", diff);
        }
    }
}

