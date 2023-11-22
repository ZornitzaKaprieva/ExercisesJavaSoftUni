package conditionalstatements.practice;


import java.util.Scanner;

/*Петър иска да купи N видеокарти, M процесора и P на брой рам памет.
Ако броя на видеокартите е по-голям от този на процесорите получава 15% отстъпка от крайната сметка.
Важат следните цени:
•	Видеокарта – 250 лв./бр.
•	Процесор – 35% от цената на закупените видеокарти/бр.
•	Рам памет – 10% от цената на закупените видеокарти/бр.
Да се изчисли нужната сума за закупуване на материалите и да се пресметне дали бюджета ще му стигне.
Вход
Входът се състои от четири реда:
1.	Бюджетът на Петър - реално число в интервала [0.0…100000.0]
2.	Броят видеокарти - цяло число в интервала [0…100]
3.	Броят процесори - цяло число в интервала [0…100]
4.	Броят рам памет - цяло число в интервала [0…100]
Изход
На конзолата се отпечатва 1 ред, който трябва да изглежда по следния начин:
•	Ако бюджета е достатъчен:
"You have {остатъчен бюджет} leva left!"
•	Ако сумата надхвърля бюджета:
"Not enough money! You need {нужна сума} leva more!"
Резултатът да се форматира до втория знак след десетичната запетая.
Примерен вход1: 900  2  1  3
Примерен изход1: You have 198.75 leva left!
Примерен вход2: 920.45  3  1  1
Примерен изход2:Not enough money! You need 3.92 leva more!*/

public class P07Shopping {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int numVideoCards = Integer.parseInt(scanner.nextLine());
        int numProcessor  = Integer.parseInt(scanner.nextLine());
        int numRam  = Integer.parseInt(scanner.nextLine());

        double sumVideoCards = numVideoCards * 250;
        double sumProcessor = numProcessor * (sumVideoCards * 0.35);
        double sumRam = numRam * (sumVideoCards * 0.1);
        double overallSum = sumVideoCards + sumProcessor + sumRam;
        if (numVideoCards > numProcessor) {
            overallSum = overallSum * 0.85;
        }
        double moneyLeft =  budget - overallSum;
        double neededMoney = Math.abs(budget - overallSum);

        if (budget >= overallSum){
            System.out.printf("You have %.2f leva left!", moneyLeft);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", neededMoney);
        }
    }
}
